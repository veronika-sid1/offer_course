package homework_practice_3;

public class Person {

    private String firstName;
    private String lastName;
    private final String ssn;

    public static void main(String[] args) {
        Person vasya = new Person("Василий", "Иванов", "123-45-6789");
        Person kolya = new Person("Николай", "Сироткин", "123-45-6781");
        vasya.printPersonInfo();
        kolya.printPersonInfo();
        kolya.setFirstName("Дмитрий");
        kolya.printPersonInfo();
    }

    Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void printPersonInfo() {
        System.out.println(String.format(
                "Имя: %s, Фамилия: %s, SSN: %s",
                firstName, lastName, ssn
        ));
    }
}
