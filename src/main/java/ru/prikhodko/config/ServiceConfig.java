package ru.prikhodko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@Repository
@ComponentScan({"ru.prikhodko.config", "ru.prikhodko.controller"})
public class ServiceConfig {

}
