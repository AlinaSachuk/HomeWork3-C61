package HW11;

public class HouseException extends ArithmeticException{
    int numberOfRooms;

    public HouseException (int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public String toString() {
        return "You entered illegal number of rooms in a house!";
    }
}
