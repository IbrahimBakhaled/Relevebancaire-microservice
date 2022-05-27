package cdg.releve.application.service.adapter;

import cdg.releve.application.service.api.ReleveBancaireService;
import cdg.releve.domain.domain.Acteur;
import cdg.releve.domain.domain.Produit;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.*;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


public class ReleveBancaireServiceAdapter implements ReleveBancaireService {

    private ReleveBancairePersistencePort releveBancairePersistencePort;

    @Autowired
    public ReleveBancaireServiceAdapter(ReleveBancairePersistencePort releveBancairePersistencePort) {
        this.releveBancairePersistencePort = releveBancairePersistencePort;
    }


    @Override
    public ReleveBancaire addReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire) {
       return releveBancairePersistencePort.addReleveBancaire(releveBancaire);

    }

    @Override
    public void removeReleveBancaire(ReleveBancaire releveBancaire) {
        releveBancairePersistencePort.removeReleveBancaire(releveBancaire);

    }

    @Override
    public void qualificationrelevebancaire(Long releveBancaireId) {
        releveBancairePersistencePort.qualificationrelevebancaire(releveBancaireId);
    }

    @Override
    public ReleveBancaire releveBancaireStatus(Long releveBancaireId) {
        return releveBancairePersistencePort.releveBancaireStatus(releveBancaireId);
    }

    @Override
    public ReleveBancaire releveBancaireStatusQualifier(Long releveBancaireId) {
        return releveBancairePersistencePort.releveBancaireStatusQualifier(releveBancaireId);
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
    public void createacteur(List<ActeurCreationRequestDomain> acteurCreationRequestDomain) {
        releveBancairePersistencePort.createacteur(acteurCreationRequestDomain);
    }

    @Override
    public List<Acteur> getActeurs() {
        return releveBancairePersistencePort.getActeurs();
    }

    @Override
    public List<Produit> getProduits() {
        return releveBancairePersistencePort.getProduits();
    }

    @Override
    public List<ActeurCreationRequestDomain> searchActeurs(String query) {
        return releveBancairePersistencePort.searchActeurs(query);
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
    public void createproduit(List<ProduitCreationRequestDomain> produitCreationRequestDomain) {
        releveBancairePersistencePort.createproduit(produitCreationRequestDomain);
    }

    @Override
    public void mockActeur(MockActeurDTO mockActeurDTO) {
        releveBancairePersistencePort.mockActeur(mockActeurDTO);
    }

    @Override
    public List<MockActeurDTO> getmockActeur() {
        return releveBancairePersistencePort.getmockActeur();
    }

    @Override
    public List<MockActeurDTO> getSearchedMockActeurs(String query) {
        return releveBancairePersistencePort.getSearchedMockActeurs(query);
    }

    @Override
    public void mockProduit(MockProduitDTO mockProduitDTO) {
        releveBancairePersistencePort.mockProduit(mockProduitDTO);
    }

    @Override
    public List<MockProduitDTO> getMockProduit() {
        return releveBancairePersistencePort.getMockProduit();
    }

}
