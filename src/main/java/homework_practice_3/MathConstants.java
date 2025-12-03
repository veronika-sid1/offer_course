package homework_practice_3;

public class MathConstants {

    static final double PI = 3.14159;
    static final double E = 2.71828;

    public static void main(String[] args) {
        System.out.println("Площадь круга = " + calculateCircleArea(15));
        System.out.println("Длина окружности = " + calculateCircumference(20));
        System.out.println("Площадь круга = " + calculateCircleArea(100));
        System.out.println("Длина окружности = " + calculateCircumference(23));
        System.out.println("Площадь круга = " + calculateCircleArea(123));
        System.out.println("Длина окружности = " + calculateCircumference(21));
    }

    static double calculateCircleArea(double r) {
        return PI * Math.pow(r, 2);
    }

    static double calculateCircumference(double r) {
        return 2 * PI * r;
    }
}
