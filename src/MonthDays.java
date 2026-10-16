import java.util.InputMismatchException;
import java.util.Scanner;

/** Исключения: задания 1–2 (месяцы + високосный год) */
public class MonthDays {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Введите номер месяца (1-12): ");
            int month = input.nextInt();

            String name = months[month - 1];
            int days = dom[month - 1];

            if (month == 2) {
                System.out.print("Введите год: ");
                int year = input.nextInt();
                if (isLeapYear(year)) {
                    days = 29;
                }
            }

            System.out.println(name + ": " + days + " дней");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Недопустимое число");
        } catch (InputMismatchException ex) {
            System.out.println("Недопустимое число");
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
