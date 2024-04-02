package org.kristijan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println("Go up");
    }

    public void down() {
        System.out.println("Go right");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Go Right");
    }
}
