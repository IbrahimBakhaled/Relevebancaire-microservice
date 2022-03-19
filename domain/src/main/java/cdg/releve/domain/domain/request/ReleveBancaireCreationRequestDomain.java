package cdg.releve.domain.domain.request;

import cdg.releve.domain.domain.LigneReleve;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleveBancaireCreationRequestDomain {

    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private int nbrOperationDebit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;
    private List<LigneReleve> lignereleve = new ArrayList<>();


    public ReleveBancaireCreationRequestDomain(String label, int nbrLignes, int nbrOperationCredit, int nbrOperationDebit, BigDecimal soldeInitial, BigDecimal soleFinal, List<LigneReleve> lignereleve) {
        this.label = label;
        this.nbrLignes = nbrLignes;
        this.nbrOperationCredit = nbrOperationCredit;
        this.nbrOperationDebit = nbrOperationDebit;
        this.soldeInitial = soldeInitial;
        this.soleFinal = soleFinal;
        this.lignereleve = lignereleve;
    }

    public ReleveBancaireCreationRequestDomain() {
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

    public List<LigneReleve> getLignereleve() {
        return lignereleve;
    }

    public void setLignereleve(List<LigneReleve> lignereleve) {
        this.lignereleve = lignereleve;
    }
}
