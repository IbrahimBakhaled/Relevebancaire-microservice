package cdg.releve.persistence.mongodb.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@Document(collection = "RELEVEBANCAIRE")
public class ReleveBancaireEntity {



    private Long releveBancaireId;
    private Date dateReception;
    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private int nbrOperationDebit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;
    private List<LigneReleveEntity> lignereleve;


    public ReleveBancaireEntity(Long releveBancaireId, Date dateReception, String label, int nbrLignes, int nbrOperationCredit, int nbrOperationDebit, BigDecimal soldeInitial, BigDecimal soleFinal, List<LigneReleveEntity> lignereleve) {
        this.releveBancaireId = releveBancaireId;
        this.dateReception = dateReception;
        this.label = label;
        this.nbrLignes = nbrLignes;
        this.nbrOperationCredit = nbrOperationCredit;
        this.nbrOperationDebit = nbrOperationDebit;
        this.soldeInitial = soldeInitial;
        this.soleFinal = soleFinal;
        this.lignereleve = lignereleve;
    }

    public ReleveBancaireEntity(){
        super();
    }
}
