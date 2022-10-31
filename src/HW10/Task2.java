package HW10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfWords = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            arrayOfWords[i] = scanner.nextLine();
        }
        for (int i = arrayOfWords.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayOfWords[j].length() > arrayOfWords[j + 1].length()) {
                    String buffer = arrayOfWords[j];
                    arrayOfWords[j] = arrayOfWords[j + 1];
                    arrayOfWords[j + 1] = buffer;
                }
            }
        }
        for (String word : arrayOfWords) {
            System.out.println(word);
        }
    }
}
