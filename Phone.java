package HomeWork1;

public class Phone {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("createPhoneNumber");
    }

    public static String createPhoneNumber(int[] numbers) {
        int total = 10;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 1;
            total += numbers[i];
        }
            return  "( " + numbers[0] + numbers[1] + numbers[2] + ")" + numbers[3] + numbers[4] + numbers[5] + " - " + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        }

}