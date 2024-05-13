import java.util.Scanner;

public class interestBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = 1.0;
        double rate = 1.0;
        int month = 1;

        System.out.println("So tien can vay:");
        number = sc.nextDouble();

        System.out.println("Ti le lai xuat:");
        rate = sc.nextDouble();

        System.out.println("So thang vay la:");
        month = sc.nextInt();

        double totalInterest= 1.0;
        for(int i = 0; i < month; i++){
            totalInterest = number * (rate/100)/12 * month;
        }
        System.out.println("Total interest: " + totalInterest);
    }
}




