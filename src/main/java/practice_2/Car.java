package practice_2;

public class Car {
    String brand;
    int year;

    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    String getBrand() {
        return brand;
    }

    int getYear() {
        return year;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setYear(int year) {
        this.year = year;
    }

    void print() {
        System.out.println("Марка автомобиля " + this.brand + " Год выпуска автомобиля " + this.year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 2000);
        car1.print();
        car1.setYear(2015);
        car1.print();
    }
}
