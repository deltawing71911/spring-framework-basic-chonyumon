package com.example.demo.chapter03.used;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet {

    @Override
    public void greeting() {
        System.out.println("-------------------");
        System.out.println("Good Evening!");
        System.out.println("-------------------");
    }

}
