package HW9;

public class MoldovanHen extends Hen {
    private int numberOfMoldovanEggsPerMonth = 46;
    static int countOfMoldovanEggs = 0;

    @Override
    public int getCountOfEggsPerMonth() {
        return numberOfMoldovanEggsPerMonth;
    }
    public MoldovanHen() {
        countOfMoldovanEggs += getCountOfEggsPerMonth();
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Молдова. Я несу " + numberOfMoldovanEggsPerMonth + " яиц в месяц.";
    }
}
