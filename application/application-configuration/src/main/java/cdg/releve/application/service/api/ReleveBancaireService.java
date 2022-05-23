package cdg.releve.application.service.api;

import cdg.releve.domain.domain.Acteur;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.*;

import java.util.List;

public interface ReleveBancaireService {

    ReleveBancaire addReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire);

    void removeReleveBancaire(ReleveBancaire releveBancaire);

    void qualificationrelevebancaire(Long releveBancaireId);

    ReleveBancaire releveBancaireStatus(Long releveBancaireId);

    List<ReleveBancaire> getReleveBancaires();

    ReleveBancaire getReleveBancaireById(Long releveBancaireId);

    void deleteById(Long releveBancaireId);

    void createLigneReleve(LigneReleveCreationRequestDomain ligneReleve);

    void createReleveBancaire(ReleveBancaireCreationRequestDomain request);

    void createOperationEspece(OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain);

    void createoperationcheque(OperationChequeCreationRequestDomain operationChequeCreationRequestDomain);

    void createacteur(List<ActeurCreationRequestDomain> acteurCreationRequestDomain);

    List<Acteur> getActeurs();

    List<ActeurCreationRequestDomain> searchActeurs(String query);

    void createbanque(BanqueCreationRequestDomain banqueCreationRequestDomain);

    void createcomptebancaire(CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain);

    void createoperationvirement(OperationVirementCreationRequestDomain operationVirementCreationRequestDomain);

    void createproduit(List<ProduitCreationRequestDomain> produitCreationRequestDomain);



    void mockActeur(MockActeurDTO mockActeurDTO);
    List<MockActeurDTO> getmockActeur();
    List<MockActeurDTO> getSearchedMockActeurs(String query);
    void mockProduit(MockProduitDTO mockProduitDTO);
    List<MockProduitDTO> getMockProduit();

}
