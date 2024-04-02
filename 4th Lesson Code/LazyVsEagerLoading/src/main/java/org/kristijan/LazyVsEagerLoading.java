package org.kristijan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class Cat {

}

@Component
@Lazy
class Dog {
    Cat cat;

    public Dog(Cat cat) {
        System.out.println("Initializing Dog class");
        this.cat = cat;
    }

    public void bark() {
        System.out.println("Woof woof");
    }
}

@Configuration
@ComponentScan()
public class LazyVsEagerLoading {

    public static void main(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(LazyVsEagerLoading.class)) {
            System.out.println("Initialization of context is completed");
            context.getBean(Dog.class).bark();
        }

    }
}