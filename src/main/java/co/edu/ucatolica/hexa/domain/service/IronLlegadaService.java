package co.edu.ucatolica.hexa.domain.service;

import co.edu.ucatolica.hexa.application.ports.input.CreateIronLlegadaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.DeleteIronLlegadaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetAllIronLlegadaUseCase;
import co.edu.ucatolica.hexa.application.ports.input.GetIronLlegadaUseCase;
import co.edu.ucatolica.hexa.application.ports.output.IronLlegadaOutputPort;
import co.edu.ucatolica.hexa.domain.exceptions.IronLlegadaNotFoundException;
import co.edu.ucatolica.hexa.domain.exceptions.IronSalidaNotFoundException;
import co.edu.ucatolica.hexa.domain.model.IronLlegada;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class IronLlegadaService implements CreateIronLlegadaUseCase, GetIronLlegadaUseCase, GetAllIronLlegadaUseCase, DeleteIronLlegadaUseCase {
    private final IronLlegadaOutputPort ironLlegadaOutputPort;

    @Override
    public IronLlegada createIronLlegada(IronLlegada ironLlegada){
        ironLlegada = ironLlegadaOutputPort.saveIronLlegada(ironLlegada);
        return ironLlegada;
    }

    @Override
    public IronLlegada getIronLlegadaById(Long id) {
        return ironLlegadaOutputPort.getIronLlegadaById(id).orElseThrow(() -> new IronLlegadaNotFoundException("Iron Llegada no registrado para el id" + id));
    }

    @Override
    public List<IronLlegada> getAll() {
        return ironLlegadaOutputPort.getAll();
    }

    @Override
    public boolean deleteIronLlegada(Long id) {
        return ironLlegadaOutputPort.deleteById(id);
    }



}
