package basics;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;
        // Binary of number
        System.out.println("Binary of 5: " + Integer.toBinaryString(a)); // 101

        // operands -> byte, short, int and long only
        // operators -> &, |, ^, ~, <<, >>, >>>

        // AND(&) -> tt(t), other(f) -> mul
        int b = 5 & 4;
        System.out.println("5 & 4: " + b); // 4

        // OR(|) -> ff(f), other(t)
        int c = 5 | 4;
        System.out.println("5 | 4: " + c); // 5

        // XOR(^) -> sub (ans positive)
        int d = 5 ^ 4;
        System.out.println("5 ^ 4: " + d); // 1

        // NOT(~) -> flips the bits
        int e = 5;
        int f = ~e;
        System.out.println("~5: " + f); // -6
        System.out.println("Binary of -6: " + Integer.toBinaryString(f)); // 11111111111111111111111111111010

        // Left Shift(<<) -> adds 0 to right
        int g = 5;
        int h = g << 1;
        System.out.println("g << 1: " + h); // 10
        System.out.println("Binary of h: " + Integer.toBinaryString(h)); // 1010

        // Right Shift(>>) -> right shift times elements gets vanished -> (leftmost 1 is -ve and 0 is +ve)
        // Preserves the sign of the number by filling the leftmost bits with the sign bit.
        int i = 5;
        int j = i >> 1;
        System.out.println("i >> 1: " + j); // 2
        System.out.println("Binary of j: " + Integer.toBinaryString(j)); // 10
        int k = i >> 2;
        System.out.println("i >> 2: " + k); // 1
        System.out.println("Binary of k: " + Integer.toBinaryString(k)); // 1

        int ii = -5;
        System.out.println("Binary of -5: " + Integer.toBinaryString(-5)); // 11111111111111111111111111111011
        int jj = ii >> 1;
        System.out.println("ii >> 1: " + jj); // -3
        System.out.println("Binary of jj: " + Integer.toBinaryString(jj)); // 11111111111111111111111111111101
        int kk = ii >> 2;
        System.out.println("ii >> 2: " + kk); // -2
        System.out.println("Binary of kk: " + Integer.toBinaryString(kk)); // 11111111111111111111111111111110

        // Unsigned Right Shift(>>>) -> (leftmost 1 is -ve and 0 is +ve)
        // Does not preserve the sign and always fills the leftmost bits with zero.
        int l = 5;
        int m = l >>> 1;
        System.out.println("l >>> 1: " + m); // 2
        System.out.println("Binary of m: " + Integer.toBinaryString(m)); // 10
        int n = l >>> 2;
        System.out.println("l >>> 2: " + n); // 1
        System.out.println("Binary of n: " + Integer.toBinaryString(n)); // 1

        int ll = -5;
        System.out.println("Binary of -5: " + Integer.toBinaryString(-5)); // 11111111111111111111111111111011
        int mm = ll >>> 1;
        System.out.println("ll >>> 1: " + mm); // 2147483645
        System.out.println("Binary of mm: " + Integer.toBinaryString(mm)); // 1111111111111111111111111111101
        int nn = ll >>> 2;
        System.out.println("ll >>> 2: " + nn); // 1073741822
        System.out.println("Binary of nn: " + Integer.toBinaryString(nn)); // 111111111111111111111111111110
    }
}