package HW11;

public class House {
    private int numberOfRooms;
    private int numberOfBathrooms;
    private String floorColor;
    private String floorMaterial;

    public House(int numberOfRooms, int numberOfBathrooms, String floorColor, String floorMaterial) throws HouseException {
        if (numberOfRooms < 1) {
        } else if (numberOfBathrooms > 3) {
        } else if (floorColor.equals("pink")) {
        } else if (floorMaterial.equals("oak")) {
            throw new HouseException(numberOfRooms, numberOfBathrooms, floorColor, floorMaterial);
        }
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.floorColor = floorColor;
        this.floorMaterial = floorMaterial;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", floorColor='" + floorColor + '\'' +
                ", floorMaterial='" + floorMaterial + '\'' +
                '}';
    }
}
