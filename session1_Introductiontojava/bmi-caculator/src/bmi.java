import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight :");
        double weight = scanner.nextDouble();
        System.out.println("Enter the height :");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);
        if(bmi < 18.5) {
            System.out.println("Underweight");
        }else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("Normal");
        }
        else if(bmi >= 25 && bmi <= 29.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        }
    }

