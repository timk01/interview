package com.example.demo.shape;

public abstract class Shape implements HasVolume, Colourable {
    protected double volume; //protected < default-package < public

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
