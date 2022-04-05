package cdg.releve.application.service.config;


import cdg.releve.application.service.adapter.ReleveBancaireServiceAdapter;
import cdg.releve.application.service.api.ReleveBancaireService;
import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"cdg.releve"})
@Configuration
@EntityScan(basePackages = "cdg.releve")
@EnableJpaRepositories(basePackages = "cdg.releve")
public class ApplicationConfiguration {

    @Bean
    public ReleveBancaireService getReleveBancaireService(ReleveBancairePersistencePort releveBancairePersistencePort){
        return new ReleveBancaireServiceAdapter(releveBancairePersistencePort);
    }
}
