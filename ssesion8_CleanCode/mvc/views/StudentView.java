package session8_cleancode.mvc.views;

import session8_cleancode.mvc.models.Student;

import java.util.Scanner;

public class StudentView {

    public int view() {
        System.out.println("--------Student View--------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Display all student");
        System.out.println("0. End program");
        System.out.print("Input your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;

    }

    public Student viewAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input code: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input address: ");
        String address = scanner.nextLine();
        System.out.println("Input classroom: ");
        String classroom = scanner.nextLine();
        Student student = new Student(code, name, address, classroom);
        return student;
    }

    public void viewMessage(boolean result) {
        if(result) {
            System.out.println("Tác vụ thành công");
        } else {
            System.out.println("Tác vụ thất bại");
        }
    }

    public void displayAllStudent(Student[] students) {
        System.out.println("Danh sách học sinh: ");
        for (Student student: students) {
            System.out.println(infoStudent(student));
        }
    }

    private String infoStudent(Student student) {
        return "Code: " + student.getCode() +", name: "+ student.getName();
    }

    public int inputCode() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập mã học sinh: ");
        return Integer.parseInt(scanner.nextLine());

    }

    public boolean confirmDelete(Student student) {
        System.out.println("Bạn có muốn xóa học sinh có mã "+ student.getCode() +". Bấm Y để xác nhận, N để huỷ");
        Scanner scanner = new Scanner(System.in);
        String confirm = scanner.nextLine();
        if(confirm.equals("Y")) {
            return true;
        } else {
            return false;
        }
    }
}
