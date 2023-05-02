package co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper;

import co.edu.ucatolica.hexa.domain.model.IronLlegada;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.IronLlegadaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IronLlegadaPersistenceMapper {
    IronLlegadaPersistenceMapper INSTANCE = Mappers.getMapper(IronLlegadaPersistenceMapper.class);

    // si los campos no tienen lo mismos nombres se debe realizar explicitamente
    //@Mapping(source = "product.nombre", target = "nombreProducto")
    IronLlegadaEntity toIronLlegadaEntity(IronLlegada ironLlegada);
    IronLlegada toIronLlegada(IronLlegadaEntity ironLlegadaEntity);
    List<IronLlegada> EntitiesToIronLlegada(List<IronLlegadaEntity> ironLlegadaEntities);

}
