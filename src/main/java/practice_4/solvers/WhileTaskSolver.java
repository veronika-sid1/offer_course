package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {

    public static void main(String[] args) {
        // проверка метода по распечатке всех чисел от 1 до 10
        //printAllNumberBefore10();

        // проверка программы по считываниб команд, пока не введут exit
        //commandReader();

        //проверка метода по подсчёту сумм цифр в числе
        //System.out.println(sumOfDigits(123));

        //проверка метода по введению пароля и логина
        checkCredentials();
    }

    public static void printAllNumberBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("exit")) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
        }

        System.out.println("Программа завершена.");
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }

    public static void findMin() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = 2147483647;
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;
        } while (number >= 0);

        System.out.println("" + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.println("Введите логин: ");
            login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Доступ разрешён.");
    }
}
