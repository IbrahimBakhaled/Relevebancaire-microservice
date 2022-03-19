package cdg.releve.persistence.jpa.entity.request;

import cdg.releve.persistence.jpa.entity.LigneReleveEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
public class ReleveBancaireCreationRequest {


    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;

    private List<LigneReleveEntity> lignereleve = new ArrayList<>();

}
