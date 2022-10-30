package HW11;

public class House {
    private int numberOfRooms;
    private int numberOfBathrooms;
    private String floorColor;
    private String floorMaterial;

    public House(int numberOfRooms, int numberOfBathrooms, String floorColor, String floorMaterial) throws HouseException {
        if (numberOfRooms < 2 || numberOfBathrooms > 5 || numberOfBathrooms < 2 || floorColor.equals("pink") || floorMaterial.equals("glass")) {
            throw new HouseException(numberOfRooms, numberOfBathrooms, floorColor, floorMaterial);
        }
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.floorColor = floorColor;
        this.floorMaterial = floorMaterial;
        System.out.println("Your house has " + numberOfRooms + " rooms. There are " + numberOfBathrooms + " bathrooms in this house with " + floorColor + " floor made of " + floorMaterial + ".");
    }
}
