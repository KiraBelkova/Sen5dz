class Teacher extends User {
    int id;
    String disciplines;

    public Teacher(String fullName, int birthYear, int id, String disciplines) {
        super(fullName, birthYear);
        this.id = id;
        this.disciplines = disciplines;
    }
}
