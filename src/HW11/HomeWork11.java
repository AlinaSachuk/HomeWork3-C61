package HW11;

public class HomeWork11 {
    public static void main(String[] args) {
        int[] someArray = {123, 234, 56, 12, 342};
        System.out.println("Task 11.1");
        try {
            System.out.println(someArray[56]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Warning!!! You entered non-existent index!");
        }
        System.out.println("Task 11.2");
        try {
            int[] newArray = new int[10];
            newArray[0] = 0;
            newArray[8] = 34;
            int x = newArray[144];
            int divisionNumber = newArray[8] / newArray[0];
        } catch (ArithmeticException arithmeticException) {
            System.out.println("You can`t divide by zero!");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("You entered non-existent index!");
        }
        System.out.println("Task 11.3");
        try {
            House house = new House(0, 6, "pink", "oak");
        } catch (HouseException | RuntimeException e) {
            System.out.println("Your entered incorrect parameters for House.");
        }
        System.out.println("Task 11.4");
        try {
            System.out.println(someArray[15]);
        } catch (IndexOutOfBoundsException e) {
            System.out.print("Warning!!! You entered non-existent index! ");
        } finally {
            System.out.println("Meaning of the first element of massive is: " + someArray[0] + ". Operator finally completed.");
        }
    }
}
