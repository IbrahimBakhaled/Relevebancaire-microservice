package cdg.releve;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//(exclude = {MongoAutoConfiguration.class,MongoDataAutoConfiguration.class})
@SpringBootApplication
@EnableJpaRepositories
@EnableDiscoveryClient
@OpenAPIDefinition(info = @Info(title = "Releve Bancaire API", version = "2.0", description = "Releve Bancaire Information"))
public class BootloaderApplicationLauncher {
    public static void main(String[] args) {
        SpringApplication.run(BootloaderApplicationLauncher.class, args);
    }
}
