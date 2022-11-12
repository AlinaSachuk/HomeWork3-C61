package HW14;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class HomeWork14Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        TemporalAdjuster nextTue = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println(localDate.with(nextTue));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date in format: year -> month -> day.");
        LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(date.getDayOfWeek());

    }
}
