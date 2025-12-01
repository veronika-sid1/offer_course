package homework_practice_2;

public class Teacher {

    String name;
    String subject;

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Василий Михайлович", "Биология");
        teacher1.setSubject("Химия");
        teacher1.printInfo();
    }

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    void printInfo() {
        System.out.println("Имя учителя: " + this.name + ", предмет: " + this.subject);
    }
}
