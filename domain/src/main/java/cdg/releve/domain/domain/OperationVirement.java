package cdg.releve.domain.domain;

public class OperationVirement {

    private String rib;
    private CompteBancaire compteBancaire;



    public OperationVirement(String rib, CompteBancaire compteBancaire) {
        this.rib = rib;
        this.compteBancaire = compteBancaire;
    }


    public OperationVirement(){
        super();
    }


    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public CompteBancaire getCompteBancaire() {
        return compteBancaire;
    }

    public void setCompteBancaire(CompteBancaire compteBancaire) {
        this.compteBancaire = compteBancaire;
    }
}
