package com.example.demo;

import com.example.demo.shape.Ball;
import com.example.demo.shape.Cyllinder;
import com.example.demo.shape.HasVolume;
import com.example.demo.shape.Shape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        //SpringApplication.run(Demo1Application.class, args);
        HasVolume ball = new Ball(2);
        System.out.println(ball.getVolume());
    }
}
