package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTask {

    public static void main(String[] args) {
        // проверка метода по угадыванию рандомного числа
        findNumber(101);
    }

    public static void findNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);

        int number;

        do {
            System.out.print("Угадайте число: ");
            number = scanner.nextInt();
        } while (number != random);

        System.out.println("Верно!");
    }
}
