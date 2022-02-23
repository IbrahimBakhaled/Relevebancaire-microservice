package cdg.releve.persistence.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;



@Getter
@Setter
@Document(collection = "LIGNERELEVE")
public class LigneReleveEntity {

//    @Id
    private Long ligneReleveId;
    private Date dateOperation;
    private String operationNature;
    private String rib;
    private int numCheck;
    private BigDecimal montant;
    private BigDecimal creditDebit;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private OperationCreditEntity operationCredit;


    public LigneReleveEntity(){
        super();
    }

    public LigneReleveEntity(Long ligneReleveId, Date dateOperation, String operationNature, String rib, int numCheck, BigDecimal montant, BigDecimal creditDebit, int refCdg, int refPaiment, String modePaiment, OperationCreditEntity operationCredit) {
        this.ligneReleveId = ligneReleveId;
        this.dateOperation = dateOperation;
        this.operationNature = operationNature;
        this.rib = rib;
        this.numCheck = numCheck;
        this.montant = montant;
        this.creditDebit = creditDebit;
        this.refCdg = refCdg;
        this.refPaiment = refPaiment;
        this.modePaiment = modePaiment;
        this.operationCredit = operationCredit;
    }

}
