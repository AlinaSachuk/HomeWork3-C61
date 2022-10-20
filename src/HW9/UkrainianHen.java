package HW9;

public class UkrainianHen extends Hen {
    private int numberOfUkrainianEggsPerMonth = 52;
    static int countOfUkrainianEggs = 0;

    @Override
    public int getCountOfEggsPerMonth() {
        return numberOfUkrainianEggsPerMonth;
    }
    public UkrainianHen() {
        countOfUkrainianEggs += getCountOfEggsPerMonth();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Украина. Я несу " + numberOfUkrainianEggsPerMonth + " яиц в месяц.";
    }
}
