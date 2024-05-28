package session8_cleancode.mvc.repositories;

import session8_cleancode.mvc.models.Student;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentRepository {
    private static Student[] students = new Student[100];
    private static int count = 0;

    static {
        students[0] = new Student(1, "HaiTT", "Quảng Nam", "C1123G1");
        count = 1;
    }

    public void add(Student student) {
        students[count] = student;
        count++;
    }

    public Student[] getAll() {
        Student[] result = Arrays.copyOf(students, count);
        return result;
    }

    public Student findByCode(int code) {
        for (Student student : students) {
            if(student == null) {
                return null;
            }
            if (student.getCode() == code) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student student) {
        for(int i = 0; i < count; i++) {
            if(students[i].getCode() == (student.getCode())) {
               for(int j = i ; j < count - 1; j++) {
                   students[j] = students[j+1];
               }
               students[count - 1] = null;
               count--;

            }
        }
    }
}
