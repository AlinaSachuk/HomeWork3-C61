package HW9;

public class MoldovanHen extends Hen {
    private int numberOfMoldovanEggsPerMonth = 46;

    @Override
    public int getCountOfEggsPerMonth() {
        return numberOfMoldovanEggsPerMonth;
    }

    @Override
    public int getTotalEggsPerYear() {
        return getCountOfEggsPerMonth() * 12;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Моя страна - Молдова. Я несу " + numberOfMoldovanEggsPerMonth + " яиц в месяц.";
    }
}
