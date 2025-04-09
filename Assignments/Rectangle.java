/* 4.	Write a Java program that defines a Rectangle class with attributes length and width. Implement the following functionalities:
a.	Encapsulate the attributes with private access and provide getter and setter methods.
b.	Add a constructor that initializes the length and width with user input.
c.	Implement an area() method that calculates and returns the area of the rectangle.
d.	Implement a perimeter() method that calculates and returns the perimeter of the rectangle.
e.	Create multiple Rectangle objects and store them in an array.
f.	Implement a method to find and display the rectangle with the largest area.
g.	Display the details of all rectangles after sorting them in descending order of area. */

import java.util.Arrays;
import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Length: " + length + ", Width: " + width + ", Area: " + area());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle[] rectangles = new Rectangle[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for rectangle " + (i + 1) + ":");
            System.out.print("Length: ");
            double length = sc.nextDouble();
            System.out.print("Width: ");
            double width = sc.nextDouble();
            rectangles[i] = new Rectangle(length, width);
        }

        // Find rectangle with largest area
        Rectangle largest = Arrays.stream(rectangles)
                .max((r1, r2) -> Double.compare(r1.area(), r2.area()))
                .get();
        System.out.println("\nRectangle with largest area:");
        largest.display();

        // Sort and display
        Arrays.sort(rectangles, (r1, r2) -> Double.compare(r2.area(), r1.area()));
        System.out.println("\nRectangles sorted by area (descending):");
        for (Rectangle r : rectangles) {
            r.display();
        }
        sc.close();
    }
}
