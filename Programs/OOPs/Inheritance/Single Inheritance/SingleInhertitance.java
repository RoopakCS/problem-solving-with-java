class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class SingleInhertitance {
    public static void main(String[] args) {
        // Parent Class
        System.out.println("Animal:");
        Animal animal = new Animal();
        animal.eat();

        // Child Class
        System.out.println("Dog:");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
