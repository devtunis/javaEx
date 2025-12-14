package Vehicle;

class Car extends Vehicle implements Electric, Autonomous {

    Car(String name, double fuelLevel) {
        super(name, fuelLevel);
    }

    @Override
    void move() {
        System.out.println(name + " is driving on the road!");
        fuelLevel -= 5; // استهلاك وقود
    }

    @Override
    void stop() {
        System.out.println(name + " stopped.");
    }

    @Override
    public void chargeBattery() {
        System.out.println(name + " is charging battery.");
        fuelLevel = 100;
    }

    @Override
    public void autoDrive() {
        System.out.println(name + " is driving autonomously!");
        fuelLevel -= 3;
    }
}