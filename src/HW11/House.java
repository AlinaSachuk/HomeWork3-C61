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

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public String getFloorColor() {
        return floorColor;
    }

    public String getFloorMaterial() {
        return floorMaterial;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public void setFloorColor(String floorColor) {
        this.floorColor = floorColor;
    }

    public void setFloorMaterial(String floorMaterial) {
        this.floorMaterial = floorMaterial;
    }
}
