package HW8;

public class Therapist extends Doctor{
    @Override
    public void treat() {
        super.treat();
        System.out.println("терапевт");
    }

}
