package co.edu.ucatolica.hexa.application.ports.input;

import co.edu.ucatolica.hexa.domain.model.IronSalida;

import java.util.List;

public interface GetAllIronSalidaUseCase {

    List<IronSalida> getAll();
}
