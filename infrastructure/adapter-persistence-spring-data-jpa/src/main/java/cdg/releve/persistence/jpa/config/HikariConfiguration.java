package cdg.releve.persistence.jpa.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.HikariConfig;

import javax.sql.DataSource;


@Configuration
@EntityScan(basePackages = {"cdg.releve.persistence.jpa.entity"})
@EnableJpaRepositories(basePackages = {"cdg.releve.persistence.jpa.repository"})

public class HikariConfiguration {



    @Value("${spring.datasource.driver-class-name}")
    private String driver;
    @Value("${spring.datasource.hikari.connection-timeout}")
    private Integer connectionTimeout;
    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private Integer maxPoolSize;
    @Value("${spring.datasource.hikari.pool-name}")
    private String poolName;
    @Value("${spring.datasource.hikari.jdbc-url}")
    private String url;
    @Value("${spring.datasource.hikari.username}")
    private String username;
    @Value("${spring.datasource.hikari.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        final HikariConfig config = new HikariConfig();

        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);

        config.setDriverClassName(driver);
        config.setConnectionTimeout(connectionTimeout);
        config.setMaximumPoolSize(maxPoolSize);
        config.setPoolName(poolName);

        return new HikariDataSource(config);
    }
}
