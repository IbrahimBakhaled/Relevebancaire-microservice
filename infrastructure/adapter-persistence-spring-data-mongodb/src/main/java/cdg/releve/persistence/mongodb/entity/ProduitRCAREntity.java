package cdg.releve.persistence.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;



@Getter
@Setter
@Document(collection = "PRODUITRCAR")
public class ProduitRCAREntity {


    private String nomClient;
    private BigDecimal montant;

    public ProduitRCAREntity(String nomClient, BigDecimal montant) {

        this.nomClient = nomClient;
        this.montant = montant;
    }


    public ProduitRCAREntity(){
        super();
    }



}
