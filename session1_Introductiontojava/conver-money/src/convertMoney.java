import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        double rate = 23000;
        double usd,vnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the usd:");
        usd = sc.nextDouble();

        vnd= usd * rate;
        System.out.println("The USD converted is "+vnd +"VND");



    }
}
