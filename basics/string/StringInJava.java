package basics.string;

public class StringInJava {
    public static void main(String[] args) {
        // Class
        // String is sequence of character
        // non-primitive data type
        // constant / immutable
        // String buffers support mutable strings

        // using string literal
        String name = "Vishal"; // String pool / String constant pool / String literal pool
        String name1 = "Vishal";

        // using new keyword
        String name2 = new String("Vishal"); // Heap
        String name3 = new String("Vishal");

        System.out.println(name == name1); // true
        System.out.println(name2 == name3); // false
        System.out.println(name == name2.intern()); // true
        System.out.println(name.equals(name3)); // true

        System.out.println();

        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println();

        // identityHashCode returns a hash code that is based on the memory address
        System.out.println(System.identityHashCode(name));    // Prints memory address
        System.out.println(System.identityHashCode(name1));   // Same as name
        System.out.println(System.identityHashCode(name2));   // Different address
        System.out.println(System.identityHashCode(name3));   // Different address

        System.out.println();

        System.out.println(name.length());
        System.out.println(name1.length());
        System.out.println(name2.length());
        System.out.println(name3.length());
    }
}
