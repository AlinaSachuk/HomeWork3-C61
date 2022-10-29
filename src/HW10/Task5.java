package HW10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимое количество слов в виде цифры.");
        int numberOfWords = scanner.nextInt();
        for (int n = 0; n < numberOfWords; n++) {
            System.out.println("Введите слово, состоящее только из цифр.");
            StringBuilder line = new StringBuilder(scanner.next());
            StringBuilder lineToReverse = new StringBuilder(line.reverse());
            line.reverse();
            String x = String.valueOf(line);
            String y = String.valueOf(lineToReverse);
            if (x.equals(y)) {
                System.out.println(line + " - это слово-палиндром");
            }
        }
    }
}
