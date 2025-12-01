package homework_practice_2;

public class BankAccount {

    String owner;
    int balance;

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Veronika", 1000);
        acc.deposit(1000);
        acc.withdraw(500);
        acc.printBalance();
    }

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return owner;
    }

    int getBalance() {
        return balance;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    void deposit(int amount){
        balance = balance + amount;
    }

    void withdraw(int amount){
        balance = balance - amount;
    }

    void printBalance() {
        System.out.println("Текущий баланс = " + this.balance);
    }
}
