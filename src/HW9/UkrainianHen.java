package HW9;

public class UkrainianHen extends Hen {
    private int numberOfUkrainianEggsPerMonth = 52;

    @Override
    public int getCountOfEggsPerMonth() {
        return numberOfUkrainianEggsPerMonth;
    }

    @Override
    public int getTotalEggsPerYear() {
        return getCountOfEggsPerMonth() * 12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Украина. Я несу " + numberOfUkrainianEggsPerMonth + " яиц в месяц.";
    }
}
