package HW10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfWords = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            arrayOfWords[i] = scanner.nextLine();
        }
        double averageLength = 0;
        for (int i = 0; i < arrayOfWords.length; i++) {
            averageLength = averageLength + ((double) arrayOfWords[i].length());
        }
        averageLength = averageLength / arrayOfWords.length;
        for (String word : arrayOfWords) {
            if (word.length() < averageLength) {
                System.out.println("Word: " + word + ". Size: " + word.length());
            }
        }
    }
}
