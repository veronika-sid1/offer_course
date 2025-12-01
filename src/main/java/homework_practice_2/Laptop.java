package homework_practice_2;

public class Laptop {

    String brand;
    int price;

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", 10000);
        laptop.setPrice(20000);
        laptop.printInfo();
    }

    void printInfo() {
        System.out.println("Цена ноутбука после того, как бахнул кризис: " + this.price + " руб.");
    }

    Laptop(String brand, int price){
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
