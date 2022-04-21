package cdg.releve.application.rest.controller;

import cdg.releve.application.service.api.ReleveBancaireService;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ReleveBancaireControllerImpl implements ReleveBancaireController{

    private ReleveBancaireService releveBancaireService;

    @Autowired
    public ReleveBancaireControllerImpl(ReleveBancaireService releveBancaireService) {
        this.releveBancaireService = releveBancaireService;
    }

    @Override
    public ResponseEntity<List<ReleveBancaire>> getReleveBancaires() {
        return new ResponseEntity<>(releveBancaireService.getReleveBancaires(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ReleveBancaire> qualificationrelevebancaire(Long relevebancaireId) {
        releveBancaireService.qualificationrelevebancaire(relevebancaireId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ReleveBancaire> addReleveBancaire(ReleveBancaireCreationRequestDomain releveBancaire) {

        releveBancaireService.addReleveBancaire(releveBancaire);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> removeReleveBancaire(ReleveBancaire releveBancaire) {
        releveBancaireService.removeReleveBancaire(releveBancaire);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ReleveBancaire> getReleveBancaireById(Long relevebancaireId) {
        return new ResponseEntity<>(releveBancaireService.getReleveBancaireById(relevebancaireId), HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Void> deleteReleveBancaireById(Long releveBancaireId) {

        releveBancaireService.deleteById(releveBancaireId);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @Override
    public ResponseEntity<Void> createLigneReleve(LigneReleveCreationRequestDomain request) {
        releveBancaireService.createLigneReleve(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createReleveBancaire(ReleveBancaireCreationRequestDomain request) {
        releveBancaireService.createReleveBancaire(request);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createOperationEspece(OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain) {
        releveBancaireService.createOperationEspece(operationEspeceCreationRequestDomain);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createoperationcheque(OperationChequeCreationRequestDomain operationChequeCreationRequestDomain) {
        releveBancaireService.createoperationcheque((operationChequeCreationRequestDomain));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createacteur(ActeurCreationRequestDomain acteurCreationRequestDomain) {
        releveBancaireService.createacteur(acteurCreationRequestDomain);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createbanque(BanqueCreationRequestDomain banqueCreationRequestDomain) {
        releveBancaireService.createbanque(banqueCreationRequestDomain);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createcomptebancaire(CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain) {
        releveBancaireService.createcomptebancaire(compteBancaireCreationRequestDomain);
        return  new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createoperationvirement(OperationVirementCreationRequestDomain operationVirementCreationRequestDomain) {
        releveBancaireService.createoperationvirement(operationVirementCreationRequestDomain);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> createproduit(ProduitCreationRequestDomain produitCreationRequestDomain) {
        releveBancaireService.createproduit(produitCreationRequestDomain);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {
        return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
