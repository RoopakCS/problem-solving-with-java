abstract class Vehicle {
    int vehId;
    String name;

    public abstract void complyRegls();

    public abstract void capacityCheck();

    public void concreteMethod() {
        System.out.println("This is a concrete method");
    }
}

class Car extends Vehicle {

    @Override
    public void complyRegls() {
        System.out.println("Checked for comply");
    }

    @Override
    public void capacityCheck() {
        System.out.println("Checked for capacity");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.complyRegls();
        car.capacityCheck();
    }
}
