package cdg.releve.domain.domain;

public class CompteBancaire {

    private String rib;
    private String codeSwift;

    public CompteBancaire(String rib, String codeSwift) {
        this.rib = rib;
        this.codeSwift = codeSwift;
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
}
