package cdg.releve.domain.domain;

public class OperationVirement {

    public String rib;


    public OperationVirement(String rib) {
        this.rib = rib;
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
}
