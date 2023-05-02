package co.edu.ucatolica.hexa.infra.adapters.output.persistence.mapper;

import co.edu.ucatolica.hexa.domain.model.IronSalida;
import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.IronSalidaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IronSalidaPersistenceMapper {
    IronSalidaPersistenceMapper INSTANCE = Mappers.getMapper(IronSalidaPersistenceMapper.class);

    // si los campos no tienen lo mismos nombres se debe realizar explicitamente
    //@Mapping(source = "product.nombre", target = "nombreProducto")
    IronSalidaEntity toIronSalidaEntity(IronSalida ironSalida);
    IronSalida toIronSalida(IronSalidaEntity ironSalidaEntity);
    List<IronSalida> EntitiesToIronSalida(List<IronSalidaEntity> ironSalidaEntities);

}
