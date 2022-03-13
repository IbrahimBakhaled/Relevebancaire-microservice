package cdg.releve.domain.domain.request;

public class BanqueCreationRequestDomain {


    private int banqueId;
    private String nomBanque;

    public BanqueCreationRequestDomain(int banqueId, String nomBanque) {
        this.banqueId = banqueId;
        this.nomBanque = nomBanque;
    }

    public BanqueCreationRequestDomain() {
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
