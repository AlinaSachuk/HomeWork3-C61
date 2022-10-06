import java.util.Arrays;
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
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            double value = array[i];
            if (min > value) {
                min = value;
            }
        }
        System.out.println(min);
        System.out.println("Задание 3 - индекс максимального элемента массива");
        int indexMax = 0;
        double maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            double score = array[i];
            if (maximum < score) {
                maximum = score;
                indexMax = i;
            }
        }
        System.out.println(indexMax);
        System.out.println("Задание 3 - индекс минимального элемента массива");
        int indexMin = 0;
        double minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            double score = array[i];
            if (minimum > score) {
                minimum = score;
                indexMin = i;
            }
        }
        System.out.println(indexMin);
        System.out.println("Задание 4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println(array[i]);
            } else {
                System.out.println("нулевых элементов в массиве нет");
                break;
            }
        }
        System.out.println("Задание 6");
        boolean sequence = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sequence = false;
            }
        }
        System.out.println("Массив является возрастающей последовательностью?" + " " + sequence);
        System.out.println("массив должен быть заполнен пользователем вручную");
        for (int i = 0; i < someValue; i++){
            array [i] = scanner.nextInt();
            System.out.println(array[i]);
        }
        System.out.println("Задание 5 - поменять местами 1 и последний элементы массива, второй и предпоследний элементы массива");
        for (int i = 0, j = array.length - 1; i < array.length/2 & j/2 >= 0; i++, j--) {
            double x = array[i];
            array[i] = array[j];
            array[j] = x;
            System.out.println(array);
        }
    }
}

