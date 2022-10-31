package com.example.demo.shape;

public class Cyllinder extends Shape {
    private double height;
    private double radius;

    public Cyllinder(double radius, double height) {
        super(height * Math.PI * Math.pow(radius, 2));
        this.radius = radius;
        this.height = height;
    }

}
