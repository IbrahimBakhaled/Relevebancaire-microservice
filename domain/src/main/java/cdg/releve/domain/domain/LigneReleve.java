package cdg.releve.domain.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class LigneReleve{

    private Long ligneReleveId;
    private Date dateOperation;
    private String operationNature;
    private int numCheck;
    private BigDecimal montant;
    private BigDecimal creditDebit;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private ReleveBancaire releveBancaire;
    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;
    private Acteur acteur;
    private CompteBancaire compteBancaire;
    private Banque banque;
    private Produit produit;

    public LigneReleve() {

    }

    public LigneReleve(Long ligneReleveId, Date dateOperation, String operationNature, int numCheck, BigDecimal montant, BigDecimal creditDebit, int refCdg, int refPaiment, String modePaiment, ReleveBancaire releveBancaire, String cin, String nomEmetteur, String prenomEmetteur, Acteur acteur, CompteBancaire compteBancaire, Banque banque, Produit produit) {
        this.ligneReleveId = ligneReleveId;
        this.dateOperation = dateOperation;
        this.operationNature = operationNature;
        this.numCheck = numCheck;
        this.montant = montant;
        this.creditDebit = creditDebit;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
        this.releveBancaire = releveBancaire;
        this.cin = cin;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
        this.acteur = acteur;
        this.compteBancaire = compteBancaire;
        this.banque = banque;
        this.produit = produit;
    }

    public Long getLigneReleveId() {
        return ligneReleveId;
    }

    public void setLigneReleveId(Long ligneReleveId) {
        this.ligneReleveId = ligneReleveId;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getOperationNature() {
        return operationNature;
    }

    public void setOperationNature(String operationNature) {
        this.operationNature = operationNature;
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

    public BigDecimal getCreditDebit() {
        return creditDebit;
    }

    public void setCreditDebit(BigDecimal creditDebit) {
        this.creditDebit = creditDebit;
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

    public ReleveBancaire getReleveBancaire() {
        return releveBancaire;
    }

    public void setReleveBancaire(ReleveBancaire releveBancaire) {
        this.releveBancaire = releveBancaire;
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

    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(CompteBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }
}


