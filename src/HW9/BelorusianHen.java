package HW9;

public class BelorusianHen extends Hen {
    private int numberOfBelorusianEggsPerMonth = 50;
    static int countOfBelorusianEggs = 0;

    @Override
    public int getCountOfEggsPerMonth() {
        return numberOfBelorusianEggsPerMonth;
    }
    public BelorusianHen() {
        countOfBelorusianEggs += getCountOfEggsPerMonth();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Беларусь. Я несу " + numberOfBelorusianEggsPerMonth + " яиц в месяц.";
    }
}
