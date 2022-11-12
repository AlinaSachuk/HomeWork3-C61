package HW14;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class HomeWork14Lambda {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        Predicate<String> someWord = x -> x.startsWith("J") & x.startsWith("N") | x.endsWith("a");
        System.out.println(someWord.test("Nana"));
        System.out.println(someWord.test("Cow"));
        System.out.println("Task 2:");
        Box box = new Box();
        Consumer<Integer> boxInfo = x -> System.out.println("Отгрузили ящик с весом " + box.getBoxWeight() + " кг.");
        box.setBoxWeight(24);
        boxInfo.accept(box.getBoxWeight());
        box.setBoxWeight(76);
        boxInfo.accept(box.getBoxWeight());
        System.out.println("Task 3:");
        Consumer<Integer> number = x -> {
            if (x > 0) {
                System.out.println("Positive number");
            } else if (x < 0) {
                System.out.println("Negative number");
            } else {
                System.out.println("Zero");
            }
        };
        number.accept(0);
        number.accept(-5);
        number.accept(45);
        System.out.println("Task 4:");
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            int randomNumber = random.nextInt(0, 10);
            return randomNumber;
        };
        System.out.println(supplier.get());
    }
}
