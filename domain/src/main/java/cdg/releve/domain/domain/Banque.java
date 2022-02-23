package cdg.releve.domain.domain;

public class Banque {
    private String nomBanque;


    public Banque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public Banque(){
        super();
    }


    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
}
