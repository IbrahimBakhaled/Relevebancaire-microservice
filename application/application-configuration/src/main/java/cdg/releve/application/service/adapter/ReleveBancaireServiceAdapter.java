package cdg.releve.application.service.adapter;

import cdg.releve.application.service.api.ReleveBancaireService;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.LigneReleveCreationRequestDomain;
import cdg.releve.domain.domain.request.OperationCreditCreationRequestDomain;
import cdg.releve.domain.domain.request.ReleveBancaireCreationRequestDomain;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.jpa.entity.request.LigneReleveCreationRequest;
import cdg.releve.persistence.jpa.entity.request.ReleveBancaireCreationRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReleveBancaireServiceAdapter implements ReleveBancaireService {

    private ReleveBancairePersistencePort releveBancairePersistencePort;

    @Autowired
    public ReleveBancaireServiceAdapter(ReleveBancairePersistencePort releveBancairePersistencePort) {
        this.releveBancairePersistencePort = releveBancairePersistencePort;
    }


    @Override
    public void addReleveBancaire(ReleveBancaire releveBancaire) {
        releveBancairePersistencePort.addReleveBancaire(releveBancaire);

    }

    @Override
    public void removeReleveBancaire(ReleveBancaire releveBancaire) {
        releveBancairePersistencePort.removeReleveBancaire(releveBancaire);

    }

    @Override
    public List<ReleveBancaire> getReleveBancaires() {
        return releveBancairePersistencePort.getReleveBancaires();
    }

    @Override
    public ReleveBancaire getReleveBancaireById(Long releveBancaireId) {
        return releveBancairePersistencePort.getReleveBancaireById(releveBancaireId);
    }

    @Override
    public void deleteById(Long releveBancaireId) {
        releveBancairePersistencePort.deleteReleveBancaireById(releveBancaireId);
    }

    @Override
    public void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve) {
        releveBancairePersistencePort.createLigneReleve(ligneReleve);
    }

    @Override
    public void createReleveBancaire(ReleveBancaireCreationRequestDomain request) {
        releveBancairePersistencePort.createReleveBancaire(request);

    }

    @Override
    public void createOperationEspece(OperationCreditCreationRequestDomain operationCreditCreationRequestDomain) {
        releveBancairePersistencePort.createOperationEspece(operationCreditCreationRequestDomain);
    }
}
