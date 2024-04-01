package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorldSpring {

    public static void side(String[] args) {
        // 1. Launch a Spring Context
        try (

                var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        ) {

            // 2. Configure the things that we want Spring to manage - @Configuration
            // inside the config we created a Bean called name with the @Bean decorator
            // this returns a string "Kristijan"

            // 3. Retrieving a bean created in the config
            // System.out.println(context.getBean("name"));
            // System.out.println(context.getBean("age"));
            // System.out.println(context.getBean("person"));
            // System.out.println(context.getBean("customAddress"));
            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person4Parameters"));
            // System.out.println(context.getBean("person3Parameters"));

            // 4. Retrieving all beans
            //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }

    ;
}
