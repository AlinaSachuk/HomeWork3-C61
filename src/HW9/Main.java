package HW9;

public class Main {
    public static void main(String[] args) {
        int totalEggs = 0;
        for (int i = 0; i < 25; i++) {
            Hen russianHen = new RussianHen();
            Hen belorusianHen = new BelorusianHen();
            Hen ukrainianHen = new UkrainianHen();
            Hen moldovanHen = new MoldovanHen();
            System.out.println(russianHen.getDescription());
            System.out.println(belorusianHen.getDescription());
            System.out.println(ukrainianHen.getDescription());
            System.out.println(moldovanHen.getDescription());
            totalEggs += russianHen.getTotalEggsPerYear() + belorusianHen.getTotalEggsPerYear() + ukrainianHen.getTotalEggsPerYear() + moldovanHen.getTotalEggsPerYear();
        }
        System.out.println("Общее количество яиц, снесённых за год на фабрике: " + totalEggs);
    }
}
