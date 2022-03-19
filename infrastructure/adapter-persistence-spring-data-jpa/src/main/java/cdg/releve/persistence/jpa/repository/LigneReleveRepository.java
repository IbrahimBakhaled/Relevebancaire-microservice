package cdg.releve.persistence.jpa.repository;

import cdg.releve.persistence.jpa.entity.LigneReleveEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface LigneReleveRepository extends JpaRepository<LigneReleveEntity, Long> {
}
