package HW6;

public class Card1 extends CreditCard{
    {
        accountNumber = 12341234;
        sumOnCard = 234.45;
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
