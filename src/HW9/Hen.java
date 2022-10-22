package HW9;

import java.util.Random;

public abstract class Hen {
    static int totalEggsPerYear;
    public abstract int getCountOfEggsPerMonth();

    public String getDescription() {
        return "Я курица. ";
    }
    public Hen (){
        Hen.totalEggsPerYear = RussianHen.countOfRussianEggs + BelorusianHen.countOfBelorusianEggs + UkrainianHen.countOfUkrainianEggs + MoldovanHen.countOfMoldovanEggs;
    }
}
