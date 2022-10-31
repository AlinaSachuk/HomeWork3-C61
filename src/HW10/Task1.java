package HW10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfWords = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            arrayOfWords[i] = scanner.nextLine();
        }
        String maxLength = arrayOfWords[0];
        String minLength = arrayOfWords[0];
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (arrayOfWords[i].length() > maxLength.length()) {
                maxLength = arrayOfWords[i];
            }
            if (arrayOfWords[i].length() < minLength.length()) {
                minLength = arrayOfWords[i];
            }
        }
        System.out.println("самая длинная строка " + maxLength + ". Ее длина " + maxLength.length());
        System.out.println("самая короткая строка " + minLength + ". Ее длина " + minLength.length());
    }
}
