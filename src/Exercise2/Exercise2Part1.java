package Exercise2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2Part1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void part1() {
        System.out.println("Enter a number:");
        int number = Integer.parseInt(scanner.nextLine());
        int randomNumber = (int) (Math.random() * 101);
        int max = randomNumber > number ? randomNumber : number;
        System.out.println("Your number is " + number);
        System.out.println("The random number is " + randomNumber);
        System.out.println("The larger number is " + max);
    }
    public static void doing() {
        final double PI = 3.14;
        final double G = 9.1;
        final double SPEED_OF_LIGHT_IN_VACUUM = 299792458;
        final double PLANCK_CONSTANT = 6.62607015;

        for (Season season: Season.values()) {
            System.out.println(season);
        }
        Size size = Size.LARGE;
        System.out.println(size.getValue());
        if (size.equals(Size.LARGE)) {
            System.out.println("size is " + size);
        }

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("Current day: " + date.getDayOfMonth());
        System.out.println("Current month: " + date.getMonthValue());
        LocalDate date2 = LocalDate.of(2020, Month.FEBRUARY, 17);
        System.out.println(date2);
        LocalDate dateInHCM = LocalDate.now(ZoneId.of("Asia/Ho_Chi_Minh"));
        System.out.println(dateInHCM);
        if(dateInHCM.isAfter(date2)) {
            System.out.println("Gotcha!");
        }
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss - dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.RFC_1123_DATE_TIME;
        System.out.println(dateTime.format(dateTimeFormatter));
        ZonedDateTime dateTime1 = ZonedDateTime.now();
        System.out.println(dateTime1.format(dateTimeFormatter1));
    }

}
