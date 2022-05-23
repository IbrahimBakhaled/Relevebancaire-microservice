package cdg.releve.persistence.jpa.repository;

import cdg.releve.domain.domain.request.ActeurCreationRequestDomain;
import cdg.releve.persistence.jpa.entity.ActeurEntity;
import java.util.List;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RequestParam;

public interface ActeurRepository extends JpaRepository<ActeurEntity, Integer> {


  @Query("SELECT a FROM ActeurEntity a WHERE " +
      "a.nomActeur LIKE CONCAT('%',:query, '%')" +
      "Or a.prenomActeur LIKE CONCAT('%', :query, '%')")
  List<ActeurEntity> searchActeurs(@Param("query") String query);

}
