package cdg.releve.application.rest.controller;

import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ReleveBancaireController {

    @GetMapping("/relevebancaire")
    ResponseEntity<List<ReleveBancaire>> getReleveBancaires();

    @PostMapping("/relevebancaire")
    ResponseEntity<ReleveBancaire> addReleveBancaire(@RequestBody ReleveBancaireCreationRequestDomain releveBancaire);

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
    ResponseEntity<Void> createOperationEspece(@RequestBody OperationEspeceCreationRequestDomain operationEspeceCreationRequestDomain);

    @PostMapping("createoperationcheque")
    ResponseEntity<Void> createoperationcheque(@RequestBody OperationChequeCreationRequestDomain operationChequeCreationRequestDomain);

    @PostMapping("createacteur")
    ResponseEntity<Void> createacteur(@RequestBody ActeurCreationRequestDomain acteurCreationRequestDomain);

    @PostMapping("/createbanque")
    ResponseEntity<Void> createbanque(@RequestBody BanqueCreationRequestDomain banqueCreationRequestDomain);

    @PostMapping("/createcomptebancaire")
    ResponseEntity<Void> createcomptebancaire(@RequestBody CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain);

    @PostMapping("/createoperationvirement")
    ResponseEntity<Void> createoperationvirement(@RequestBody OperationVirementCreationRequestDomain operationVirementCreationRequestDomain);

    @PostMapping("/createproduit")
    ResponseEntity<Void> createproduit(@RequestBody ProduitCreationRequestDomain produitCreationRequestDomain);
}
