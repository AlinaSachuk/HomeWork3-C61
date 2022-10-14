package HW6;

public class CreditCalculation {
    public static void main(String args[]) {
        System.out.println("Информация по карте №1");
        Card1 card1 = new Card1();
        card1.CreditCardInfo();
        System.out.println("сумма на счету карты №1 после зачисления - " + card1.accrualSum(card1.sumOnCard, 364.0));
        System.out.println("Информация по карте №2");
        Card2 card2 = new Card2();
        card2.CreditCardInfo();
        System.out.println("сумма на счету карты №2 после зачисления - " + card2.accrualSum(card2.sumOnCard, 1943));
        System.out.println("Информация по карте №3");
        Card3 card3 = new Card3();
        card3.CreditCardInfo();
        System.out.println("сумма на счету карты №3 после снятия - " + card3.getMoney(card3.sumOnCard, 89.2));
    }
}
