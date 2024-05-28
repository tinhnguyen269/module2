package models;

public class Student extends Person {
    private String classroom;
    public Student() {}

    public Student(String name, int code, String address, String classroom) {
        super(name, code,address);
        this.classroom = classroom;

    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
