package HW13;

public class HomeWork13 {
    public static void main(String[] args) {
        Animal13 animal = new Animal13();
        animal.addAnimal("cat");
        animal.addAnimal("dog");
        animal.deleteAnimal();
        animal.addAnimal("tiger");
        animal.addAnimal("cow");
        animal.addAnimal("pig");
        animal.deleteAnimal();
        System.out.println(animal);
    }
}
