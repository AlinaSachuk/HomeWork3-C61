package HW10;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимое количество строк в виде числа.");
        int numberOfWords = scanner.nextInt();
        for (int n = 0; n < numberOfWords; n++) {
            System.out.println("Введите строку:");
            String line = scanner.next();
            char[] array = line.toCharArray();
            int counter = 0;
            for (int i = 0; i < line.length(); i++) {
                for (int j = i + 1; j < line.length(); j++) {
                    if (array[i] != array[j]) {
                        counter++;
                    }
                }
            }
            if (counter > 0) {
                System.out.print("Слово, состоящее только из различных символов: " + line);
                break;
            }
        }
    }
}
