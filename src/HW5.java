import java.util.Scanner;

public class HW5 {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №5");
        int[][] array2Dim = {{2, 4, 6, 8, 10, 12, 14}, {10, 20, 30, 40, 100}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число, которое вы хотите добавить к каждому элементу заданного массива");
        int summ = 0;
        int number = scanner.nextInt();
        for (int i = 0; i < array2Dim.length; i++) {
            for (int j = 0; j < array2Dim[i].length; j++) {
                int newValue = array2Dim[i][j] + number;
                summ += newValue;
            }
        }
        System.out.println("Новая сумма элементов массива:" + summ);
        System.out.println();
        String[][] chess = new String[8][8];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (i % 2 == 0 & j % 2 == 0) {
                    chess[i][j] = "W";
                } else if (i % 2 != 0 & j % 2 != 0) {
                    chess[i][j] = "W";
                } else {
                    chess[i][j] = "B";
                }
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
