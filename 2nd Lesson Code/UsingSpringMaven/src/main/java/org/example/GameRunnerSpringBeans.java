package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameRunnerSpringBeans {

    public static void main(String[] args) {
        try (

                var context = new AnnotationConfigApplicationContext(GameRunnerConfiguration.class);
        ) {


            context.getBean(GamingConsole.class).up();

            GameRunner bean = context.getBean(GameRunner.class);
            bean.run();
        }
        ;

    }
}
