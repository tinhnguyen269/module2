import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double squareN = Math.sqrt(n);
        if(n>1){
            for(int i=2 ; i<=squareN ; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    break;
                } else {
                    System.out.println(n + " is a prime number");
                }
            }
        } else {
            System.out.println(n+" is not a prime number");
        }
    }
}
