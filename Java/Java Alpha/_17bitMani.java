import java.util.*;

public class _17bitMani {

    /*
     * public static void main(String args[]) {
     * int n, bitmask = 1;
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter the number : ");
     * n = sc.nextInt();
     * if ((n & bitmask) == 0) {
     * System.out.println("Number is even");
     * } else {
     * System.out.println("number is odd");
     * }
     * }
     */

    // public static int getbit(int n, int i) {
    // int bitMask = 1 << i;
    // if ((n & bitMask) == 0) {
    // return 0;
    // } else {
    // return 1;
    // }
    // }

    // public static void main(String args[]) {
    // System.out.println(getbit(10, 3));
    // }

    public static int setBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIbit(int n, int i, int newBit) {
        // if (newBit == 0) {
        // return clearBit(n, i);
        // } else {
        // return setBit(n, i);
        // }
        n = clearBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIBits(int n, int bitMask) {
        bitMask = (~0) << 2;
        return n & bitMask;

    }

    public static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {
        // System.out.println(setBit(10, 2));
        // System.out.println(clearBit(10, 1));
        // System.out.println(updateIbit(10, 2, 1));
        // System.out.println(clearLastIBits(15, 2));
        // System.out.println(clearBitsInRange(10, 2, 4));
        System.out.println(isPowerOfTwo(15));

    }
}
