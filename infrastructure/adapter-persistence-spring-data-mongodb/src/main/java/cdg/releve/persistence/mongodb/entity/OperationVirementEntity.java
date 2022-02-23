package cdg.releve.persistence.mongodb.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "OPERATIONVIREMENT")
public class OperationVirementEntity {



    private String rib;
    private CompteBancaireEntity compteBancaire;



    public OperationVirementEntity(String rib, CompteBancaireEntity compteBancaire) {
        this.rib = rib;
        this.compteBancaire = compteBancaire;
    }


    public OperationVirementEntity(){
        super();
    }



}
