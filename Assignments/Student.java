/* 3.	Write a Java program to define a Student class with attributes name, age, and grade. Implement the following functionalities:
a.	Create an array of 5 Student objects, taking user input for each student's details.
b.	Implement a method to sort the students based on their grade in descending order.
c.	Implement a method to find and display the student with the highest grade.
d.	Display all student details after sorting. */

import java.util.Arrays;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        // a) Take user input
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // Consume newline
            students[i] = new Student(name, age, grade);
        }

        // b) Sort by grade (descending)
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()));

        // c) Find student with highest grade
        System.out.println("\nStudent with highest grade:");
        students[0].display();

        // d) Display all students after sorting
        System.out.println("\nAll students sorted by grade (descending):");
        for (Student s : students) {
            s.display();
        }
        sc.close();
    }
}