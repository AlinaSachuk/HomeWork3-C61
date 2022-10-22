package HW9;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            RussianHen someName = new RussianHen();
            System.out.println(someName.getDescription());
        }
        for (int i = 0; i < 25; i++) {
            BelorusianHen someName = new BelorusianHen();
            System.out.println(someName.getDescription());
        }
        for (int i = 0; i < 25; i++) {
            UkrainianHen someName = new UkrainianHen();
            System.out.println(someName.getDescription());
        }
        for (int i = 0; i < 25; i++) {
            MoldovanHen someName = new MoldovanHen();
            System.out.println(someName.getDescription());
        }
        System.out.println(RussianHen.countOfRussianEggs);
        System.out.println(BelorusianHen.countOfBelorusianEggs);
        System.out.println(UkrainianHen.countOfUkrainianEggs);
        System.out.println(MoldovanHen.countOfMoldovanEggs);
        System.out.println("Общее количество яиц, снесённых за год на фабрике: " + Hen.totalEggsPerYear);

    }
}
