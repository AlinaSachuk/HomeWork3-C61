package HW10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку 1.");
        String line1 = scanner.nextLine();
        System.out.println("Введите строку 2.");
        String line2 = scanner.nextLine();
        System.out.println("Введите строку 3.");
        String line3 = scanner.nextLine();
        int l1 = line1.length();
        int l2 = line2.length();
        int l3 = line3.length();
        System.out.print("Строки в порядке возрастания их длинны: ");
        if (l1 > l2 & l1 > l3 & l2 > l3) {
            System.out.println(line3 + ", " + line2 + ", " + line1);
        } else if (l1 > l2 & l1 > l3 & l3 > l2) {
            System.out.println(line2 + ", " + line3 + ", " + line1);
        } else if (l1 > l2 & l1 > l3 & l3 == l2) {
            System.out.println(line1 + ", " + line2 + ", " + line1);
        } else if (l2 > l1 & l2 > l3 & l1 > l3) {
            System.out.println(line3 + ", " + line1 + ", " + line2);
        } else if (l2 > l1 & l2 > l3 & l3 > l1) {
            System.out.println(line1 + ", " + line3 + ", " + line2);
        } else if (l2 > l1 & l2 > l3 & l3 == l1) {
            System.out.println(line1 + ", " + line3 + ", " + line2);
        } else if (l3 > l1 & l3 > l2 & l1 > l2){
            System.out.println(line2 + ", " + line1 + ", " + line3);
        } else if (l3 > l1 & l3 > l2 & l2 > l1) {
            System.out.println(line1 + ", " + line2 + ", " + line3);
        } else if (l3 > l1 & l3 > l2 & l1 == l2) {
            System.out.println(line1 + ", " + line2 + ", " + line3);
        } else {
            System.out.println("Вы ввели не строку. Перезапустите программу и повторите ввод.");
        }
    }
}
