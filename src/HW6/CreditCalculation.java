package HW6;

public class CreditCalculation {
    public static void main(String args[]) {
        System.out.print("Информация по карте №1: ");
        CreditCard card1 = new CreditCard(12341234, 187.32);
        card1.getCreditCardInfo();
        System.out.print("Информация по карте №1 после зачисления: ");
        card1.accrualSum(13);
        card1.getCreditCardInfo();
        System.out.print("Информация по карте №2: ");
        CreditCard card2 = new CreditCard(56435643, 10.34);
        card2.getCreditCardInfo();
        card2.accrualSum(567);
        System.out.print("Информация по карте №2 после зачисления: ");
        card2.getCreditCardInfo();
        System.out.print("Информация по карте №3: ");
        CreditCard card3 = new CreditCard(34523452, 984.2);
        card3.getCreditCardInfo();
        card3.getMoney(456);
        System.out.print("Информация по карте №2 после снятия: ");
        card3.getCreditCardInfo();
    }
}
