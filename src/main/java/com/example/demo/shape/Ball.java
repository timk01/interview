package com.example.demo.shape;

import java.math.BigDecimal;

public class Ball extends Shape {
    private double radius;
    private final static double FOUR_DIVIDE_THREE = 4/3;
    private final static int THREE = 3;

    public Ball(double radius) {
        super(calculateVolume(radius));
        this.radius = radius;
    }

    private static double calculateVolume(double radius) {
        return FOUR_DIVIDE_THREE * Math.PI * Math.pow(radius, THREE);
    }

}
