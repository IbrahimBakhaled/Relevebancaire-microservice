package cdg.releve.application.rest.controller;

import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.LigneReleveCreationRequestDomain;
import cdg.releve.domain.domain.request.OperationCreditCreationRequestDomain;
import cdg.releve.domain.domain.request.ReleveBancaireCreationRequestDomain;
import cdg.releve.persistence.jpa.entity.request.LigneReleveCreationRequest;
import cdg.releve.persistence.jpa.entity.request.ReleveBancaireCreationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ReleveBancaireController {

    @GetMapping("/relevebancaire")
    ResponseEntity<List<ReleveBancaire>> getReleveBancaires();

    @PostMapping("/relevebancaire")
    ResponseEntity<ReleveBancaire> addReleveBancaire(@RequestBody ReleveBancaire releveBancaire);

    @DeleteMapping("/relevebancaire")
    ResponseEntity<Void> removeReleveBancaire(@RequestBody ReleveBancaire releveBancaire);

    @GetMapping("/relevebancaire/{relevebancaireId}")
    ResponseEntity<ReleveBancaire> getReleveBancaireById(@PathVariable Long relevebancaireId);

    @DeleteMapping("/relevebancaire/{releveBancaireId}")
    ResponseEntity<Void> deleteReleveBancaireById(@PathVariable Long releveBancaireId);

    @PostMapping("/createlignereleve")
    ResponseEntity<Void> createLigneReleve(@RequestBody LigneReleveCreationRequestDomain request);

    @PostMapping("/createrelevebancaire")
    ResponseEntity<Void> createReleveBancaire(@RequestBody ReleveBancaireCreationRequestDomain request);

    @PostMapping("/createoperationespece")
    ResponseEntity<Void> createOperationEspece(@RequestBody OperationCreditCreationRequestDomain operationCreditCreationRequestDomain);

}
