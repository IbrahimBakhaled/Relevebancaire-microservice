package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.CEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface OperationCreditRepository extends JpaRepository<CEntity, Date> {
}
