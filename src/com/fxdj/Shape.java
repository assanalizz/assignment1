package com.fxdj;

// Class representing a geometric shape composed of points
public class Shape {
    private Point[] points; // Array of points representing the shape
    private double perim; // Variable to store the calculated perimeter

    // Constructor to initialize the Shape with an array of Points
    public Shape(Point[] points) {
        this.points = points;
    }

    // Method to calculate the perimeter of the shape
    public double perimeter() {
        double perimeter = 0;
        int len = points.length;
        for (int i = 0; i < len; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[(i + 1) % len];
            perimeter += currentPoint.distanceTo(nextPoint);
        }
        this.perim = perimeter; // Store the calculated perimeter
        return perimeter; // Return the perimeter of the shape
    }

    // Method to calculate the average side length of the shape
    public double averageSide() {
        int numOfSides = points.length;
        return (perim / numOfSides); // Return the average side length
    }

    // Method to calculate the length of the longest side in the shape
    public double longestSide() {
        double longestSide = 0;
        for (int i = 0; i < points.length; i++) {
            Point currentPoint = points[i];
            Point nextPoint = points[(i + 1) % points.length];
            longestSide = Math.max(currentPoint.distanceTo(nextPoint), longestSide);
        }
        return longestSide; // Return the length of the longest side
    }
}
