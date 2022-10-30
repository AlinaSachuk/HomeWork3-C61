package HW11;

import HW7.Eat;

public class HomeWork11 {
    public static void main(String[] args) {
        int[] someArray = {123, 234, 56, 12, 342};
        System.out.println("Task 11.1");
        try {
            System.out.println(someArray[56]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Warning!!! Exception: " + e);
        }
        System.out.println("Task 11.2");
        try {
            int[] newArray = new int[10];
            newArray[0] = 0;
            newArray[8] = 34;
            int divisionNumber = newArray[8] / newArray[0];
            int x = newArray[144];
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Warning!!! Exception: " + arithmeticException);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Warning!!! Exception: " + indexOutOfBoundsException);
        }
        System.out.println("Task 11.3");
        try {
            House house = new House(4, 7, "black", "wood");
        } catch (HouseException | RuntimeException e) {
        }
        System.out.println("Task 11.4");
        try {
            System.out.println(someArray[15]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Warning!!! Exception: " + e + ".");
        } finally {
            System.out.println("Meaning of the first element of massive is: " + someArray[0] + ". Operator finally completed.");
        }
        System.out.println("Task 11.dop");
        try {
            System.out.println(someArray[15]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Warning!!! You entered non-existent index! ");
            System.exit(0);
        } finally {
            System.out.println("Operator finally completed");
        }
    }
}
