package cdg.releve.persistence.jpa.entity.request;

import lombok.*;
import java.math.BigDecimal;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@Builder
public class LigneReleveCreationRequest {

    private String operationNature;
    private String rib;
    private String creditDebit;
    private int numCheck;
    private BigDecimal montant;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private ReleveBancaireCreationRequest releveBancaireCreationRequest;
}
