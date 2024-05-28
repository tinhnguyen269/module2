package session8_cleancode.mvc.controllers;

import session8_cleancode.mvc.models.Student;
import session8_cleancode.mvc.services.IStudentService;
import session8_cleancode.mvc.services.impl.StudentService;
import session8_cleancode.mvc.views.StudentView;

public class MainController {

    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        IStudentService studentService = new StudentService();
        int choice;
        Student student;
        boolean result;
        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    student = studentView.viewAdd();
                    result = studentService.add(student);
                    studentView.viewMessage(result);
                    break;
                }
                case 2: {
                    break;
                }
                case 3:
                    int code = studentView.inputCode();
                    student = studentService.findByCode(code);
                    if(student == null) {
                        studentView.viewMessage(false);
                    } else {
                        boolean isConfirm = studentView.confirmDelete(student);
                        if(isConfirm) {
                            studentService.removeStudent(student);
                            studentView.viewMessage(true);
                        }
                    }
                    break;
                case 4:
                    Student[] students = studentService.getAll();
                    studentView.displayAllStudent(students);
                    break;
                case 0:
                    return;
            }
            System.out.println();
        }
    }
}
