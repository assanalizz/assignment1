import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        // File path to the text file containing coordinates
        String filePath = "/Users/assanalizhussipbek/Desktop/source.txt";

        try {
            // Read coordinates from the file and create a Shape
            List<Point> points = readCoordinatesFromFile(filePath);
            Shape shape = new Shape(points.toArray(new Point[0]));

            // Calculate various properties of the Shape
            double perimeter = shape.perimeter();
            double longestSide = shape.longestSide();
            double averageSide = shape.averageSide();

            // Output the calculated properties
            System.out.println("Perimeter: " + perimeter);
            System.out.println("Longest side: " + longestSide);
            System.out.println("Average side: " + averageSide);
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            System.err.println("Error: File not found.");
        }
    }

    // Method to read coordinates from a file and return as a list of Points
    private static List<Point> readCoordinatesFromFile(String filePath) throws FileNotFoundException {
        List<Point> points = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNextLine()) {
            // Read each line containing coordinates
            String line = scanner.nextLine();
            String[] coordinates = line.split(",");

            try {
                // Parse and add coordinates as Points to the list
                double x = Double.parseDouble(coordinates[0].trim());
                double y = Double.parseDouble(coordinates[1].trim());
                points.add(new Point(x, y));
            } catch (NumberFormatException e) {
                // Handle invalid coordinate format in a line
                System.err.println("Invalid coordinate format in line: " + line);
            }
        }

        scanner.close();
        return points; // Return the list of Points read from the file
    }
}
