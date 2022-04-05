package cdg.releve.application.rest.mapper;


import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.persistence.jpa.entity.request.ReleveBancaireCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReleveBancaireDtoMapper {
    ReleveBancaire toModel(ReleveBancaireCreationRequest request);
    ReleveBancaireCreationRequest toDto(ReleveBancaire releveBancaire);

}
