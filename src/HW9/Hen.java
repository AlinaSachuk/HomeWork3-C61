package HW9;

import java.util.Random;

public abstract class Hen {
    public abstract int getCountOfEggsPerMonth();

    public abstract int getTotalEggsPerYear();

    public String getDescription() {
        return "Я курица. ";
    }
}
