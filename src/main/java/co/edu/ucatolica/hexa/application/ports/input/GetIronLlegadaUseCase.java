package co.edu.ucatolica.hexa.application.ports.input;


import co.edu.ucatolica.hexa.domain.model.IronLlegada;

public interface GetIronLlegadaUseCase {
    IronLlegada getIronLlegadaById(Long id);
}
