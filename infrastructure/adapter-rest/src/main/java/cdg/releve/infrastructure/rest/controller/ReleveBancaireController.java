package cdg.releve.infrastructure.rest.controller;

import cdg.releve.domain.domain.ReleveBancaire;
import org.springframework.http.HttpStatus;
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


}
