package HW11;

public class HouseException extends Exception {
    private int numberOfRooms;
    private int numberOfBathrooms;
    private String floorColor;
    private String floorMaterial;

    public HouseException(int numberOfRooms, int numberOfBathrooms, String floorColor, String floorMaterial) {
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.floorColor = floorColor;
        this.floorMaterial = floorMaterial;
    }
}
