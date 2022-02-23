package cdg.releve.domain.spi;

import cdg.releve.domain.domain.ReleveBancaire;

import java.util.List;

public interface ReleveBancairePersistencePort {

    void addReleveBancaire(ReleveBancaire releveBancaire);
    void removeReleveBancaire(ReleveBancaire releveBancaire);
    List<ReleveBancaire> getReleveBancaires();

    ReleveBancaire getReleveBancaireById(Long releveBancaireId);

    void deleteReleveBancaireById(Long releveBancaireId);
}
