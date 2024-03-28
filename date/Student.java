class Student extends User {
    int id;
    double averageMark;

    public Student(String fullName, int birthYear, int id, double averageMark) {
        super(fullName, birthYear);
        this.id = id;
        this.averageMark = averageMark;
    }
}
