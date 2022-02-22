package cdg.releve.domain.domain;

public class OperationEspeces {

    private String cin;
    private String nomEmetteur;
    private String prenomEmetteur;


    public OperationEspeces(String cin, String nomEmetteur, String prenomEmetteur) {
        this.cin = cin;
        this.nomEmetteur = nomEmetteur;
        this.prenomEmetteur = prenomEmetteur;
    }

    public OperationEspeces(){
        super();
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
}

