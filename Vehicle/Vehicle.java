package Vehicle;

abstract class Vehicle {
    protected String name;
    protected double fuelLevel; // باللتر

    Vehicle(String name, double fuelLevel) {
        this.name = name;
        this.fuelLevel = fuelLevel;
    }

    abstract void move();  // كل مركبة تتحرك بطريقة مختلفة
    abstract void stop();  // كل مركبة تتوقف بطريقة مختلفة

    void fuelStatus() {  // دالة مشتركة لكل المركبات
        System.out.println(name + " fuel level: " + fuelLevel + " L");
    }
}
