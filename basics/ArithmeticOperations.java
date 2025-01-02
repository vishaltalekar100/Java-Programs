package basics;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // add, sub, mul, div
        int mySalary = 100;
        int bonus = 10;
        int deduction = 20;

        int monthlyTotal = mySalary + bonus - deduction;
        System.out.println("Monthly salary: " + monthlyTotal);

        int yearlyTotal = monthlyTotal * 12;
        System.out.println("Yearly salary: " + yearlyTotal);

        int quarterlySalary = yearlyTotal / 4;
        System.out.println("Quarterly salary: " + quarterlySalary);

        // modulus (%) - remainder
        int a = 5;
        int b = 3;
        System.out.println("Remainder: " + a % b);

        // mixing data types
        int c = 10;
        double d = 3.14;
        double e = c + d;
        int f = (int) (c + d);
        System.out.println("double sum: " + e); // 13.14
        System.out.println("int sum: " + f); // 13

        // mul (result beyond limit) - overflow
        int g = 10000000;
        int h = 10000000;
        int i = g * h;
        long j = g * h;
        long jj = (long) g * h;
        long kk = (long) (g * h);
        long ll = g * 10000000;
        System.out.println("int result beyond limit of mul: " + i); // wrong
        System.out.println("long result beyond limit of mul: " + j); // wrong
        System.out.println("long result beyond limit of mul after casting g: " + jj); // right
        System.out.println("long result beyond limit of mul after casting mul: " + kk); // wrong
        System.out.println("long result beyond limit of mul after mul by int literal: " + kk); // wrong


        // mul (result under limit)
        int k = 100;
        int l = 100;
        int m = k * l;
        long n = k * l;
        System.out.println("int result under limit mul: " + m); // right
        System.out.println("long result under limit mul: " + n); // right

        // div
        int aaa = 10;
        int bbb = 3;
        int ccc = aaa / bbb;
        float ddd = aaa / bbb;
        float eee = (float) aaa / bbb;
        float fff = (float) (aaa / bbb);
        float ggg = aaa / 3.33f;
        double hhh = aaa / 3.33;
        System.out.println("div int by int res int: " + ccc); // 3
        System.out.println("div int by int res float: " + ddd); // 3.0
        System.out.println("div int by int res float and casting aaa: " + eee); // 3.3333333
        System.out.println("div int by int res float and casting div: " + fff); // 3.0
        System.out.println("div int by float res float literal: " + ggg); // 3.0030031
        System.out.println("div int by double res double literal: " + hhh); // 3.003003003003003

        // ArithmeticException: / by zero
        int a1 = 2;
        int b1 = a1 - 2;
        try {
            int c1 = a1 / b1;
            int d1 = a1 % b1;
            System.out.println(c1);
            System.out.println(d1);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }

        // operator precedence
        // BODMAS
        // left to right in case of combination of div and mul
        int aa = 10;
        int bb = 5;
        int cc = aa / bb * (3 / 2 - bb + aa);
        System.out.println("BODMAS result: " + cc); // 12

        aa = aa + 1;
        // compound assignment operator
        aa += 1; // same for -, *, /, %
        System.out.println("Increment by 1 twice: " + aa); // 12

        // compound assignment operator does implicit casting
        byte dd = 10;
        byte ee = 10;
        dd = (byte) (dd + ee);
        dd += ee;
        byte ff = (byte) (dd + ee);
        System.out.println("explicit, implicit new assignment result: " + ff); // 40

        // increment and decrement operator
        // post-increment and decrement -> use original value first and then increment or decrement
        int gg = 1;
        gg++; // same as gg += 1;
        gg--; // same as gg -+ 1;
        System.out.println(" post increment and decrement operator result: " + gg); // 1

        int hh = 10;
        // pre-increment and decrement -> increment or decrement value first and then use
        ++hh;
        System.out.println(" pre increment operator result: " + hh); // 11
        System.out.println();
        --hh;
        System.out.println(" pre decrement operator result: " + hh); // 10
        System.out.println();

        // complex post and pre increment or decrement examples
        int ii = 10;
        int mm = ii++;
        System.out.println("post-increment: " + ii); // 11
        System.out.println("post-increment: " + mm); // 10
        System.out.println("post-increment: " + ii); // 11
        int nn = ++ii;
        System.out.println("pre-increment: " + nn); // 12
        int oo = ++nn;
        System.out.println("pre-increment: " + oo); // 13

        int pp = 1;
        int qq = pp++ + pp;
        System.out.println("post-increment add: " + qq); // 3
        int rr = 1;
        int ss = ++rr + rr;
        System.out.println("pre-increment add: " + ss); // 4

        // ++, __ has more precedence than BODMAS
        int tt = 1;
        int uu = tt + tt++;
        System.out.println("post-increment reverse add: " + uu); // 2
        int vv = 1;
        int ww = vv + ++vv;
        System.out.println("pre-increment reverse add: " + ww); // 3

        int xx = 1;
        System.out.println(xx++ + --xx); //2

        double a2 = 1.5, b2 = 2.5, c2 = 3.5;
        System.out.println((a2 + b2) * (c2 - b2) / (a2 + c2)); // 0.8
    }
}
