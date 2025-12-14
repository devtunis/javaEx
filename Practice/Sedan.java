package Practice;

public class Sedan extends Car  implements fly ,canFlyInthisWord ,Dispear{

    public Sedan(int numbeerOfWheels, float height, float weight, boolean canFly) {
        super(numbeerOfWheels,height,weight,canFly);
    }

    @Override
    void autopilot(){
        System.out.println("Sedan");

    }
    @Override
    void StreamingServices(){
        System.out.println("StreamingServices Sedan");
    }
    @Override
    public void dispear(){
            System.out.println("Dispear i can yes by  the way");
    }
    @Override
    void ParkingSensor(){
        System.out.println("ParkingSensor Sedan ");
    }

    @Override
    public void fly(){

        if(canFlyInthisWord()){
            System.out.println("Fly this Sedan");
        }else {
            System.out.println("Can't Fly this Sedan");
        }
    }

    @Override
    public boolean canFlyInthisWord(){
        return canFly;

    }


}
