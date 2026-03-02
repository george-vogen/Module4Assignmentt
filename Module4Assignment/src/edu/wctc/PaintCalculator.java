package edu.wctc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PaintCalculator implements Serializable {
    private static final long serialVersionUID = 1L;

    private List<Room> roomList;

    public PaintCalculator() {
        roomList = new ArrayList<>();
    }

    public void addRoom(double length, double width, double height) {
        roomList.add(new Room(width, length, height));
    }

    public List<Room> getRoomList() {
        return roomList;
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
        return sb.toString().trim();
    }
}
