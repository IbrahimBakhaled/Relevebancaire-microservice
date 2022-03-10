package cdg.releve.persistence.jpa.entity.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class LigneReleveCreationRequest implements Serializable {

    private String operationNature;
    private String rib;
    @CreatedDate
    private LocalDate dateOperation;
    private int numCheck;
    private BigDecimal montant;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private Long releveBancaireId;
}
