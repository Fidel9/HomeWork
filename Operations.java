package HomeWork1;

public class Operations {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int d = a + b / c; // 5 получается в следствии деления с лева на права и прибавление 0 к 5
        int e = (5 + 2) / 8;  // 0 первоначально выполняется действие в скобках и деления 7 на 8
        int f = (5 + b++) / 8; //0  инкремент постфиксальный пребовляет к 5+2 7 и производится деление на 8
        int g = (5 + b++) / --c; //1 инкремент прибавляет 2 к 5  операция декремента приорететнее чем деление
        int h = (5 * 2 >> b++) / --c; //0 первые операции  инкремент и декремент, затем умножение.Результат  побитово сдвигается вправо на 2 знака и результат сдвига делится на 7
        int i = (5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --c; //0
       // int j = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> b++) / --8; не компилируется
        boolean k =  6 - 2 > 3 && 12 * 12 <= 119; //false  a & b  а и b истины b оценивается условно (если а истино в не вычисляется)
       boolean z = true && false;//false

        System.out.println(d);
        System.out.println( e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        System.out.println(k);
        System.out.println(z);
    }
}
