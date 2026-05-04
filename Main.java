import transport.*;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("Generic", 60);
        v.display();

        System.out.println("-----");

        Car c = new Car("Toyota", 120, 4);
        c.display();

        System.out.println("-----");

        ElectricCar ec = new ElectricCar("Tesla", 150, 4, 75);
        ec.display();

        System.out.println("-----");

        Bike b = new Bike("Yamaha", 100, true);
        b.display();

        System.out.println("-----");

        Truck t = new Truck();
        t.load();
    }
}
