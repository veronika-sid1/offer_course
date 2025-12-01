package homework_practice_2;

public class Rectangle {

    int width;
    int height;

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(15, 10);
        rectangle.setWidth(34);
        System.out.println(rectangle.calculateArea());
    }

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int getWidth() {
        return width;
    }

    int getHeight() {
        return height;
    }

    void setWidth(int width) {
        this.width = width;
    }


    int calculateArea() {
        return this.width * this.height;
    }
}
