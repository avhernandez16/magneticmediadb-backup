package co.edu.ucatolica.hexa.infra.adapters.output.persistence;

import co.edu.ucatolica.hexa.application.ports.output.IronLlegadaOutputPort;
import co.edu.ucatolica.hexa.domain.model.IronLlegada;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.IronLlegadaEntity;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper.IronLlegadaPersistenceMapper;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository.IronLlegadaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class IronLlegadaPersistenceAdapter implements IronLlegadaOutputPort {

    private final IronLlegadaRepository ironLlegadaRepository;
    private final IronLlegadaPersistenceMapper ironLlegadaPersistenceMapper;
    @Override
    public IronLlegada saveIronLlegada(IronLlegada ironLlegada) {
        IronLlegadaEntity ironLlegadaEntity = ironLlegadaPersistenceMapper.toIronLlegadaEntity(ironLlegada);
        ironLlegadaEntity = ironLlegadaRepository.save(ironLlegadaEntity);
        return ironLlegadaPersistenceMapper.toIronLlegada(ironLlegadaEntity);
    }

    @Override
    public Optional<IronLlegada> getIronLlegadaById(Long id) {
        Optional<IronLlegadaEntity> ironLlegadaEntity = ironLlegadaRepository.findById(id);
        if(ironLlegadaEntity.isEmpty()){
            return Optional.empty();
        }
        IronLlegada ironLlegada = ironLlegadaPersistenceMapper.toIronLlegada(ironLlegadaEntity.get());
        return Optional.of(ironLlegada);
    }

    @Override
    public List<IronLlegada> getAll() {
        return ironLlegadaPersistenceMapper.EntitiesToIronLlegada(ironLlegadaRepository.findAll());
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
