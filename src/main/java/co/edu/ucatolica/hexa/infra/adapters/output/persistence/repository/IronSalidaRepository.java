package co.edu.ucatolica.hexa.infra.adapters.output.persistence.repository;

import co.edu.ucatolica.hexa.infra.adapters.output.persistence.entity.IronSalidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IronSalidaRepository extends JpaRepository<IronSalidaEntity, Long> {
}
