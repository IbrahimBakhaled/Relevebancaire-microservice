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
    private ProduitRecoreEntity produitRecore;
    private ProduitRCAREntity produitRCAR;


    public ProduitEntity(){
        super();
    }

    public ProduitEntity(Long produitId, String produitCode, String produitLabel, ProduitRecoreEntity produitRecore, ProduitRCAREntity produitRCAR) {
        this.produitId = produitId;
        this.produitCode = produitCode;
        this.produitLabel = produitLabel;
        this.produitRecore = produitRecore;
        this.produitRCAR = produitRCAR;
    }
}
