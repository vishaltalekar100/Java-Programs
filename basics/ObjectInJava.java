package basics;

public class ObjectInJava {
    public static void main(String[] args) {
        ObjectInJava example = new ObjectInJava();
        example.print("Hello"); // String
        example.print(123); // Autoboxing to Integer -> Object
        example.print(null); // most specific match -> String

        System.out.println();

        print1("Hello"); // String
        print1(123); // Autoboxing to Integer -> Object
        print1(null); // most specific match -> String
    }

    public void print(Object obj) {
        System.out.println("Method with Object parameter called: " + obj);
    }

    public void print(String str) {
        System.out.println("Method with String parameter called: " + str);
    }

    public static void print1(Object obj) {
        System.out.println("Method with Object parameter called: " + obj);
    }

    public static void print1(String str) {
        System.out.println("Method with String parameter called: " + str);
    }
}

