import javax.sound.midi.Soundbank;

public class MathOperations {

    public static void main(String[] args) {
        int ad = add(1, 2);
        int sub = subtract(2, 3);
        int multi = multiply(1, 3);
        double div = divide(1, 0);
        double div1 = divide(1, 6);
        int max = findMax(1, 1000);
        int dif = difference(1, 1000);
        int area = squareArea(5);
        int perim = squarePerimeter(5);
        double min = convertSecondsToMinutes(5);
        double speed = averageSpeed(45, 23);
        double speed2 = averageSpeed(4.5, 2.5);
        double hp = findHypotenuse(4.5, 1.2);
        double hp1 = findHypotenuse(0, 1.2);
        double cr = circleCircumference(5.3);
        double cr1 = circleCircumference(75);
        double perc = calculatePercentage(25, 200);
        double perc1 = calculatePercentage(200, 0);
        double fahr = fahrenheitToCelsius(50);
        double cel = celsiusToFahrenheit(50);

        System.out.println("Результат сложения = " + ad);
        System.out.println("Результат вычитания = " + sub);
        System.out.println("Результат умножения = " + multi);
        System.out.println("Результат деления = " + div);
        System.out.println("Результат деления = " + div1);
        System.out.println("Максимальное число = " + max);
        System.out.println("Модуль числа = " + dif);
        System.out.println("Площадь квадрата = " + area);
        System.out.println("Периметр квадрата = " + perim);
        System.out.println("Время в минутах = " + min);
        System.out.println("Первая скорость = " + speed);
        System.out.println("Вторая скорость = " + speed2);
        System.out.println("Гипотенуза = " + hp);
        System.out.println("Гипотенуза = " + hp1);
        System.out.println("Длина окружности = " + cr);
        System.out.println("Длина окружности = " + cr1);
        System.out.println("В процентах = " + perc);
        System.out.println("В процентах = " + perc1);
        System.out.println("В цельсиях = " + fahr);
        System.out.println("В Фаренгейтах = " + cel);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        if (y == 0) {
            System.out.println("Нельзя делить на ноль!!");
            return 0;
        }
        return x / (double) y;
    }

    public static int findMax(int x, int y) {
        return Math.max(x, y);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            System.out.println("Делитель не должен быть равен 0! Проверьте аргумент time");
            return 0;
        }
        return distance / time;
    }

    public static double findHypotenuse(double a, double b){
        if ((a > 0) && (b > 0)) {
            return Math.sqrt(a*a + b*b);
        }
        System.out.println("оба значения должны быть положительными!");
        return 0;
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (part == 0) {
            System.out.println("Недопустимое значение part = 0!");
            return 0;
        }
        return (total / part) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}
