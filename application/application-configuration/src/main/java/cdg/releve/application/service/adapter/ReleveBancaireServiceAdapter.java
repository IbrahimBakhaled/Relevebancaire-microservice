package cdg.releve.application.service.adapter;

import cdg.releve.application.service.api.ReleveBancaireService;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.*;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Primary
public class ReleveBancaireServiceAdapter implements ReleveBancaireService {

    private ReleveBancairePersistencePort releveBancairePersistencePort;

    @Autowired
    public ReleveBancaireServiceAdapter(ReleveBancairePersistencePort releveBancairePersistencePort) {
        this.releveBancairePersistencePort = releveBancairePersistencePort;
    }


    @Override
    public void addReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire) {
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
    public void createOperationEspece(OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain) {
        releveBancairePersistencePort.createOperationEspece(operationEspeceCreationRequestDomain);
    }

    @Override
    public void createoperationcheque(OperationChequeCreationRequestDomain operationChequeCreationRequestDomain) {
        releveBancairePersistencePort.createoperationcheque(operationChequeCreationRequestDomain);
    }

    @Override
    public void createacteur(ActeurCreationRequestDomain acteurCreationRequestDomain) {
        releveBancairePersistencePort.createacteur(acteurCreationRequestDomain);
    }

    @Override
    public void createbanque(BanqueCreationRequestDomain banqueCreationRequestDomain) {
        releveBancairePersistencePort.createbanque(banqueCreationRequestDomain);
    }

    @Override
    public void createcomptebancaire(CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain) {
        releveBancairePersistencePort.createcomptebancaire(compteBancaireCreationRequestDomain);
    }

    @Override
    public void createoperationvirement(OperationVirementCreationRequestDomain operationVirementCreationRequestDomain) {
        releveBancairePersistencePort.createoperationvirement(operationVirementCreationRequestDomain);
    }

    @Override
    public void createproduit(ProduitCreationRequestDomain produitCreationRequestDomain) {
        releveBancairePersistencePort.createproduit(produitCreationRequestDomain);
    }
}
