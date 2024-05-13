import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
         double a = sc.nextDouble();
         System.out.print("Enter b: ");
         double b = sc.nextDouble();
         System.out.print("Enter c: ");
         double c = sc.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double delta = equation.getDiscriminant();
        if (delta > 0) {
            double root1 = equation.getRoot1();
            double root2 = equation.getRoot2();
            System.out.println("Phuong trinh co 2 nghiem:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if(delta == 0) {
            double root3 = equation.getRoot1();
            System.out.println("Phuong trinh co nghiem kep :");
            System.out.println("Root 3: " + root3);
        } else {
            System.out.println("Phuong trinh vo nghiem :");
        }
    }
}
