package cdg.releve.application.rest.configuration;

import cdg.releve.application.rest.controller.ReleveBancaireController;
import cdg.releve.application.rest.controller.ReleveBancaireControllerImpl;
import cdg.releve.application.service.adapter.ReleveBancaireServiceAdapter;
import cdg.releve.application.service.api.ReleveBancaireService;
import cdg.releve.domain.domain.ReleveBancaire;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan({"cdg.releve"})
public class AdapterRestConfiguration {

    @Bean
    public ReleveBancaireService getReleveBancaireService(ReleveBancairePersistencePort releveBancairePersistencePort){
        return new ReleveBancaireServiceAdapter(releveBancairePersistencePort);
    }
}
