package HomeWork1;

public class BitwiseOperations {
    public static void main(String[] args) {
          int a = 42;
          int b = 15;
          int c = a | b; //
          int d = a & b; //
          int e = a ^ b; //
          int f = ~b; //

        System.out.println("a =" + Integer.toBinaryString(a));
        // 101010
        System.out.println("b =" + Integer.toBinaryString(b));
        // 1111
        System.out.println("a | b =" + Integer.toBinaryString(c));
        // 101111
        System.out.println("a & b = " + Integer.toBinaryString(d));
        // 1010
        System.out.println("a ^ b =" + Integer.toBinaryString(e));
        // 100101
        System.out.println("~b =" + Integer.toBinaryString(f));
        // 11111111111111111111111111110000




    }

}
