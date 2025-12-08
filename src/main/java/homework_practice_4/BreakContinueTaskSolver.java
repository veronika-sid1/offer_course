package homework_practice_4;

import java.util.Scanner;

public class BreakContinueTaskSolver {

    public static void main(String[] args) {
        // проверка метода по расчёту суммы чисел до первого отрицательного
        //sumOfNumbers();

        // пропуск чисел, которые делятся на 3
        //skipDivisibleByThree(20);

        // вывод только позитивных значений
        //printOnlyPositive();

        // проверка метода вывода значений в консоль до 'stop'
        printUntilStop();
    }

    public static void sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Вы ввели отрицательное число!");
                break;
            }

            System.out.println("Текущая сумма = " + (sum += number)); //возможно избыточно
        }
        System.out.println("Сумма чисел = " + sum);
    }

    public static void skipDivisibleByThree(int number) {
        /*
        int i = 1;
        while (i <= number) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }*/

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    public static void printOnlyPositive() {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.print("Введите число (0 - завершение программы): ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }
            System.out.println(number + " ");
        } while (number != 0);
    }

    public static void printUntilStop() {
        Scanner scanner = new Scanner(System.in);

        String text;

        while (true) {
            System.out.print("Введите строку: ");
            text = scanner.nextLine().toLowerCase();
            if (text.equals("stop")) {
                System.out.println("Вы ввели команду 'stop'. Программа завершила работу.");
                break;
            }
            System.out.println("Вы ввели строку: " + text);
        }
    }
}
