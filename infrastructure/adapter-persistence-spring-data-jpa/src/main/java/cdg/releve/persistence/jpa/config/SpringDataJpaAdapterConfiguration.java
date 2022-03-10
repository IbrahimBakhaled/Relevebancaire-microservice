package cdg.releve.persistence.jpa.config;


import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.jpa.adapter.ReleveBancaireSpringJpaAdapter;
import cdg.releve.persistence.jpa.repository.LigneReleveRepository;
import cdg.releve.persistence.jpa.repository.ReleveBancaireRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"cdg.releve"})
public class SpringDataJpaAdapterConfiguration {
    @Bean
    public ReleveBancairePersistencePort getReleveBancairePersistencePort(LigneReleveRepository ligneReleveRepository, ReleveBancaireRepository releveBancaireRepository){
        return new ReleveBancaireSpringJpaAdapter(releveBancaireRepository, ligneReleveRepository);
    }

}
