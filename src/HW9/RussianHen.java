package HW9;

public class RussianHen extends Hen {
    private int numberOfRussianEggsPerMonth = 30;
    static int countOfRussianEggs = 0;

    @Override
    public int getCountOfEggsPerMonth() {
        return numberOfRussianEggsPerMonth;
    }


    public RussianHen () {
        countOfRussianEggs += getCountOfEggsPerMonth()*12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Россия. Я несу " + numberOfRussianEggsPerMonth + " яиц в месяц.";
    }
}
