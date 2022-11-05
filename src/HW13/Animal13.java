package HW13;

import java.util.LinkedList;

public class Animal13 {
    private String animalName;
    LinkedList<String> animals = new LinkedList<>();

    public Animal13() {
        this.animals = animals;
    }

    public String addAnimal(String animalName) {
        animals.addLast(animalName);
        return animalName;
    }

    public String deleteAnimal() {
        animals.removeFirst();
        return "Last element of Animal collection deleted";
    }

    @Override
    public String toString() {
        return String.valueOf(animals);
    }
}
