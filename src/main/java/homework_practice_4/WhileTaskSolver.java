package homework_practice_4;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        // проверка метода по выводу факториала
        // System.out.println(factorial());

        // проверка метода, который выводит чётные числа
        // evenNumbers();

        // проверка обратного отсчёта для введённого числа
        countdown();
    }

    public static int factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int i = 1;
        int result = 1;
        while (i <= number) {
            result = i * result;
            i++;
        }
        return result;
    }

    public static void evenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public static void countdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Введите положительное число!");
            return;
        }

        while (number > 0) {
            System.out.print(number + " ");
            number -= 1;
        }
    }
}
