package cdg.releve.domain.domain.request;

public class OperationVirementCreationRequestDomain {


    private String rib;
    private int compteBancaireId;
    private Long ligneReleveId;


    public OperationVirementCreationRequestDomain(String rib, int compteBancaireId, Long ligneReleveId) {
        this.rib = rib;
        this.compteBancaireId = compteBancaireId;
        this.ligneReleveId = ligneReleveId;
    }

    public OperationVirementCreationRequestDomain() {
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public int getCompteBancaireId() {
        return compteBancaireId;
    }

    public void setCompteBancaireId(int compteBancaireId) {
        this.compteBancaireId = compteBancaireId;
    }

    public Long getLigneReleveId() {
        return ligneReleveId;
    }

    public void setLigneReleveId(Long ligneReleveId) {
        this.ligneReleveId = ligneReleveId;
    }
}
