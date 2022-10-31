package HW10;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfWords = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите " + (i + 1) + " строку");
            arrayOfWords[i] = scanner.nextLine();
        }
        for (String word : arrayOfWords) {
            boolean flag = true;
            for (int i = 0; i < word.length() - 1; i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)){
                        flag = false;
                        break;
                    }
                }
            }
            if (flag){
                System.out.print("Слово, состоящее только из различных символов: " + word);
                break;
            }
        }
    }
}
