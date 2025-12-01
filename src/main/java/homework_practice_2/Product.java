package homework_practice_2;

public class Product {

    String name;
    int price;

    public static void main(String[] args) {
        Product product = new Product("Кабачок", 1000);
        product.setPrice(800);
        product.applyDiscount(25);
        product.printInfo();
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void applyDiscount(int discount) {
        price = price - (price * discount) / 100;
    }

    void printInfo() {
        System.out.println("Итоговая цена = " + this.price);
    }
}
