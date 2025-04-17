class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        // Parent class
        System.out.println("Animal:");
        Animal animal = new Animal();
        animal.eat();

        // Child Class 1
        System.out.println("Dog:");
        Dog dog = new Dog();
        dog.bark();

        // Child class 2
        System.out.println("Cat:");
        Cat cat = new Cat();
        cat.meow();
    }
}