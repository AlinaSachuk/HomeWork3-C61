package HW6;

public class Card3 extends CreditCard{
    {
        accountNumber = 43214321;
        sumOnCard = 78.54;
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
