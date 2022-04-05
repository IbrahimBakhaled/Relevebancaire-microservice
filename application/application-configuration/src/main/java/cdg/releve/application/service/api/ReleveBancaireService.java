package cdg.releve.application.service.api;

import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.*;

import java.util.List;

public interface ReleveBancaireService {

    void addReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire);
    void removeReleveBancaire(ReleveBancaire releveBancaire);
    List<ReleveBancaire> getReleveBancaires();

    ReleveBancaire getReleveBancaireById(Long releveBancaireId);

    void deleteById(Long releveBancaireId);

    void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve);

    void createReleveBancaire(ReleveBancaireCreationRequestDomain request);

    void createOperationEspece(OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain);

    void createoperationcheque(OperationChequeCreationRequestDomain operationChequeCreationRequestDomain);

    void createacteur(ActeurCreationRequestDomain acteurCreationRequestDomain);

    void createbanque(BanqueCreationRequestDomain banqueCreationRequestDomain);

    void createcomptebancaire(CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain);

    void createoperationvirement(OperationVirementCreationRequestDomain operationVirementCreationRequestDomain);

    void createproduit(ProduitCreationRequestDomain produitCreationRequestDomain);
}
