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

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Parent Class
        Animal animal = new Animal();
        System.out.println("Animal:");
        animal.eat();

        // Child Class
        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.bark();
        dog.eat();

        // Grand Child Class
        Puppy puppy = new Puppy();
        System.out.println("Puppy:");
        puppy.weep();
        puppy.bark();
        puppy.eat();
    }
}
