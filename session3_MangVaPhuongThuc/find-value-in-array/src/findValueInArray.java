import java.util.Scanner;

public class findValueInArray {
    public static void main(String[] args) {
        String [] students = {"tinh","truong","long","hoang","ngoc","quyen","the anh"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String input_name = sc.nextLine();

        boolean isStudents = false;
        for( int i = 0;i < students.length;i++){
            if(students[i].equalsIgnoreCase(input_name)){
                isStudents = true;
                System.out.println("Position of the students in the list: " + input_name + " is " + i );
                break;
            }
        }
        if(!isStudents){
            System.out.println("Student is found in the list");
        }
    }
}
