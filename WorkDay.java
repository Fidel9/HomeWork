package HomeWork1;

public class WorkDay {
    public static void main(String[] args) {
        boolean weekDay = true;
        boolean vacation = false;
    }
    public static boolean  sleepIn(boolean weekDay,boolean vacation) {
        if (!weekDay || vacation) {
            System.out.println("спать дальше");
            return true;}
            else{
            System.out.println("пора идти на работу");
            return false;}
        }

    }

