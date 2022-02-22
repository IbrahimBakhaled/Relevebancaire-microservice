package cdg.releve.domain.domain;

public class Cheque {

    private int numerCheque;


    public Cheque(int numerCheque) {
        this.numerCheque = numerCheque;
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
}
