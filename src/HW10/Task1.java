package HW10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1.");
        String line1 = scanner.nextLine();
        System.out.println("Введите строку 2.");
        String line2 = scanner.nextLine();
        System.out.println("Введите строку 3.");
        String line3 = scanner.nextLine();
        Integer x1 = Integer.parseInt(String.valueOf(line1.length()));
        Integer x2 = Integer.parseInt(String.valueOf(line2.length()));
        Integer x3 = Integer.parseInt(String.valueOf(line3.length()));
        if (x1 > x2 & x1 > x3){
            System.out.println("Самая длинная строка - "+ line1 + ". Длина этой строки - " + x1);
        } else if (x2 > x1 & x2 > x3){
            System.out.println("Самая длинная строка - "+ line2 + ". Длина этой строки - " + x2);
        } else if (x3 > x1 & x3 > x2) {
            System.out.println("Самая длинная строка - "+ line3 + ". Длина этой строки - " + x3);
        } else {
            System.out.println("Вы ввели строки с одинаковой длинной. Перезапустите программу и введите новые строки.");
        }
        if (x1 < x2 & x1 < x3){
            System.out.println("Самая короткая строка - "+ line1 + ". Длина этой строки - " + x1);
        } else if (x2 < x1 & x2 < x3){
            System.out.println("Самая короткая строка - "+ line2 + ". Длина этой строки - " + x2);
        } else if (x3 < x1 & x3 < x2) {
            System.out.println("Самая короткая строка - "+ line3 + ". Длина этой строки - " + x3);
        } else {
            System.out.println("Вы ввели строки с одинаковой длинной. Перезапустите программу и введите новые строки.");
        }
    }
}
