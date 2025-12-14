package Practice;

public class Hatchback extends Car  implements fly ,canFlyInthisWord{


    Hatchback(int numbeerOfWheels , float height , float weight ,boolean canFly ) {
        super(numbeerOfWheels,height,weight,canFly);
    }

    @Override
     void autopilot(){
        System.out.println("Autopilot");

    }
    @Override
     void StreamingServices(){
        System.out.println("StreamingServices");
    }
    @Override
     void ParkingSensor(){
        System.out.println("ParkingSensor");
    }

    @Override
    public void fly(){

        if(canFlyInthisWord()){
            System.out.println("Fly this HatchBack");
        }else {
            System.out.println("Can't Fly this HatchBack");
        }
    }

    @Override
    public boolean canFlyInthisWord(){
        return canFly;

    }



}
