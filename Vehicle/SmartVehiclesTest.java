package Vehicle;
interface Electric {
    void chargeBattery();
}

interface Autonomous {
    void autoDrive();
}

public class SmartVehiclesTest {
    public static void main(String[] args) {
        Vehicle[] fleet = new Vehicle[3];
        fleet[0] = new Car("Tesla", 50);
        fleet[1] = new Drone("DJI", 20);
        fleet[2] = new Truck("Volvo", 80);

        for(Vehicle v : fleet) {
            v.fuelStatus();
            v.move();
            v.stop();

            // نتحقق إذا المركبة كهربائية
            if(v instanceof Electric e) e.chargeBattery();
            // نتحقق إذا المركبة ذكية
            if(v instanceof Autonomous a) a.autoDrive();

            System.out.println("------");
        }
    }
}
