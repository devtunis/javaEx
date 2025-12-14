package Vehicle;

class Truck extends Vehicle  {

    Truck(String name, double fuelLevel) {
        super(name, fuelLevel);
    }

    @Override
    void move() {
        System.out.println(name + " is transporting goods.");
        fuelLevel -= 10;
    }

    @Override
    void stop() {
        System.out.println(name + " truck stopped.");
    }
}