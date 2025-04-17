public class Car {
    String brand = "Benz";

    void honk() {
        System.out.println("Beep!");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.brand);
        myCar.honk();
    }
}