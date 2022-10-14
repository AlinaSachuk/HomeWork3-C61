package HW6;

public class CreditCard extends CreditCalculation {
    int accountNumber;
    double sumOnCard;

    public CreditCard() {
    }

    public double accrualSum(double sumOnCard, double x) {
        return sumOnCard + x;
    }

    public double getMoney(double sumOnCard, double y) {
        return sumOnCard - y;
    }

    public void CreditCardInfo() {
        System.out.println("Номер счета: " + accountNumber + ", " + "Остаток на счету: " + sumOnCard);
    }
}
