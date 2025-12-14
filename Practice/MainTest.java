package Practice;

public class MainTest {
    public static void main(String[] args) {
        Car [] Vehucile = new Car[4];
        Vehucile[0]  =   new Hatchback(4,20.33f,12.32f,true);
        Vehucile[1]  =   new Hatchback(4,20.33f,12.32f,false);
        Vehucile[2]  =   new Hatchback(2,11.33f,4.32f,false);
        Vehucile[3]  =   new Sedan(100,11.33f,4.32f,true);

        for(Car u : Vehucile){

            System.out.println(u);
            u.fly();

            System.out.println("-------------------------------");
        }


    }
}
