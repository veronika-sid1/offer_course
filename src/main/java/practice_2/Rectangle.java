package practice_2;

public class Rectangle {
    int width;
    int height;

Rectangle(int weight, int height) {
    this.width = weight;
    this.height = height;
}

    public int getHeight() {
        return height;
    }

    public int getwidth() {
        return width;
    }

    public void setwidth(int weight) {
        this.width = weight;
    }

    public int calculateArea() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
    Rectangle rec = new Rectangle(1,2);
    rec.setwidth(35);
    System.out.println("площадь прямоугольника = " + rec.calculateArea());
    }
}
