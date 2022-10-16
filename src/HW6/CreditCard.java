package HW6;

public class CreditCard extends CreditCalculation {
    int accountNumber;
    double sumOnCard;

    public CreditCard(int accountNumber, double sumOnCard) {
        this.accountNumber = accountNumber;
        this.sumOnCard = sumOnCard;
    }

    public double accrualSum(double sumToAdd) {
        return sumOnCard += sumToAdd;
    }

    public double getMoney(double sumToGet) {
        return sumOnCard -= sumToGet;
    }

    public void getCreditCardInfo() {
        System.out.println("Номер счета: " + accountNumber + ", " + "Остаток на счету: " + sumOnCard);
    }
}
