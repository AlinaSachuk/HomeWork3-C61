package HW8;

public class Surgeon extends Doctor{
    @Override
    public void treat() {
        super.treat();
        System.out.println("хирург");
    }
}
