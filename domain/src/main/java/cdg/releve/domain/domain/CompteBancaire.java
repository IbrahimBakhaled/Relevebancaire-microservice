package cdg.releve.domain.domain;

public class CompteBancaire {

    private String rib;
    private String codeSwift;
    private Banque banque;
    private Acteur acteur;

    public CompteBancaire(String rib, String codeSwift, Banque banque, Acteur acteur) {
        this.rib = rib;
        this.codeSwift = codeSwift;
        this.banque = banque;
        this.acteur = acteur;
    }

    public CompteBancaire(){
        super();
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

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }

    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }
}
