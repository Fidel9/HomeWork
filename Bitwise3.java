package HomeWork1;

public class Bitwise3 {
    public static void main(String[] args) {
        int a = 42;
        int b = 15;
        for (int i = 0; i < 10; i++) {
            System.out.println("Поделим: " + a + " на 2");
            int c = a >> b;
            System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
            System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
            System.out.println("Результат: " + c);
            a = c;
        }
    }
}