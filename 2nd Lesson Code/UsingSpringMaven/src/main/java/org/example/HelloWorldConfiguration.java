package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.awt.*;

record Person(String name, int age, Address address) {
};

record Address(String street, String city) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Kristijan";
    }

    @Bean
    public int age() {
        return 24;
    }

    @Bean
    public Person person() {
        var person = new Person("Kiki", 23, new Address("Ohridska", "Kicevo"));
        return person;
    }

    @Bean
    public Person person2MethodCall() {
        var person = new Person(name(), age(), address()); // Using already defined Beans name and age
        return person;
    }

    @Bean
    @Primary
    public Person person3Parameters(String name, int age, Address kicevoAddress) {
        var person = new Person(name, age, kicevoAddress); // Using already defined Beans name and age
        return person;
    }

    @Bean
    public Person person4Parameters(String name, int age, @Qualifier("kicevoAddressQualifier")
    Address kicevoAddress) {
        var person = new Person(name, age, kicevoAddress); // Using already defined Beans name and age
        return person;
    }

    @Bean(name = "kicevoAddress")
    @Qualifier("kicevoAddressQualifier")
    Address address() {
        var address = new Address("Ohridska", "Kicevo");
        return address;
    }

    @Bean(name = "skopjeAddress")
    @Primary
    Address address2() {
        var address = new Address("Makedonska Vojska 38/1-21", "Skopje");
        return address;
    }
}

