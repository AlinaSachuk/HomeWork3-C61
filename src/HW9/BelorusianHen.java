package HW9;

public class BelorusianHen extends Hen {
    private int numberOfBelorusianEggsPerMonth = 50;

    @Override
    public int getCountOfEggsPerMonth() {
        return numberOfBelorusianEggsPerMonth;
    }

    @Override
    public int getTotalEggsPerYear() {
        return getCountOfEggsPerMonth() * 12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Беларусь. Я несу " + numberOfBelorusianEggsPerMonth + " яиц в месяц.";
    }


}
