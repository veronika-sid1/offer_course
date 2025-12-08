package homework_practice_4;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class DoWhileTaskSolver {

    public static void main(String[] args) {
        // проверка метода на знак числа
        //isPositive();

        // проверка метода валидации пароля
        //checkPassword();

        // вывод чисел от 1 до 10
        /*
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);*/

        // проверка метода на выход по команде exit
        //waitForExit();

        // проверка метода подсчёта цифр
        System.out.println(countNumbers());
    }

    public static void isPositive() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        }
        while (number <= 0);
        System.out.print("Вы ввели позитивное число!");
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String password;
        do {
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
            if (!password.equals("admin")) {
                System.out.println("Вы ввели некорректный пароль!");
            }
        }
        while (!password.equals("admin"));
        System.out.println("Вы ввели корректный пароль!");
    }

    public static void waitForExit() {
        Scanner scanner = new Scanner(System.in);

        String text;
        do {
            System.out.println("Введите команду: ");
            text = scanner.nextLine().toLowerCase();
        }
        while (!text.equals("exit"));
    }

    public static int countNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        number = Math.abs(number);

        if (number == 0) {
            return 1;
        }

        int i = 0;
        do {
            number /= 10;
            i++;
        } while (number != 0);
        return i;
    }
}
