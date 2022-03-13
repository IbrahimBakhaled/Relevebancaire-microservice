package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.OperationEspecesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface OperationEspecesRepository extends JpaRepository<OperationEspecesEntity, Long> {
}
