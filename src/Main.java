import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        switch (13) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 12:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("нет совпадений");
        }
        int number1 = 11;
        if (number1 == 1 || number1 == 2 || number1 == 12) {
            System.out.println("Зима");
        } else if (number1 == 3 || number1 == 4 || number1 == 5) {
            System.out.println("Весна");
        } else if (number1 == 6 || number1 == 7 || number1 == 8) {
            System.out.println("Лето");
        } else if (number1 == 9 || number1 == 10 || number1 == 11) {
            System.out.println("Осень");
        }
        int Value = 12;
        if (Value % 2 == 0) {
            System.out.println("Число четное");
        } else if (Value % 2 != 0) {
            System.out.println("число нечетное");
        }
        int t = -20;
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 || t > -20) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i);
            }
        }
        for (int i = 8; i > 0; i--) {
            if (i <= 6) {
                System.out.println(i);
            }
        }
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 0; i > +-45; i--) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 10; i <= 20; i++) {
            System.out.println(Math.pow(i, 2));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввведите целое положительное число");
        if (scanner.hasNextInt()) {
            int somenumber = scanner.nextInt();
            if (somenumber <= 0) {
                System.out.println("Вы ввели 0 или отрицательное число. Перезапустите программу и введите новое число");
                scanner.close();
            }
            int summ = 0;
            for (int i = 1; i < somenumber; i++) {
                summ += i;
            }
            System.out.println(summ);
            scanner.close();
        } else {
            System.out.println("Вы ввели не число. Перезапустите программу и введите новое число");
            scanner.close();
        }
    }
}