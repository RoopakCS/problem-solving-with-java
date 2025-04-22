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

interface location {
    public void cleanLocation();

    public void hourlyMessage();
}

interface defaultUser {
    public void showIdCard();

    // default and static
    public default void hourlyMessage() {
        System.out.println("Hourly Message");
    }
}

class ServiceManager implements location, defaultUser {

    @Override
    public void showIdCard() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showIdCard'");
    }

    @Override
    public void cleanLocation() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cleanLocation'");
    }

    @Override
    public void hourlyMessage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hourlyMessage'");
    }

}

public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.complyRegls();
        car.capacityCheck();

        ServiceManager sm = new ServiceManager();
        sm.hourlyMessage();
    }
}
