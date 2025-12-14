package mypackage;

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        System.out.println("publfic a: " + example.f);
        System.out.println("public a: " + example.get());       // ✔️ يعمل من أي مكان

    }
}
