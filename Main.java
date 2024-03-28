public class Main {
    public static void main(String[] args) {
    DateService dateService = new DateService();

    dateService.createStudent("John Doe", 2000, 4.5);
    dateService.createTeacher("Jane Smith", 1985, "Math, Physics");
    
    dateService.readUsers();
    
    StudentView studentView = new StudentView();
    studentView.displayStudents(dateService.getUsers());
    
    TeacherView teacherView = new TeacherView();
    teacherView.displayTeachers(dateService.getUsers());
}
}
