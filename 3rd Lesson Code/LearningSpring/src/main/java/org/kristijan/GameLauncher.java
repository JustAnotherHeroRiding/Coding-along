package org.kristijan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.kristijan")
public class GameLauncher {

    public static void main(String[] args) {
        try (

                var context = new AnnotationConfigApplicationContext(GameLauncher.class)
        ) {


            context.getBean(GamingConsole.class).up();

            GameRunner bean = context.getBean(GameRunner.class);
            bean.run();
        }


    }
}