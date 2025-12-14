package Vehicle;

class Drone extends Vehicle implements Electric, Autonomous {

    Drone(String name, double fuelLevel) {
        super(name, fuelLevel);
    }

    @Override
    void move() {
        System.out.println(name + " is flying!");
        fuelLevel -= 2;
    }

    @Override
    void stop() {
        System.out.println(name + " landed safely.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + " drone is charging.");
        fuelLevel = 100;
    }

    @Override
    public void autoDrive() {
        System.out.println(name + " drone flying autonomously!");
        fuelLevel -= 1.5;
    }
}
