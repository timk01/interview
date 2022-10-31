package com.example.demo.shape;

import java.util.List;

public class Box extends Shape {
    private List<Shape> shapeList;

    public Box(double volume) {
        super(volume);
    }

    public boolean addShape(Shape shape) {
        if (checkIfCanBeAddedToBox(shape)) {
            return shapeList.add(shape);
        }
        return false;
    }

    private boolean checkIfCanBeAddedToBox(Shape shape) {
        return getBoxVolume() + shape.getVolume() >= volume;
    }

    private double getBoxVolume() {
        double boxVolume = 0;
        if (!shapeList.isEmpty()) {
            for (Shape concreteShape : shapeList) {
                boxVolume += concreteShape.getVolume();
            }
        }
        return boxVolume;
    }
}
