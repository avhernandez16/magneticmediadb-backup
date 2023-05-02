package co.edu.ucatolica.hexa.infra.adapters.output.persistence;

import co.edu.ucatolica.hexa.application.ports.output.IronSalidaOutputPort;
import co.edu.ucatolica.hexa.domain.model.IronSalida;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.IronSalidaEntity;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.IronSalidaPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.IronSalidaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class IronSalidaPersistenceAdapter implements IronSalidaOutputPort {

    private final IronSalidaRepository ironSalidaRepository;
    private final IronSalidaPersistenceMapper ironSalidaPersistenceMapper;
    @Override
    public IronSalida saveIronSalida(IronSalida ironSalida) {
        IronSalidaEntity ironSalidaEntity = ironSalidaPersistenceMapper.toIronSalidaEntity(ironSalida);
        ironSalidaEntity = ironSalidaRepository.save(ironSalidaEntity);
        return ironSalidaPersistenceMapper.toIronSalida(ironSalidaEntity);
    }

    @Override
    public Optional<IronSalida> getIronSalidaById(Long id) {
        Optional<IronSalidaEntity> ironSalidaEntity = ironSalidaRepository.findById(id);
        if(ironSalidaEntity.isEmpty()){
            return Optional.empty();
        }
        IronSalida ironSalida = ironSalidaPersistenceMapper.toIronSalida(ironSalidaEntity.get());
        return Optional.of(ironSalida);
    }

    @Override
    public List<IronSalida> getAll() {
        return ironSalidaPersistenceMapper.EntitiesToIronSalida(ironSalidaRepository.findAll());
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
