package co.edu.ucatolica.hexa.application.ports.input;

import co.edu.ucatolica.hexa.domain.model.IronSalida;

public interface GetIronSalidaUseCase {
    IronSalida getIronSalidaById(Long id);
}
