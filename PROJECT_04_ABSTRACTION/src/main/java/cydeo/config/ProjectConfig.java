package cydeo.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"cydeo.proxy","cydeo.service","cydeo.repository"})
public class ProjectConfig {
}
