package cdg.releve.domain.spi;

import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.LigneReleveCreationRequestDomain;
import cdg.releve.domain.domain.request.OperationCreditCreationRequestDomain;
import cdg.releve.domain.domain.request.ReleveBancaireCreationRequestDomain;

import java.util.List;

public interface ReleveBancairePersistencePort {

    void addReleveBancaire(ReleveBancaire releveBancaire);
    void removeReleveBancaire(ReleveBancaire releveBancaire);
    List<ReleveBancaire> getReleveBancaires();

    ReleveBancaire getReleveBancaireById(Long releveBancaireId);

    void deleteReleveBancaireById(Long releveBancaireId);

    void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve);

    void createReleveBancaire(ReleveBancaireCreationRequestDomain request);

    void createOperationEspece(OperationCreditCreationRequestDomain operationCreditCreationRequestDomain);
}
