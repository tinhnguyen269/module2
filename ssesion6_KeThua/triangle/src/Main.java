import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the c : ");
        double c = sc.nextDouble();
        System.out.print("Enter the color : ");
        String color = sc.next();

        Triangle triangle = new Triangle(color, a, b, c);
        System.out.println(triangle);


    }
}
