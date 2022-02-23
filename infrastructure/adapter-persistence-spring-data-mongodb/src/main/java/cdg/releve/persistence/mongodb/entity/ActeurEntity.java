package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "ACTEUR")
public class ActeurEntity {

    private String nomActeur;
    private String prenomActeur;

    public ActeurEntity(String nomActeur, String prenomActeur) {
        this.nomActeur = nomActeur;
        this.prenomActeur = prenomActeur;
    }

    public ActeurEntity(){
        super();
    }

}
