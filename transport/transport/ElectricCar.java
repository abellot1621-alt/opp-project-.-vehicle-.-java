package transport;

public class ElectricCar extends Car {

    private int battery;

    public ElectricCar(String brand, int speed, int doors, int battery) {
        super(brand, speed, doors);
        this.battery = battery;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Battery: " + battery);
    }
}
