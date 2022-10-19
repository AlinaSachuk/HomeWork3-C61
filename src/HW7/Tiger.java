package HW7;

public class Tiger extends Animal implements Eat {
    @Override
    public void eat() {
        Eat.super.eat();
        System.out.println("Nигр - хищник, ест мясо");
    }

    @Override
    public void getAnimal() {
        System.out.println("This is tiger");
    }
}
