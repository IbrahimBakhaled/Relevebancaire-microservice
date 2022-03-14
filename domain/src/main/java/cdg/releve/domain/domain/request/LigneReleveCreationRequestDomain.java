package cdg.releve.domain.domain.request;

import cdg.releve.domain.domain.OperationCheque;
import cdg.releve.domain.domain.OperationEspeces;
import cdg.releve.domain.domain.OperationVirement;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LigneReleveCreationRequestDomain {

    private String operationNature;
    private String rib;
    private BigDecimal creditDebit;
    private LocalDate dateOperation;
    private int numCheck;
    private BigDecimal montant;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private Long releveBancaireId;
    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;
    private int compteBancaireId;
    private int acteurId;
    private int banqueId;
    private Long produitId;


    public LigneReleveCreationRequestDomain(String operationNature, String rib, BigDecimal creditDebit, LocalDate dateOperation, int numCheck, BigDecimal montant, int refCdg, int refPaiment, String modePaiment, Long releveBancaireId, String cin, String nomEmetteur, String prenomEmetteur, int compteBancaireId, int acteurId, int banqueId, Long produitId) {
        this.operationNature = operationNature;
        this.rib = rib;
        this.creditDebit = creditDebit;
        this.dateOperation = dateOperation;
        this.numCheck = numCheck;
        this.montant = montant;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
        this.releveBancaireId = releveBancaireId;
        this.cin = cin;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
        this.compteBancaireId = compteBancaireId;
        this.acteurId = acteurId;
        this.banqueId = banqueId;
        this.produitId = produitId;
    }

    public LigneReleveCreationRequestDomain() {
    }

    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public BigDecimal getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(BigDecimal creditDebit) {
        this.creditDebit = creditDebit;
    }

    public LocalDate getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(LocalDate dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getNumCheck() {
        return numCheck;
    }

    public void setNumCheck(int numCheck) {
        this.numCheck = numCheck;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public int getRefCdg() {
        return refCdg;
    }

    public void setRefCdg(int refCdg) {
        this.refCdg = refCdg;
    }

    public int getRefPaiment() {
        return refPaiment;
    }

    public void setRefPaiment(int refPaiment) {
        this.refPaiment = refPaiment;
    }

    public String getModePaiment() {
        return modePaiment;
    }

    public void setModePaiment(String modePaiment) {
        this.modePaiment = modePaiment;
    }

    public Long getReleveBancaireId() {
        return releveBancaireId;
    }

    public void setReleveBancaireId(Long releveBancaireId) {
        this.releveBancaireId = releveBancaireId;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNomEmetteur() {
        return nomEmetteur;
    }

    public void setNomEmetteur(String nomEmetteur) {
        this.nomEmetteur = nomEmetteur;
    }

    public String getPrenomEmetteur() {
        return prenomEmetteur;
    }

    public void setPrenomEmetteur(String prenomEmetteur) {
        this.prenomEmetteur = prenomEmetteur;
    }

    public int getCompteBancaireId() {
        return compteBancaireId;
    }

    public void setCompteBancaireId(int compteBancaireId) {
        this.compteBancaireId = compteBancaireId;
    }


    public int getActeurId() {
        return acteurId;
    }

    public void setActeurId(int acteurId) {
        this.acteurId = acteurId;
    }

    public int getBanqueId() {
        return banqueId;
    }

    public void setBanqueId(int banqueId) {
        this.banqueId = banqueId;
    }

    public Long getProduitId() {
        return produitId;
    }

    public void setProduitId(Long produitId) {
        this.produitId = produitId;
    }
}