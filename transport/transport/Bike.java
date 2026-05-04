package transport;

public class Bike extends Vehicle {

    private boolean hasGear;

    public Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Has Gear: " + hasGear);
    }
}
