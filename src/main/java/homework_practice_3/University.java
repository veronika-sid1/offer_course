package homework_practice_3;

public class University {

    static String universityName;
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        University.universityName = "МИФИ";
        University stud1 = new University(1, "Пётр");
        University stud2 = new University(2, "Александр");
        University stud3 = new University(3, "Галина");
        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();
        universityName = "СПБГУ";
        stud1.printStudentInfo();
        stud2.printStudentInfo();
        stud3.printStudentInfo();

    }

    static String changeUniversityName(String newName) {
        return universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("Имя студента: " + this.studentName + ", ID студента: " + this.studentID + ", Университет: " + University.universityName);
    }
}
