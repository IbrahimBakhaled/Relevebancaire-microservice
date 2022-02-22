package cdg.releve.persistence.mongodb.config;


import cdg.releve.domain.spi.ReleveBancairePersistencePort;
import cdg.releve.persistence.mongodb.adapter.ReleveBancaireSpringMongodbAdapter;
import cdg.releve.persistence.mongodb.repository.ReleveBancaireRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"cdg.releve"})
public class SpringDataMongodbAdapterConfiguration {

    @Bean
    public ReleveBancairePersistencePort getReleveBancairePersistencePort(ReleveBancaireRepository releveBancaireRepository){
        return new ReleveBancaireSpringMongodbAdapter(releveBancaireRepository);
    }
}
