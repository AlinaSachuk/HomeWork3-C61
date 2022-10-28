package HW11;

public class House {
    private int numberOfRooms;

    public House(int numberOfRooms) throws HouseException{
        if (numberOfRooms < 1){
            throw new HouseException(numberOfRooms);
        }
        this.numberOfRooms = numberOfRooms;
        System.out.println("There are " + numberOfRooms + " rooms in this house.");
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
