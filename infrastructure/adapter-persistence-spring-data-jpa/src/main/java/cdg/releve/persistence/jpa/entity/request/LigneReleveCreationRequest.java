package cdg.releve.persistence.jpa.entity.request;

import cdg.releve.persistence.jpa.entity.OperationEspecesEntity;
import cdg.releve.persistence.jpa.entity.ReleveBancaireEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
public class LigneReleveCreationRequest implements Serializable {

    private String operationNature;
    private String rib;
    private String creditDebit;
    private int numCheck;
    private BigDecimal montant;
    private int refCdg;
    private int refPaiment;
    private String modePaiment;
    private ReleveBancaireCreationRequest releveBancaire;
}
