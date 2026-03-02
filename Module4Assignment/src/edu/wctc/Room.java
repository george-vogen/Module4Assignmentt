package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Room implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Wall> wallList;

    public Room(double width, double length, double height) {
        wallList = new ArrayList<>();
        // Two walls with width x height
        wallList.add(new Wall(width, height));
        wallList.add(new Wall(width, height));
        // Two walls with length x height
        wallList.add(new Wall(length, height));
        wallList.add(new Wall(length, height));
    }

    public double getArea() {
        double sum = 0.0;
        for (Wall w : wallList) {
            sum += w.getArea();
        }
        return sum;
    }

    @Override
    public String toString() {
        return String.format("Room area: %.2f sq ft", getArea());
    }
}
