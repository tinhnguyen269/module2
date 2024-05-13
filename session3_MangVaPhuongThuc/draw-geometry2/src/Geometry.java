import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    for(int i=1;i<=3;i++){
                        for(int j=1;j<=5;j++){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
//                  button-left
                    for(int i=1;i<=5;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println();
//                  top-left
                    for(int i=1; i<=5; i++){
                        for(int j=5; j>=i; j--){
                            System.out.print(" *");
                        }
                        System.out.println();
                    }
                    System.out.println();
//                  top-right
                    for(int i=1; i<=5; i++){
                        for(int j=1; j<=i; j++){
                            System.out.print(" *");
                        }
                        for(int k=0; k<(5-i);k++){
                            System.out.print(" ");
                        }

                        System.out.println();
                    }









                    break;


            }








        }
    }
}
