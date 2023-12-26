import java.lang.Math;

// Class representing a point in a 2D space
public class Point {
    private double x; // X-coordinate of the point
    private double y; // Y-coordinate of the point

    // Constructor to initialize the Point with given coordinates
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter method for retrieving the X-coordinate of the Point
    public double getX() {
        return x;
    }

    // Getter method for retrieving the Y-coordinate of the Point
    public double getY() {
        return y;
    }

    // Method to calculate the distance between this Point and a given destination Point
    public double distanceTo(Point destination) {
        // Extract coordinates of both points
        double x1 = this.x;
        double y1 = this.y;
        double x2 = destination.getX();
        double y2 = destination.getY();

        // Calculate the distance between the points using the distance formula
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance; // Return the calculated distance
    }

    // Override toString() method to represent the Point's coordinates as a String
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")"; // Return coordinates in (x, y) format
    }
}
