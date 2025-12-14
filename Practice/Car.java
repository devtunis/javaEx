package Practice;

interface  fly{
    void fly();
}

interface  canFlyInthisWord{
    boolean canFlyInthisWord();
}
interface  Dispear{
    public void dispear();
}
abstract public class Car {
    public int numbeerOfWheels ;
    public float height ;
    public  float weight;
    public  boolean canFly;

    public Car(int numbeerOfWheels, float height, float weight, boolean canFly) {
        this.numbeerOfWheels = numbeerOfWheels;
        this.height = height;
        this.weight = weight;
        this.canFly = canFly ;
    }

    abstract void autopilot();
    abstract void StreamingServices();
    abstract void ParkingSensor();
    abstract void fly();

    @Override
    public String toString(){
        return  "The type of Car is Hatchback  and number of wheels"+" "+numbeerOfWheels+" And height "+height + " And weight "+weight;
    }


}
