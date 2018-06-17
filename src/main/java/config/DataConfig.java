package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableTransactionManagement
@PropertySource("classpath:app.properties")
@EnableJpaRepositories("repository")
public class DataConfig {

    @Resource
    private Environment env;
}
