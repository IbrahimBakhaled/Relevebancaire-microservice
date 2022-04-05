package cdg.releve.application.rest.mapper;


import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import cdg.releve.persistence.jpa.entity.request.ReleveBancaireCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReleveBancaireEntityMapper {

    ReleveBancaire toModel(ReleveBancaireEntity entity);
    ReleveBancaireCreationRequest toDto(ReleveBancaire model);
}