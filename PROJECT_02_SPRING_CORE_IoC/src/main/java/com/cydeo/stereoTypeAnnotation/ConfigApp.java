package com.cydeo.stereoTypeAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.cydeo")   //specify the package if we wat use config class for example out of current package
public class ConfigApp {

}
