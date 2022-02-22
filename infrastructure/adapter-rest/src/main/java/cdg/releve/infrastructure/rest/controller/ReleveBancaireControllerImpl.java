package cdg.releve.infrastructure.rest.controller;

import cdg.releve.application.service.api.ReleveBancaireService;
import cdg.releve.domain.domain.ReleveBancaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin("*")
public class ReleveBancaireControllerImpl implements ReleveBancaireController{

    private ReleveBancaireService releveBancaireService;

    @Autowired
    public ReleveBancaireControllerImpl(ReleveBancaireService releveBancaireService) {
        this.releveBancaireService = releveBancaireService;
    }

    @Override
    public ResponseEntity<List<ReleveBancaire>> getReleveBancaires() {
        return new ResponseEntity<List<ReleveBancaire>>(releveBancaireService.getReleveBancaires(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ReleveBancaire> addReleveBancaire(ReleveBancaire releveBancaire) {
        releveBancaireService.addReleveBancaire(releveBancaire);
        return new ResponseEntity<ReleveBancaire>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> removeReleveBancaire(ReleveBancaire releveBancaire) {
        releveBancaireService.removeReleveBancaire(releveBancaire);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<ReleveBancaire> getReleveBancaireById(Long relevebancaireId) {
        return new ResponseEntity<ReleveBancaire>(releveBancaireService.getReleveBancaireById(relevebancaireId), HttpStatus.OK);
    }
}
