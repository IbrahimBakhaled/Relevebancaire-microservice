package cdg.releve.persistence.jpa.entity.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ReleveBancaireCreationRequest {


    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;

}
