package HW9;

public class Main {
    public static void main(String[] args) {
        RussianHen hen1 = new RussianHen();
        System.out.println(hen1.getCountOfEggsPerMonth());
        RussianHen hen2 = new RussianHen();
        RussianHen hen3 = new RussianHen();
        System.out.println(RussianHen.countOfRussianEggs);
        System.out.println(hen1.getDescription());
    }
}
