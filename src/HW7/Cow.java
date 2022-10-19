package HW7;

public class Cow extends Animal implements Eat{
    @Override
    public void eat() {
        Eat.super.eat();
        System.out.println("Корова - травоядное животное");
    }

    @Override
    public void getAnimal() {
        System.out.println("This is cow");
    }
}
