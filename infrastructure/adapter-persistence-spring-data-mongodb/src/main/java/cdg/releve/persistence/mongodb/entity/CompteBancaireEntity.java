package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "COMPTEBANCAIRE")
public class CompteBancaireEntity {


    private String rib;
    private String codeSwift;
    private BanqueEntity banque;
    private ActeurEntity acteur;

    public CompteBancaireEntity(String rib, String codeSwift, BanqueEntity banque, ActeurEntity acteur) {
        this.rib = rib;
        this.codeSwift = codeSwift;
        this.banque = banque;
        this.acteur = acteur;
    }

    public CompteBancaireEntity(){
        super();
    }


}
