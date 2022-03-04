package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "PRODUIT")
public class ProduitEntity {


    private Long produitId;
    private String produitCode;
    private String produitLabel;



    public ProduitEntity(){
        super();
    }

    public ProduitEntity(Long produitId, String produitCode, String produitLabel) {
        this.produitId = produitId;
        this.produitCode = produitCode;
        this.produitLabel = produitLabel;
    }
}
