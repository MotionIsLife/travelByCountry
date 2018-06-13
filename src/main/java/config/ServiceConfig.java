package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import vo.City;

@Repository
@ComponentScan({"config", "rest"})
public class ServiceConfig {
    @Bean
    public City getCity() {
        return new City();
    }
}
