package practice_3;

public class Student {
    static int maxYears;
    static int studentCount;

    static {
        maxYears = 1;
        studentCount = 0;
    }

    int age;
    String name;

    Student(int someAge, String someName) {
        this.age = someAge;
        this.name = someName;
        studentCount++; //инкремент
    }

    static void printMaxYears() {
        System.out.println(maxYears);
    }
}
