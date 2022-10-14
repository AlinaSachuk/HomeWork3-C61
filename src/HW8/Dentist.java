package HW8;

public class Dentist extends Doctor{
    @Override
    public void treat() {
        super.treat();
        System.out.println("стоматолог");
    }
}
