package cdg.releve.domain.domain.request;

public class ActeurCreationRequestDomain {

    private int acteurId;
    private String nomActeur;
    private String prenomActeur;
    private Long ligneReleveId;


    public ActeurCreationRequestDomain(int acteurId, String nomActeur, String prenomActeur,
        Long ligneReleveId) {
        this.acteurId = acteurId;
        this.nomActeur = nomActeur;
        this.prenomActeur = prenomActeur;
        this.ligneReleveId = ligneReleveId;
    }

    public ActeurCreationRequestDomain() {
    }

    public int getActeurId() {
        return acteurId;
    }

    public void setActeurId(int acteurId) {
        this.acteurId = acteurId;
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

    public Long getLigneReleveId() {
        return ligneReleveId;
    }

    public void setLigneReleveId(Long ligneReleveId) {
        this.ligneReleveId = ligneReleveId;
    }
}
