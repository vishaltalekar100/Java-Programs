package basics;

public class DataTypes {
    public static void main(String[] args) {
        // byte - 1 byte
        System.out.println("byte");
        byte a = 10;
        byte b = -10;
        System.out.println("byte min value: " + Byte.MIN_VALUE);
        System.out.println("byte max value: " + Byte.MAX_VALUE);
        byte aa;
        //System.out.println(aa);
        System.out.println();


        // short - 2 byte
        System.out.println("short");
        short c = 100;
        short d = -100;
        System.out.println("short min value: " + Short.MIN_VALUE);
        System.out.println("short max value: " + Short.MAX_VALUE);
        short bb;
        //System.out.println(bb);
        System.out.println();

        // int - 4 byte
        System.out.println("int");
        int e = 1000;
        int f = -1000;
        System.out.println("int min value: " + Integer.MIN_VALUE);
        System.out.println("int max value: " + Integer.MAX_VALUE);
        int cc;
        //System.out.println(cc);
        System.out.println();

        // long - 8 byte
        System.out.println("long");
        long g = 10000;
        long h = -10000;
        long i = 10000L;
        long j = -10000L;
        System.out.println("long min value: " + Long.MIN_VALUE);
        System.out.println("long max value: " + Long.MAX_VALUE);
        long dd;
        //System.out.println(dd);
        System.out.println();

        // float - 4 byte - 7 digit's after decimal point
        System.out.println("float");
        float k = 3.14159265359f;
        float l = -3.14159265359f;
        System.out.println(k);
        System.out.println(l);
        // E30 -> *10^30
        System.out.println("float min value: " + Float.MIN_VALUE);
        System.out.println("float max value: " + Float.MAX_VALUE);
        // up to 8 digit's
        float ll = -31415.9265359f;
        System.out.println(ll);
        System.out.println();

        // double - 8 byte - 15 digit's after decimal point
        System.out.println("double");
        double m = 3.14159265358979323846d;
        double n = -3.14159265358979323846d;
        double o = 3.14159265358979323846;
        double p = -3.14159265358979323846;
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println("double min value: " + Double.MIN_VALUE);
        System.out.println("double max value: " + Double.MAX_VALUE);
        // up to 17 digit's
        double mm = 31415.9265358979323846d;
        System.out.println(mm);
        System.out.println();

        // char - 2 byte
        System.out.println("char");
        char q = 'A';
        char r = 'a';
        char s = '0';
        char t = '9';
        System.out.println(q + ": " + ((int) q));
        System.out.println(r + ": " + ((int) r));
        System.out.println(s + ": " + ((int) s));
        System.out.println(t + ": " + ((int) t));
        System.out.println("char min value: " + ((int) Character.MIN_VALUE));
        System.out.println("char max value: " + ((int) Character.MAX_VALUE));
        // int to char
        System.out.println((char) 10084);
        char heart = (char) 10084;
        char heart1 = 10084;
        char hindiA = 2309;
        System.out.println(heart);
        System.out.println(heart1);
        System.out.println(hindiA);
        // Unicode
        char heart2 = '\u2764';
        char heart3 = '❤';
        System.out.println(heart2);
        System.out.println(heart3);
        // ASCII - 0 to 127 (Can be considered as subset of Unicode)
        for (int u = 0; u <= 127; u++) {
            System.out.print((char) u);
        }

        // boolean - 1 bit
        System.out.println("\n\nboolean");
        boolean v = true;
        boolean w = false;
        System.out.println(v);
        System.out.println(w);
        System.out.println("boolean TYPE value: " + Boolean.TYPE);
        System.out.println("boolean TRUE value: " + Boolean.TRUE);
        System.out.println("boolean FALSE value: " + Boolean.FALSE);
    }
}
