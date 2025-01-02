package basics;

public class WideningNarrowingCasting {
    public static void main(String[] args) {
        // Widening casting - Implicit - Automatic
        // byte -> short -> (char) -> int -> long -> float -> double
        byte a = 97;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;

        // Narrowing casting - Explicit - Manual
        // double -> float -> long -> int -> (char) -> short -> byte
        float g = (float) f;
        long h = (long) g;
        int i = (int) h;
        short j = (short) i;
        byte k = (byte) j;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        // char
        char x = 97;
        char y = (char) f;
        char z = x;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        char xx = 'a';
        int yy = xx;
        short zz = (short) xx;
        System.out.println(xx);
        System.out.println(yy);
        System.out.println(zz);

        // more examples
        double aa = 1.678d;
        float bb = (float) aa;
        byte cc = (byte) bb;
        int dd = (int) aa;

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);

        long ee = 9223372036854775807L;
        float ff = ee;
        System.out.println(ee);
        System.out.println(ff);

        long gg = (long) ff;
        System.out.println(gg);

        int xxx = (int) ee;
        System.out.println("MAX: out of max limit long to int: " + xxx);
        long yyy = 92233720368547758L;
        int zzz = (int) yyy;
        System.out.println("INTERMEDIATE: out of max limit long to int: " + zzz);

        // -1
        long hh = Long.MAX_VALUE;
        int ii = (int) hh;
        System.out.println(ii);

        System.out.println(Integer.toBinaryString(123456));

        // 31 (0 - positive, 1 - negative)
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
    }
}
