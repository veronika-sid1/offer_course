package homework_practice_1;

public class MathOperations_prep {

    public static void main(String[] args) {
        int add1 = add(1,2);
        int sub = subtract(1,2);
        int mult = multiply(1,2);
        double div = divide(1,2);
        int max = findMax(1, 2);
        int dif = difference(1, 3);
        int sq = squareArea(2);
        int sp = squarePerimeter(2);
        double min = convertSecondsToMinutes(2);
        double sp1 = averageSpeed(1, 1);
        double sp2 = averageSpeed(1, 0);
        System.out.println("Результат сложения = " + add1);
        System.out.println("Результат вычитания = " + sub);
        System.out.println("Результат умножения = " + mult);
        System.out.println("Результат деления = " + div);
        System.out.println("Наибольшее число = " + max);
        System.out.println("Разница = " + dif);
        System.out.println("Площадь квадрата = " + sq);
        System.out.println("Периметр квадрата = " + sp);
        System.out.println("Перевод в минуты = " + min);
        System.out.println("Средняя скорость = " + sp1);
        System.out.println("Средняя скорость = " + sp2);
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
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        if (time == 0) {
            System.out.println("Время не может быть равно 0");
            return 0;
        } 
        return distance / time;
    }

    public static double hypotenuse(double a, double b) {
        if (a <= 0 || b <= 0) {
            System.out.println("Стороны должны быть положительными.");
            return 0;
        }
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            System.out.println("присутствует деление на ноль, проверьте значение total");
            return 0;
        }
        else return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}
