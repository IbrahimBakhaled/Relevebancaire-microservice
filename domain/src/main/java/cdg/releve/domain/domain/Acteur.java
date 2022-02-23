package cdg.releve.domain.domain;

public class Acteur {


    private String nomActeur;
    private String prenomActeur;

    public Acteur(String nomActeur, String prenomActeur) {
        this.nomActeur = nomActeur;
        this.prenomActeur = prenomActeur;
    }

    public Acteur(){
        super();
    }


    public String getNomActeur() {
        return nomActeur;
    }

    public void setNomActeur(String nomActeur) {
        this.nomActeur = nomActeur;
    }

    public String getPrenomActeur() {
        return prenomActeur;
    }

    public void setPrenomActeur(String prenomActeur) {
        this.prenomActeur = prenomActeur;
    }
}
