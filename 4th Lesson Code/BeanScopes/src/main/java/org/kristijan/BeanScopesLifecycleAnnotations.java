package org.kristijan;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/* @Component
class NormalClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}
 */
@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All depedencies are ready.");
    }

    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying some class");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Getting ready at some dependency");
    }

}

@Configuration
@ComponentScan
public class BeanScopesLifecycleAnnotations {

    public static void side(String[] args) {
        try (
                var context = new AnnotationConfigApplicationContext(BeanScopesLifecycleAnnotations.class)) {
            // The normal class will print the same instance, the prototype a new one every
            // time
            /*
             * System.out.println(context.getBean(NormalClass.class));
             * System.out.println(context.getBean(NormalClass.class));
             * System.out.println(context.getBean(PrototypeClass.class));
             * System.out.println(context.getBean(PrototypeClass.class));
             * System.out.println(context.getBean(PrototypeClass.class));
             */

            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

        }

    }
}