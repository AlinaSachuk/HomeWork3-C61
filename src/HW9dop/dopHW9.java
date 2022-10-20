package HW9dop;

import java.util.Arrays;

public class dopHW9 {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        System.out.println("Input: " + Arrays.toString(array));
        String line = "";
        for (int i = 0; i < array.length; i++){
            line += array[i];
        }
        Integer number = Integer.parseInt(line);
        int newNumber = number + 1;
        String newLine = String.valueOf(newNumber);
        System.out.println("Output: " + newLine);
    }
}
