package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.LigneReleveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LigneReleveRepository extends JpaRepository<LigneReleveEntity, Long> {
}
