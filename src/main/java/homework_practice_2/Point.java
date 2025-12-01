package homework_practice_2;

public class Point {

    int x;
    int y;

    public static void main(String[] args) {
        Point point1 = new Point(5, 5);
        point1.print();
        point1.setX(10);
        point1.print();
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    void print() {
        System.out.println("Координаты точки: " + this.x + " " + this.y);
    }
}
