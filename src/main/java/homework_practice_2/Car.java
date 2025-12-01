package homework_practice_2;

public class Car {

    String brand;
    int year;

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2020);
        car1.setYear(2000);
        car1.print();
    }

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void print() {
        System.out.println("Марка машины " + this.brand + " Год выпуска " + this.year);
    }
}
