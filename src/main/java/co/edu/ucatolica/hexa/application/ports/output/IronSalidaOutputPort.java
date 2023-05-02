package co.edu.ucatolica.hexa.application.ports.output;

import co.edu.ucatolica.hexa.domain.model.IronSalida;

import java.util.List;
import java.util.Optional;

public interface IronSalidaOutputPort {
    IronSalida saveIronSalida(IronSalida ironSalida);
    Optional <IronSalida> getIronSalidaById(Long id);
    List<IronSalida> getAll();
    boolean deleteById(Long id);




}
