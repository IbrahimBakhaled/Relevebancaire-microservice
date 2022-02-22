package cdg.releve.domain.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ReleveBancaire {


    private Long releveBancaireId;
    private Date dateReception;
    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private int nbrOperationDebit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;
    private List<LigneReleve> ligneReleve;

    public ReleveBancaire(){
        super();
    }

    public ReleveBancaire(Long releveBancaireId, Date dateReception, String label, int nbrLignes, int nbrOperationCredit, int nbrOperationDebit, BigDecimal soldeInitial, BigDecimal soleFinal, List<LigneReleve> ligneReleve) {
        this.releveBancaireId = releveBancaireId;
        this.dateReception = dateReception;
        this.label = label;
        this.nbrLignes = nbrLignes;
        this.nbrOperationCredit = nbrOperationCredit;
        this.nbrOperationDebit = nbrOperationDebit;
        this.soldeInitial = soldeInitial;
        this.soleFinal = soleFinal;
        this.ligneReleve = ligneReleve;
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

    public List<LigneReleve> getLigneReleve() {
        return ligneReleve;
    }

    public void setLigneReleve(List<LigneReleve> ligneReleve) {
        this.ligneReleve = ligneReleve;
    }
}
