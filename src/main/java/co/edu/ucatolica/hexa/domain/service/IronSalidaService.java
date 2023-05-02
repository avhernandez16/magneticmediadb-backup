package co.edu.ucatolica.hexa.domain.service;

import co.edu.ucatolica.hexa.application.ports.input.CreateIronSalidaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.DeleteIronSalidaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllIronSalidaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetIronSalidaUseCase;
import co.edu.ucatolica.hexa.application.ports.output.IronSalidaOutputPort;
import co.edu.ucatolica.hexa.domain.exceptions.IronSalidaNotFoundException;
import co.edu.ucatolica.hexa.domain.model.IronSalida;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class IronSalidaService implements CreateIronSalidaUseCase, GetIronSalidaUseCase, GetAllIronSalidaUseCase, DeleteIronSalidaUseCase {
    private final IronSalidaOutputPort ironSalidaOutputPort;

    @Override
    public IronSalida createIronSalida(IronSalida ironSalida){
        ironSalida = ironSalidaOutputPort.saveIronSalida(ironSalida);
        return ironSalida;
    }

    @Override
    public IronSalida getIronSalidaById(Long id) {
        return ironSalidaOutputPort.getIronSalidaById(id).orElseThrow(() -> new IronSalidaNotFoundException("Iron Salida no registrado para el id" + id));
    }

    @Override
    public List<IronSalida> getAll() {
        return ironSalidaOutputPort.getAll();
    }

    @Override
    public boolean deleteIronSalida(Long id) {
        return ironSalidaOutputPort.deleteById(id);
    }



}
