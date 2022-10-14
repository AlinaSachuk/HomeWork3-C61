package HW6;

public class Card2 extends CreditCard{
    {
        accountNumber = 23452345;
        sumOnCard = 102.99;
    }

    @Override
    public double accrualSum(double sumOnCard, double x) {
        return super.accrualSum(sumOnCard, x);
    }

    @Override
    public double getMoney(double sumOnCard, double y) {
        return super.getMoney(sumOnCard, y);
    }
}
