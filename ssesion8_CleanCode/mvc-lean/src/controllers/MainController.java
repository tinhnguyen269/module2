package controllers;

import views.StudentView;

public class MainController {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        int choice = studentView.view();
        switch(choice){
            case 1:
                studentView.view();
            case 2:
            case 3:
            case 4:
            case 5:
                return;



        }

    }
}
