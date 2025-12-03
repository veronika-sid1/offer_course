package homework_practice_3;

public class Company {

    static String companyName = "ООО Зеленоглазое Такси";
    final int employeeID;
    String employeeName;

    public static void main(String[] args) {
        Company emp1 = new Company(1, "Василий");
        Company emp2 = new Company(2, "Савелий");
        emp1.printCompanyName();
        emp2.printCompanyName();
        Company.companyName = "Рога и копыта";
        emp1.printCompanyName();
        emp2.printCompanyName();
        //emp1.employeeID = 12; попытка изменить неизменяемую final переменную (ошибка)
    }

    Company(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println("Название компании: " + Company.companyName);
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
