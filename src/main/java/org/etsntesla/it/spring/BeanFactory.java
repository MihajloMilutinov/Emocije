package org.etsntesla.it.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "org.etsntesla.it.spring")
@PropertySource("classpath:application.properties")
public class BeanFactory {

    @Autowired
    Environment env;

    @Bean
    public DatabaseConfiguration factoryDBConfig(){}
}
