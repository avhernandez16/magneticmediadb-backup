package co.edu.ucatolica.hexa.application.ports.input;

import co.edu.ucatolica.hexa.domain.model.IronLlegada;

import java.util.List;

public interface GetAllIronLlegadaUseCase {

    List<IronLlegada> getAll();
}
