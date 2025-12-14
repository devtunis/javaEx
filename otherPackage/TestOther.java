package otherPackage;
import mypackage.DefaultExample;

class  acceibleCompoenet extends DefaultExample{
   void show()
    {
      System.out.println(f);
    }
}
public class TestOther {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        acceibleCompoenet f = new acceibleCompoenet();
        f.show();
        System.out.println("public a: " + example.get()); // ✔️ يعمل

    }


}
