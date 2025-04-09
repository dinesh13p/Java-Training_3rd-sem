/* 5.	Create a base class Animal with a method makeSound(). Derive two classes Dog and Cat that override makeSound().
Demonstrate polymorphism using method overriding. */

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bhow Bhow");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat() };
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
