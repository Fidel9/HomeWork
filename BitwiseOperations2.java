package HomeWork1;

public class BitwiseOperations2 {
    public static void main(String[] args) {
        int a = -42; //
        int b = -15; //
        int c = a | b; //
        int d = a & b; //
        int e = a ^ b; //
        int f = ~b; //
        System.out.println("a =" + Integer.toBinaryString(a));
        // 11111111111111111111111111010110
        System.out.println("b =" + Integer.toBinaryString(b));
        //  11111111111111111111111111110001
        System.out.println("a | b =" + Integer.toBinaryString(c));
        // 11111111111111111111111111110111
        System.out.println("a & b = " + Integer.toBinaryString(d));
        //  11111111111111111111111111010000
        System.out.println("a ^ b =" + Integer.toBinaryString(e));
        // 100111
        System.out.println("~b =" + Integer.toBinaryString(f));
        // 1110
    }

}


