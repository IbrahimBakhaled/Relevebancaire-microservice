package cdg.releve.persistence.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;



@Getter
@Setter
@Document(collection = "PRODUITRECORE")
public class ProduitRecoreEntity {


    private String nomClient;
    private BigDecimal montant;


    public ProduitRecoreEntity(String nomClient, BigDecimal montant) {
        this.nomClient = nomClient;
        this.montant = montant;
    }


    public ProduitRecoreEntity(){
        super();
    }


}
