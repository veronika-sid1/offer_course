package homework_practice_2;

public class Circle {

    double radius;

    public static void main(String[] args) {
        Circle circle = new Circle(25);
        circle.setRadius(60);
        //circle.calculateArea();
        //circle.calculateCircumference();
        System.out.println("Площадь окружности = " + circle.calculateArea());
        System.out.println("Длина окружности = " + circle.calculateCircumference());
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
