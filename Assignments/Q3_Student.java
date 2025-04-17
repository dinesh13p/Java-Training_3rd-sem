/* 3.	Write a Java program to define a Student class with attributes name, age, and grade. Implement the following functionalities:
a.	Create an array of 5 Student objects, taking user input for each student's details.
b.	Implement a method to sort the students based on their grade in descending order.
c.	Implement a method to find and display the student with the highest grade.
d.	Display all student details after sorting. */

import java.util.Scanner;

class Q3_Student {
    private String name;
    private int age;
    private double grade;

    public Q3_Student(String name, int age, double grade) {
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
        Q3_Student[] students = new Q3_Student[5];

        // Input student details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine(); // Consume the newline
            students[i] = new Q3_Student(name, age, grade);
        }

        // Sort students by grade in descending order
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getGrade() < students[j].getGrade()) {
                    Q3_Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        // Display the student with the highest grade
        System.out.println("\nStudent with highest grade:");
        students[0].display();

        // Display all students sorted by grade
        System.out.println("\nAll students sorted by grade (descending):");
        for (Q3_Student student : students) {
            student.display();
        }

        sc.close();
    }
}
