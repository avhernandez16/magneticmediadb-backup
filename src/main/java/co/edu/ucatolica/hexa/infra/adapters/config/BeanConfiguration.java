package co.edu.ucatolica.hexa.infra.adapters.config;

import co.edu.ucatolica.hexa.domain.service.IronLlegadaService;
import co.edu.ucatolica.hexa.domain.service.IronSalidaService;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.IronLlegadaPersistenceAdapter;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.IronSalidaPersistenceAdapter;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.IronLlegadaPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.IronSalidaPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.IronLlegadaRepository;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.IronSalidaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public IronSalidaPersistenceAdapter ironSalidaPersistenceAdapter(IronSalidaRepository ironSalidaRepository, IronSalidaPersistenceMapper ironSalidaPersistenceMapper){
        return new IronSalidaPersistenceAdapter(ironSalidaRepository, ironSalidaPersistenceMapper);
    }

    @Bean
    public IronSalidaService ironSalidaService(IronSalidaPersistenceAdapter ironSalidaPersistenceAdapter){
        return new IronSalidaService(ironSalidaPersistenceAdapter);
    }

    @Bean
    public IronLlegadaPersistenceAdapter ironLlegadaPersistenceAdapter(IronLlegadaRepository ironLlegadaRepository, IronLlegadaPersistenceMapper ironLlegadaPersistenceMapper){
        return new IronLlegadaPersistenceAdapter(ironLlegadaRepository, ironLlegadaPersistenceMapper);
    }

    @Bean
    public IronLlegadaService ironLlegadaService(IronLlegadaPersistenceAdapter ironLlegadaPersistenceAdapter){
        return new IronLlegadaService(ironLlegadaPersistenceAdapter);
    }


}
