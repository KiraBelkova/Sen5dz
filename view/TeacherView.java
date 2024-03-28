import date.Teacher;
import java.util.List;

class TeacherView {
    public void displayTeachers(List<User> users) {
        for (User user : users) {
            if (user instanceof Teacher) {
                System.out.println("Teacher: " + user.fullName + ", ID: " + ((Teacher) user).id + ", Disciplines: " + ((Teacher) user).disciplines);
            }
        }
    }
}
