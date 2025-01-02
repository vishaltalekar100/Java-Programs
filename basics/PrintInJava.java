package basics;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public class PrintInJava {
    public static void main(String[] args) {
        // System class
        System.out.println(System.getenv());

        // println -> 10 overloaded methods -> sout -> cursor goes to next line
        System.out.println("Hello, World!"); // String
        System.out.println(1); // int
        System.out.println(100L); // Long
        System.out.println(3.14f); // float
        System.out.println(3.14); // double
        System.out.println(true); // boolean
        System.out.println('A'); // char

        char[] a = {'A', 'B', 'C'};
        System.out.println(a); // char[]

        String[] b = {"AAA", "BBB", "CCC"};
        System.out.println(b); // [Ljava.lang.String;@10f87f48
        System.out.println(Arrays.toString(b)); // [AAA, BBB, CCC]
        int[] c = {1, 2, 3};
        System.out.println(c); // [I@b4c966a
        System.out.println(Arrays.toString(c)); // [1, 2, 3]
        double[] d = {1.1, 2.1, 3.1};
        System.out.println(d); // [D@2f4d3709
        System.out.println(Arrays.toString(d)); // [1.0, 2.0, 3.0]

        Person person = new Person();
        person.setId(1);
        person.setName("Vishal");
        System.out.println(person); // Object

        System.out.println(); // new line

        System.out.println(Optional.ofNullable(null)); // Optional.empty
        System.out.println(Optional.empty()); // Optional.empty

        int aa = 1;
        int bb = 2;
        String cc = "Sum";
        System.out.println(aa + bb + cc); // 3Sum
        System.out.println(cc + aa + bb); // Sum12 -> left to right precedence
        System.out.println(cc + ": " + (aa + bb)); // Sum: 3

        // print -> cursor stays on same line -> other all things stays same as println
        System.out.print("Hello, World!\n");

        // printf -> souf -> accepts formatted string
        System.out.printf("My name is %s. I am %d years old. I am %fm tall.\n", "Vishal", 26, 1.7554);
        System.out.printf("My name is %s. I am %d years old. I am %.1fm tall.\n", "Vishal", 26, 1.7554f);
        System.out.printf("My name is %s. I am %d years old. I am %.2fm tall.\n", "Vishal", 26, 1.7554d);
        System.out.printf("My name is %s. I am %d years old. I am %.3fm tall.\n", "Vishal", 26, 1.7545);
        System.out.printf("My name is %s. I am %d years old. I am %em tall.\n", "Vishal", 26, 1.7554);
        System.out.printf("My grade is %c. And that is %b.\n", 'A', true);

        double number = 1234567.890;
        System.out.printf("Default locale: %,.2f%n", number);
        System.out.printf(Locale.US, "US locale: %,.2f%n", number);
        System.out.printf(Locale.GERMANY, "Germany locale: %,.2f%n", number);
        System.out.printf(Locale.FRANCE, "France locale: %,.2f%n", number);
    }
}

class Person {

    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
