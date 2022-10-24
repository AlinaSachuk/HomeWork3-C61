package HW9dop;

import java.util.Arrays;

public class DopHW9 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        System.out.println("Input: " + Arrays.toString(array));
        String line = "";
        for (int i = 0; i < array.length; i++) {
            line += array[i];
        }
        Integer number = Integer.parseInt(line);
        int newNumber = number + 1;
        String newLine = String.valueOf(newNumber);
        int[] newArray = new int[newLine.length()];
        for (int i = 0; i < newLine.length(); i++) {
            newArray[i] = Integer.parseInt(String.valueOf(newLine.charAt(i)));
        }
        System.out.println("Output: " + Arrays.toString(newArray));
    }
}
