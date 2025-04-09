/* 7.  Create a base class Shape with a method area(). Implement the following functionalities:
a.	Inherit Circle and Square from Shape, where each class overrides the area() method to calculate and return the respective area.
b.	Implement constructor overloading in both Circle and Square to initialize objects either with default values or user-specified values.
c.	Create a ShapeManager class that:
    i.	Stores multiple Shape objects (both Circle and Square) in an array.
    ii.	Implements a method to find the shape with the largest area and display its type (Circle or Square) along with its area.
    iii.	Implements a method to sort all shapes in descending order of area and display their details. */

import java.util.Arrays;

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle, Area: " + area();
    }
}

class Square extends Shape {
    private double side;

    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    public String toString() {
        return "Square, Area: " + area();
    }
}

class Q7_ShapeManager {
    private Shape[] shapes;

    public Q7_ShapeManager(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void findLargestArea() {
        Shape largest = shapes[0];
        for (Shape s : shapes) {
            if (s.area() > largest.area())
                largest = s;
        }
        System.out.println("Shape with largest area: " + largest);
    }

    public void sortAndDisplay() {
        Arrays.sort(shapes, (s1, s2) -> Double.compare(s2.area(), s1.area()));
        System.out.println("Shapes sorted by area (descending):");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2.0), new Square(3.0), new Circle(), new Square(1.5)
        };
        Q7_ShapeManager manager = new Q7_ShapeManager(shapes);
        manager.findLargestArea();
        manager.sortAndDisplay();
    }
}
