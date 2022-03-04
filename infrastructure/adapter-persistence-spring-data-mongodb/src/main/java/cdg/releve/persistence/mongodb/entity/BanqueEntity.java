package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "BANQUE")
public class BanqueEntity {


    private String nomBanque;


    public BanqueEntity(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public BanqueEntity(){
        super();
    }

}
