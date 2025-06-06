/* 6.	Implement a class Person with attributes name and age. 
Derive a class Employee from Person and add salary. 
Demonstrate calling the parent class constructor. */

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Q6_Employee extends Person {
    private double salary;

    public Q6_Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Q6_Employee emp = new Q6_Employee("Alice", 30, 50000);
        emp.display();
    }
}
