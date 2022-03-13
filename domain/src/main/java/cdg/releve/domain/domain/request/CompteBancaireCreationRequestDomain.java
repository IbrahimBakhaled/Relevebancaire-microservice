package cdg.releve.domain.domain.request;

public class CompteBancaireCreationRequestDomain {


    private int compteBancaireId;
    private String rib;
    private String codeSwift;
    private int acteurId;
    private int banqueId;


    public CompteBancaireCreationRequestDomain(int compteBancaireId, String rib, String codeSwift, int acteurId, int banqueId) {
        this.compteBancaireId = compteBancaireId;
        this.rib = rib;
        this.codeSwift = codeSwift;
        this.acteurId = acteurId;
        this.banqueId = banqueId;
    }

    public CompteBancaireCreationRequestDomain() {
    }


    public int getCompteBancaireId() {
        return compteBancaireId;
    }

    public void setCompteBancaireId(int compteBancaireId) {
        this.compteBancaireId = compteBancaireId;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getCodeSwift() {
        return codeSwift;
    }

    public void setCodeSwift(String codeSwift) {
        this.codeSwift = codeSwift;
    }

    public int getActeurId() {
        return acteurId;
    }

    public void setActeurId(int acteurId) {
        this.acteurId = acteurId;
    }

    public int getBanqueId() {
        return banqueId;
    }

    public void setBanqueId(int banqueId) {
        this.banqueId = banqueId;
    }
}
