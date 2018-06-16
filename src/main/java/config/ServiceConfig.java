package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan({"config", "controller"})
public class ServiceConfig {

}
