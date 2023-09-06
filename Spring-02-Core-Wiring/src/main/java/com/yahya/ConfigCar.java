package com.yahya;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car audi = new Car();
        audi.setMake("R8");
        return audi;
    }

    @Bean
    Person person(){
        Person p = new Person();
        p.setName("Mikey");
        p.setCar(car());
        return p;
    }
}
