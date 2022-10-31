package HW10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            array[i] = scanner.nextLine();
        }
        for (String number : array) {
            boolean palindrom = true;
            for (int i = 0; i < number.length() / 2; i++) {
                if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                    palindrom = false;
                    break;
                }
            }
            if (palindrom) {
                System.out.print("слово-палиндром: " + number);
                break;
            }
        }
    }
}
