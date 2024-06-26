package org.diSimple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA {

}

@Component
class ClassB {

    ClassA classA;

    public ClassB(ClassA classA) {
        this.classA = classA;
    }
}

@Configuration
@ComponentScan()
public class SimpleSpringContext {

    public static void main(String[] args) {
        try (

                var context = new AnnotationConfigApplicationContext(SimpleSpringContext.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }

    }
}