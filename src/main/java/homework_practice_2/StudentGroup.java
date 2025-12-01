package homework_practice_2;

public class StudentGroup {

    String groupName;
    int studentCount;

    public static void main(String[] args) {
        StudentGroup group = new StudentGroup("Первая группа", 20);
        group.setStudentCount(30);
        group.printInfo();
    }

    StudentGroup(String groupName, int studentCount) {
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName() {
        return groupName;
    }

    int getStudentCount() {
        return studentCount;
    }

    void setGroupName(String groupName){
        this.groupName = groupName;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    void printInfo() {
        System.out.println("В группе " + this.groupName + " число студентов = " + this.studentCount);
    }
}
