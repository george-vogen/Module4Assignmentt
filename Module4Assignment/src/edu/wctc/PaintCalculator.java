package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PaintCalculator implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Room> roomList;

    // adding price variables
    private double coveragePerGallon = 350.0;
    private double costPerGallon = 25.0;

    public PaintCalculator() {
        roomList = new ArrayList<>();
    }

    public void addRoom(double length, double width, double height) {
        roomList.add(new Room(width, length, height));
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    // getters and setters for price variables
    public double getCoveragePerGallon() {
        return coveragePerGallon;
    }

    public void setCoveragePerGallon(double coveragePerGallon) {
        if (coveragePerGallon <= 0) {
            throw new IllegalArgumentException("coveragePerGallon must be > 0");
        }
        this.coveragePerGallon = coveragePerGallon;
    }

    public double getCostPerGallon() {
        return costPerGallon;
    }

    public void setCostPerGallon(double costPerGallon) {
        if (costPerGallon < 0) {
            throw new IllegalArgumentException("costPerGallon must be >= 0");
        }
        this.costPerGallon = costPerGallon;
    }

    public double getTotalArea() {
        double total = 0.0;
        for (Room r : roomList) {
            total += r.getArea();
        }
        return total;
    }

    public int gallonsNeeded(int coats) {
        return gallonsNeeded(coats, coveragePerGallon);
    }

    public int gallonsNeeded(int coats, double coveragePerGallon) {
        if (coats <= 0) {
            throw new IllegalArgumentException("coats must be > 0");
        }
        if (coveragePerGallon <= 0) {
            throw new IllegalArgumentException("coveragePerGallon must be > 0");
        }
        double needed = (getTotalArea() * coats) / coveragePerGallon;
        return (int) Math.ceil(needed);
    }

    public double totalCost(int coats) {
        return totalCost(coats, costPerGallon, coveragePerGallon);
    }

    public double totalCost(int coats, double costPerGallon, double coveragePerGallon) {
        int gallons = gallonsNeeded(coats, coveragePerGallon);
        return gallons * costPerGallon;
    }

    @Override
    public String toString() {
        if (roomList.isEmpty()) {
            return "No rooms added.";
        }

        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Room r : roomList) {
            sb.append(String.format("Room %d: %.2f sq ft", i++, r.getArea()));
            sb.append(System.lineSeparator());
        }
        sb.append(String.format("Total area: %.2f sq ft", getTotalArea()));
        return sb.toString().trim();
    }
}
