class Example {
    static int count = 0; // static variable

    Example() {
        count++;  // increase count each time an object is created
    }
}

public class Main {
    public static void main(String[] args) {
        Example a = new Example();
        Example b = new Example();
        Example c = new Example();

        System.out.println(Example.count); // 3, shared by all objects
    }
}
