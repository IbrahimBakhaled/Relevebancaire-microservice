package cdg.releve.application.rest.controller;

import cdg.releve.domain.domain.Acteur;
import cdg.releve.domain.domain.Produit;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.domain.request.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ReleveBancaireController {

    @GetMapping("/relevebancaire")
    ResponseEntity<List<ReleveBancaire>> getReleveBancaires();

    @PostMapping("/relevebancaire/qualification/{relevebancaireId}")
    ResponseEntity<ReleveBancaire> qualificationrelevebancaire(@PathVariable Long relevebancaireId);

    @PutMapping("/relevebancaire/statusrejeter/{releveBancaireId}")
    ResponseEntity<ReleveBancaire> releveBancaireStatus(@PathVariable Long releveBancaireId);

    @PutMapping("/relevebancaire/statusqualifier/{releveBancaireId}")
    ResponseEntity<ReleveBancaire> releveBancaireStatusQualifier(@PathVariable Long releveBancaireId);

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





    // Methods for Acteur
    @PostMapping("createacteur")
    ResponseEntity<Void> createacteur(@RequestBody List<ActeurCreationRequestDomain> acteurCreationRequestDomain);
    @GetMapping("/acteurs")
    ResponseEntity<List<Acteur>> getActeurs();
    @GetMapping("/search/acteurs")
    ResponseEntity<List<ActeurCreationRequestDomain>> getSearchedActeurs(@RequestParam("query") String query);


    // Methods for Mocking Data

    @PostMapping("/mockacteur")
    ResponseEntity<Void> mockActeur(@RequestBody MockActeurDTO mockActeurDTO);
    @GetMapping("/mockacteurs")
    ResponseEntity<List<MockActeurDTO>> getMockActeur();
    @GetMapping("/search/mockacteurs")
    ResponseEntity<List<MockActeurDTO>> getSearchedMockActeurs(@RequestParam ("query") String query);


    @GetMapping("/produits")
    ResponseEntity<List<Produit>> getProduits();
    @PostMapping("/mockproduit")
    ResponseEntity<Void> mockProduit(@RequestBody MockProduitDTO mockProduitDTO);
    @GetMapping("/mockproduit")
    ResponseEntity<List<MockProduitDTO>> getMockProduit();



    @PostMapping("/createbanque")
    ResponseEntity<Void> createbanque(@RequestBody BanqueCreationRequestDomain banqueCreationRequestDomain);

    @PostMapping("/createcomptebancaire")
    ResponseEntity<Void> createcomptebancaire(@RequestBody CompteBancaireCreationRequestDomain compteBancaireCreationRequestDomain);

    @PostMapping("/createoperationvirement")
    ResponseEntity<Void> createoperationvirement(@RequestBody OperationVirementCreationRequestDomain operationVirementCreationRequestDomain);

    @PostMapping("/createproduit")
    ResponseEntity<Void> createproduit(@RequestBody List<ProduitCreationRequestDomain> produitCreationRequestDomain);
}
