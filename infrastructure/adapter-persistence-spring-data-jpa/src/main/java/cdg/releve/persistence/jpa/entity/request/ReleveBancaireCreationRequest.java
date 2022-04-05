package cdg.releve.persistence.jpa.entity.request;

import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class ReleveBancaireCreationRequest{


    private String label;
    private int nbrLignes;
    private int nbrOperationCredit;
    private BigDecimal soldeInitial;
    private BigDecimal soleFinal;

    private List<LigneReleveCreationRequest> lignereleve = new ArrayList<>();

}
