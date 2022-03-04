package cdg.releve.application.service.api;

import cdg.releve.domain.domain.ReleveBancaire;

import java.util.List;

public interface ReleveBancaireService {

    void addReleveBancaire(ReleveBancaire releveBancaire);
    void removeReleveBancaire(ReleveBancaire releveBancaire);
    List<ReleveBancaire> getReleveBancaires();

    ReleveBancaire getReleveBancaireById(Long releveBancaireId);

    void deleteById(Long releveBancaireId);
}
