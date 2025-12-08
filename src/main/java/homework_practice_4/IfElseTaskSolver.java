package homework_practice_4;

import java.util.Scanner;

public class IfElseTaskSolver {

    public static void main(String[] args) {
        // проверка метода по расшифровке знака числа
        //System.out.println(defineSignOfNumber());

        // проверка метода по определению максимального числа
        //findMax();

        // проверка метода по описанию оценки
        //System.out.println(gradeStringOutput());

        // проверка метода проверки числа на чётность
        //System.out.println(checkParity());

        //проверка метода по определению скидки
        //System.out.println(defineDiscount());

        //проверка вывода расшифровки оценки
        System.out.println(defineTestResult());
    }

    public static String defineSignOfNumber() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            return "Число положительное";
        } else if (number < 0) {
            return "Число отрицательное";
        }
        return "Число равно нулю";
    }

    public static void findMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Первое число равно второму");
        } else {
            System.out.println(Math.max(number1, number2));
        }
    }

    public static String gradeStringOutput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку (от 1 до 5): ");
        int number = scanner.nextInt();

        return switch (number) {
            case 1,2 -> "Неудовлетворительно";
            case 3 -> "Удовлетворительно";
            case 4 -> "Хорошо";
            case 5 -> "Отлично";
            default -> "Некорректное значение";
        };
    }

    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            return "Число чётное";
        }
        return "Число нечётное";
    }

    public static String defineDiscount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int number = scanner.nextInt();

        if (number < 18) {
            return "25%";
        } else if (number >= 65) {
            return "30%";
        }
        return "Без скидки";
    }

    public static String defineTestResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку (0-100): ");
        int number = scanner.nextInt();

        if (number < 0 || number > 100) {
            return "Некорректное число. Введите значение из диапазона 0-100";
        }

        if (number >= 90) {
            return "Отлично";
        } else if (number >= 75) {
            return "Хорошо";
        } else if (number >= 60) {
            return "Удовлетворительно";
        }
        return "Неудовлетворительно";
    }
}

