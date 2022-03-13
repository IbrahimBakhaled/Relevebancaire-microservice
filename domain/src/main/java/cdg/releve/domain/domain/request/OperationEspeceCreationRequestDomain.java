package cdg.releve.domain.domain.request;

public class OperationEspeceCreationRequestDomain {


    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;
    private Long ligneReleveId;

    public OperationEspeceCreationRequestDomain(String cin, String nomEmetteur, String prenomEmetteur, Long ligneReleveId) {
        this.cin = cin;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
        this.ligneReleveId = ligneReleveId;
    }

    public OperationEspeceCreationRequestDomain() {
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNomEmetteur() {
        return nomEmetteur;
    }

    public void setNomEmetteur(String nomEmetteur) {
        this.nomEmetteur = nomEmetteur;
    }

    public String getPrenomEmetteur() {
        return prenomEmetteur;
    }

    public void setPrenomEmetteur(String prenomEmetteur) {
        this.prenomEmetteur = prenomEmetteur;
    }

    public Long getLigneReleveId() {
        return ligneReleveId;
    }

    public void setLigneReleveId(Long ligneReleveId) {
        this.ligneReleveId = ligneReleveId;
    }
}
