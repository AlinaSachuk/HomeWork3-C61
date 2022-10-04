import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        System.out.println("Домашняя работа №3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввведите размер массива в виде числа");
        int someValue = scanner.nextInt();
        double array[] = new double[someValue];
        System.out.println("массив заполнен методом Math.random");
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
            System.out.println(array[i]);
        }
        System.out.println("Задание 1 - элементы массива в прямом порядке");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Задание 1 - элементы массива в обратном порядке");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
        System.out.println("Задание 2 - максимальный элемент массива");
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
            System.out.println(max);
        System.out.println("Задание 2 - минимальный элемент массива");
        double min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                System.out.println(min);
            }
        }
        System.out.println("Задание 3");

        System.out.println("Задание 4");
        for (int i = 0; i < array.length; i++) {
            if (array [i] == 0) {
                System.out.println(array[i]);
            } else {
                System.out.println("нулевых элементов в массиве нет");
                break;
            }
        }
        System.out.println("Задание 5");
        System.out.println("Задание 6");
    }
}

