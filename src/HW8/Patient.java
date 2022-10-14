package HW8;

public class Patient {
    private String treatment1 = "лабораторное обследование, инструментальное обследование, оперативное лечение, прием медикаментов и восстановительная терапия";
    private String treatment2 = "профессиональная чистка зубов, панорамный снимок челюсти, лечение кариеса и пломбировка";
    private String treatment3 = "лабораторное обследование, инструментальное обследование, прием медикаментов";
    private String treatment4 = "профилактический скрининг - ОАК, ОАМ, БАК, глюкоза, гормоны щитовидной железы, ЭКГ, флюорография, УЗИ брюшной полости и сердца";
    Therapist therapist = new Therapist();
    Surgeon surgeon = new Surgeon();
    Dentist dentist = new Dentist();
    public int treatmentPlan(int number) {
        this.treatment1 = treatment1;
        this.treatment2 = treatment2;
        this.treatment3 = treatment3;
        this.treatment4 = treatment4;

        if (number == 1) {
            surgeon.treat();
            System.out.println("Ваш план лечения:" + treatment1);
        } else if (number == 2) {
            dentist.treat();
            System.out.println("Ваш план лечения:" + treatment2);
        } else if (number == 3) {
            therapist.treat();
            System.out.println("Ваш план лечения:" + treatment3);
        } else if (number == 4) {
            therapist.treat();
            System.out.println("Ваш план лечения:" + treatment4);
        } else {
            System.out.println("Вы ввели несуществующий код лечения. Перезапустите программу и повторите ввод");
        }
        return number;
    }
}
