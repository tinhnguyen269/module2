import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter Fahrenheit: ");
                fahrenheit = input.nextDouble();
                System.out.print(celsiusTo);
        }
        }

    }
}
