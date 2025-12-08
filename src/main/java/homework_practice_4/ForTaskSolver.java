package homework_practice_4;

import java.util.Scanner;

public class ForTaskSolver {

    public static void main(String[] args) {
        // проверка метода вывода чисел, которые делятся на 3
        //numbersDivisibleBy3();

        // проверка метода суммы чисел от 1 до n
        //System.out.print(sumOfNumbers());

        // проверка вывода таблицы умножения
        //multiplicationTable();

        // проверка метода на простоту числа
        /*
        if (isPrime() == false) {
            System.out.println("Число не простое");
        } else {
            System.out.println("Число простое");
        }*/

        // вывод чисел от 1 до 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void numbersDivisibleBy3() {
        for (int i = 1; i <= 100; i++ ) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (number < 1) {
            System.out.println("Введите число больше или равно 1");
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static boolean isPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            return false;
        }

        boolean isPrime = true;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
