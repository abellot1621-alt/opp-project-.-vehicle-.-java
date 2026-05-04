package transport;

public class Car extends Vehicle {

    protected int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Doors: " + doors);
    }
}
