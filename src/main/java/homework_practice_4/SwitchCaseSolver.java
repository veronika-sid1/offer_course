package homework_practice_4;

import Common.Messages;

import java.util.Scanner;

public class SwitchCaseSolver {

    public static void main(String[] args) {
        // проверка метода по выводу названия дня недели в зависимости от числа
        //System.out.println(dayOfWeekByNumber());

        // проверка метода по выводу стоимости билетов
        //System.out.println(costOfTicket());

        // проверка метода по переводу числовых оценок в буквенные
        //System.out.println(numericalToLetterGrades());

        // проверка метода по обработке текстовых команд
        //System.out.println(processingTextCommands());

        // проверка метода с арифметическими операциями
        Calculator();
    }

    public static String dayOfWeekByNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        return switch (number) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Введите число от 1 до 7";
        };
    }

    public static String costOfTicket() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        return switch (number) {
            case 1, 2, 3, 4, 5 -> "300 рублей";
            case 6, 7 -> "450 рублей";
            default -> "Введено число вне диапазона 1-7.";
        };
    }

    public static String numericalToLetterGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number >= 90 && number <= 100) {
            return "A";
        } else if (number >= 80 && number <= 89) {
            return "B";
        } else if (number >= 70 && number <= 79) {
            return "C";
        } else if (number >= 60 && number <= 69) {
            return "D";
        } else if (number < 60 && number >= 0) {
            return "F";
        } return "Введите значение от 0 до 100";
    }

    public static String processingTextCommands() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите команду: ");
        String line = scanner.nextLine().toLowerCase();

        return switch (line) {
            case "start" -> "Система запущена";
            case "stop" -> "Система остановлена";
            case "restart" -> "Система перезапущена";
            case "status" -> "Система работает корректно";
            default -> "Введите корректную команду";
        };
    }

    public static void Calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введите операцию: ");
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println("Результат сложения: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Результат вычитания: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Результат умножения: " + (number1 * number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println(Messages.ERROR_DIVIDE_BY_ZERO);
                    break;
                } System.out.println("Результат деления: " + (number1 / number2));
                break;
            default:
                System.out.println("Введено некорректное значение оператора!");
                break;
        }
    }
}
