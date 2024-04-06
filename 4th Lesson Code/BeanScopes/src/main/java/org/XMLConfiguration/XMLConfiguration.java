package org.XMLConfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Arrays;

public class XMLConfiguration {

    public static void xmlConfig(String[] args) {
        try (

                var context = new ClassPathXmlApplicationContext("contextConfiguration.xml");) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
        }
    }

}
