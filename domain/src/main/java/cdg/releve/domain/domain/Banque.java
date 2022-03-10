package cdg.releve.domain.domain;

public class Banque {
    private int banqueId;
    private String nomBanque;


    public Banque() {
    }

    public Banque(int banqueId, String nomBanque) {
        this.banqueId = banqueId;
        this.nomBanque = nomBanque;
    }

    public int getBanqueId() {
        return banqueId;
    }

    public void setBanqueId(int banqueId) {
        this.banqueId = banqueId;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
}
