package co.edu.ucatolica.hexa.application.ports.output;

import co.edu.ucatolica.hexa.domain.model.IronLlegada;

import java.util.List;
import java.util.Optional;

public interface IronLlegadaOutputPort {
    IronLlegada saveIronLlegada(IronLlegada ironLlegada);
    Optional <IronLlegada> getIronLlegadaById(Long id);
    List<IronLlegada> getAll();
    boolean deleteById(Long id);




}
