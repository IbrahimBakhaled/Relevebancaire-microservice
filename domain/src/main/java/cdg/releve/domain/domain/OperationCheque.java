package cdg.releve.domain.domain;

public class OperationCheque {
    private int numeroCheque;
    private Acteur acteur;

    public OperationCheque(int numeroCheque, Acteur acteur) {
        this.numeroCheque = numeroCheque;
        this.acteur = acteur;
    }

    public OperationCheque(){
        super();
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }
}
