package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.ActeurEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActeurRepository extends JpaRepository<ActeurEntity, Integer> {
}
