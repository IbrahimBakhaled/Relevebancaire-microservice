package cdg.releve.persistence.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Getter
@Setter
@Document(collection = "OPERATIONCREDIT")
public class OperationCreditEntity {


    private Date operationDate;
    private OperationChequeEntity operationCheque;
    private OperationEspecesEntity operationEspeces;
    private OperationVirementEntity operationVirement;
    private ProduitEntity produit;


    public OperationCreditEntity(Date operationDate, OperationChequeEntity operationCheque, OperationEspecesEntity operationEspeces, OperationVirementEntity operationVirement, ProduitEntity produit) {
        this.operationDate = operationDate;
        this.operationCheque = operationCheque;
        this.operationEspeces = operationEspeces;
        this.operationVirement = operationVirement;
        this.produit = produit;
    }

    public OperationCreditEntity(){
        super();
    }


}
