package session8_cleancode.mvc.services;

import session8_cleancode.mvc.models.Student;

public interface IStudentService{
    boolean add(Student student);

    Student[] getAll();

    Student findByCode(int code);

    void removeStudent(Student student);
}
