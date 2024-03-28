import java.util.ArrayList;
import java.util.List;

class DateService {
    private List<User> users = new ArrayList<>();

    public void createStudent(String fullName, int birthYear, double averageMark) {
        int maxId = 0;
        for (User user : users) {
            if (user instanceof Student && ((Student) user).id > maxId) {
                maxId = ((Student) user).id;
            }
        }
        users.add(new Student(fullName, birthYear, maxId + 1, averageMark));
    }

    public void createTeacher(String fullName, int birthYear, String disciplines) {
        int maxId = 0;
        for (User user : users) {
            if (user instanceof Teacher && ((Teacher) user).id > maxId) {
                maxId = ((Teacher) user).id;
            }
        }
        users.add(new Teacher(fullName, birthYear, maxId + 1, disciplines));
    }

    public void readUsers() {
        for (User user : users) {
            if (user instanceof Student) {
                System.out.println("Student: " + user.fullName + ", ID: " + ((Student) user).id + ", Average Mark: " + ((Student) user).averageMark);
            } else if (user instanceof Teacher) {
                System.out.println("Teacher: " + user.fullName + ", ID: " + ((Teacher) user).id + ", Disciplines: " + ((Teacher) user).disciplines);
            }
        }
    }
}
