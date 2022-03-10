package cdg.releve.domain.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

public class ReleveBancaire implements Serializable{


    private Long releveBancaireId;
    private Date dateReception;
    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private int nbrOperationDebit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;
    private Set<LigneReleve> lignereleve;    // ONE relevebancaire has MANY lignereleve (One to Many)

    public ReleveBancaire() {

    }


    public ReleveBancaire(Long releveBancaireId, Date dateReception, String label, int nbrLignes, int nbrOperationCredit, int nbrOperationDebit, BigDecimal soldeInitial, BigDecimal soleFinal, Set<LigneReleve> lignereleve) {
        this.releveBancaireId = releveBancaireId;
        this.dateReception = dateReception;
        this.label = label;
        this.nbrLignes = nbrLignes;
        this.nbrOperationCredit = nbrOperationCredit;
        this.nbrOperationDebit = nbrOperationDebit;
        this.soldeInitial = soldeInitial;
        this.soleFinal = soleFinal;
        this.lignereleve = lignereleve;
    }

    public Long getReleveBancaireId() {
        return releveBancaireId;
    }

    public void setReleveBancaireId(Long releveBancaireId) {
        this.releveBancaireId = releveBancaireId;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getNbrLignes() {
        return nbrLignes;
    }

    public void setNbrLignes(int nbrLignes) {
        this.nbrLignes = nbrLignes;
    }

    public int getNbrOperationCredit() {
        return nbrOperationCredit;
    }

    public void setNbrOperationCredit(int nbrOperationCredit) {
        this.nbrOperationCredit = nbrOperationCredit;
    }

    public int getNbrOperationDebit() {
        return nbrOperationDebit;
    }

    public void setNbrOperationDebit(int nbrOperationDebit) {
        this.nbrOperationDebit = nbrOperationDebit;
    }

    public BigDecimal getSoldeInitial() {
        return soldeInitial;
    }

    public void setSoldeInitial(BigDecimal soldeInitial) {
        this.soldeInitial = soldeInitial;
    }

    public BigDecimal getSoleFinal() {
        return soleFinal;
    }

    public void setSoleFinal(BigDecimal soleFinal) {
        this.soleFinal = soleFinal;
    }

    public Set<LigneReleve> getLignereleve() {
        return lignereleve;
    }

    public void setLignereleve(Set<LigneReleve> lignereleve) {
        this.lignereleve = lignereleve;
    }
}


