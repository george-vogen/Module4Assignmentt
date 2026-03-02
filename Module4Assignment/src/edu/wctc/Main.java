package edu.wctc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static PaintCalculator paintCalculator = new PaintCalculator();

    private static void printMenu() {
        System.out.println();
        System.out.println("Paint Calculator");
        System.out.println("1) Add room");
        System.out.println("2) View rooms");
        System.out.println("3) Read rooms from file");
        System.out.println("4) Write rooms to file");
        System.out.println("5) Estimate paint cost");
        System.out.println("6) Exit");
        System.out.print("Choose an option: ");
    }

    private static double promptForDimension(String dimensionName) {
        while (true) {
            System.out.print("Enter " + dimensionName + ": ");
            try {
                double val = Double.parseDouble(keyboard.nextLine());
                if (val <= 0) {
                    System.out.println("Value must be greater than zero.");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static int promptForInt(String prompt, int defaultVal) {
        while (true) {
            System.out.print(prompt + " (default: " + defaultVal + "): ");
            String line = keyboard.nextLine().trim();
            if (line.isEmpty()) {
                return defaultVal;
            }
            try {
                int val = Integer.parseInt(line);
                if (val <= 0) {
                    System.out.println("Value must be greater than zero.");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }

    private static double promptForDouble(String prompt, double defaultVal) {
        while (true) {
            System.out.print(prompt + " (default: " + defaultVal + "): ");
            String line = keyboard.nextLine().trim();
            if (line.isEmpty()) {
                return defaultVal;
            }
            try {
                double val = Double.parseDouble(line);
                if (val <= 0) {
                    System.out.println("Value must be greater than zero.");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private static void createRoom() {
        double length = promptForDimension("length");
        double width = promptForDimension("width");
        double height = promptForDimension("height");
        paintCalculator.addRoom(length, width, height);
        System.out.println("Room added.");
    }

    private static void estimateCost() {
        if (paintCalculator.getRoomList().isEmpty()) {
            System.out.println("No rooms available. Add a room first.");
            return;
        }

        int defaultCoats = 1;
        double defaultCoverage = paintCalculator.getCoveragePerGallon();
        double defaultPrice = paintCalculator.getCostPerGallon();

        int coats = promptForInt("Enter number of coats", defaultCoats);
        double coverage = promptForDouble("Enter coverage per gallon (sq ft)", defaultCoverage);
        double price = promptForDouble("Enter cost per gallon", defaultPrice);

        int gallons = paintCalculator.gallonsNeeded(coats, coverage);
        double totalCost = paintCalculator.totalCost(coats, price, coverage);

        System.out.println("Total paintable area: " + String.format("%.2f", paintCalculator.getTotalArea()) + " sq ft");
        System.out.println("Coats: " + coats);
        System.out.println("Gallons needed: " + gallons);
        System.out.println("Estimated total cost: $" + String.format("%.2f", totalCost));
    }

    private static void readFile() {
        System.out.print("Enter filename to read from (default: paintcalc.ser): ");
        String fileName = keyboard.nextLine().trim();
        if (fileName.isEmpty()) {
            fileName = "paintcalc.ser";
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Object obj = ois.readObject();
            if (obj instanceof PaintCalculator) {
                paintCalculator = (PaintCalculator) obj;
                System.out.println("Paint calculator loaded from file.");
            } else {
                System.out.println("File does not contain a PaintCalculator object.");
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void writeFile() {
        System.out.print("Enter filename to write to (default: paintcalc.ser): ");
        String fileName = keyboard.nextLine().trim();
        if (fileName.isEmpty()) {
            fileName = "paintcalc.ser";
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(paintCalculator);
            System.out.println("Paint calculator saved to file.");
        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            String choice = keyboard.nextLine().trim();
            switch (choice) {
                case "1":
                    createRoom();
                    break;
                case "2":
                    System.out.println(paintCalculator.toString());
                    break;
                case "3":
                    readFile();
                    break;
                case "4":
                    writeFile();
                    break;
                case "5":
                    estimateCost();
                    break;
                case "6":
                    running = false;
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }
    }
}
