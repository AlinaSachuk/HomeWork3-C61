package HW10;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово №1, состоящее только из цифр.");
        StringBuilder line1 = new StringBuilder(scanner.nextLine());
        System.out.println("Введите слово №2, состоящее только из цифр.");
        StringBuilder line2 = new StringBuilder(scanner.nextLine());
        System.out.println("Введите слово №3, состоящее только из цифр.");
        StringBuilder line3 = new StringBuilder(scanner.nextLine());
        if (line1.reverse().equals(line1)) {
            System.out.println(line1 + " - это слово-палиндром");
        } else if (line2.reverse().equals(line2)) {
            System.out.println(line2 + " - это слово-палиндром");
        } else if (line3.reverse().equals(line3)) {
            System.out.println(line3 + " - это слово-палиндром");
        } else {
            System.out.println("Повторите попытку");
        }
    }
}
