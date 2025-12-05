package homework_practice_2;

public class StudentTest {

    int age;
    String name;

    public static void main(String[] args) {
        StudentTest student = new StudentTest(12, "Some text");
        System.out.println(student.age);
        System.out.println(student.name);
        student.setName("Ivan");
        System.out.println(student.name);
        String name1 = student.getName();
        System.out.println(name1);
    }

    public StudentTest(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
