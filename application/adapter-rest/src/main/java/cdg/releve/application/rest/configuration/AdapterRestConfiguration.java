package cdg.releve.application.rest.configuration;


import cdg.releve.application.service.adapter.ReleveBancaireServiceAdapter;
import cdg.releve.application.service.api.ReleveBancaireService;

import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"cdg.releve"})
public class AdapterRestConfiguration {

    @Bean
    public ReleveBancaireService getReleveBancaireService(ReleveBancairePersistencePort releveBancairePersistencePort){
        return new ReleveBancaireServiceAdapter(releveBancairePersistencePort);
    }
}
