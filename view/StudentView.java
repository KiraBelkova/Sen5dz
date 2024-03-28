import date.Student;
import java.util.List;

class StudentView {
    public void displayStudents(List<User> users) {
        for (User user : users) {
            if (user instanceof Student) {
                System.out.println("Student: " + user.fullName + ", ID: " + ((Student) user).id + ", Average Mark: " + ((Student) user).averageMark);
            }
        }
    }
}
