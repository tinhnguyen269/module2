package views;

import java.util.Scanner;

public class StudentView {
    public int view(){
        System.out.println("------------Student View------------");
        System.out.println("1.Add student");
        System.out.println("2.Edit student");
        System.out.println("3.Delete student");
        System.out.println("4.Display student");
        System.out.println("5.End program");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the choice:");
        int choice = sc.nextInt();
        return choice;
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student name:");
        String name = sc.nextLine();
        System.out.print("Input student code:");
        String code = sc.nextLine();
        System.out.print("Input student address:");
        String address = sc.nextLine();
        System.out.print("Input student classrooom:");
        String classroom = sc.nextLine();
    }
}