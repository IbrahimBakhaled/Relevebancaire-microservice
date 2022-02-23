package cdg.releve.domain.domain;

public class Cheque {

    private int numerCheque;
    private Acteur acteur ;


    public Cheque(int numerCheque, Acteur acteur) {
        this.numerCheque = numerCheque;
        this.acteur = acteur;
    }

    public Cheque(){
        super();
    }

    public int getNumerCheque() {
        return numerCheque;
    }

    public void setNumerCheque(int numerCheque) {
        this.numerCheque = numerCheque;
    }

    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }
}
