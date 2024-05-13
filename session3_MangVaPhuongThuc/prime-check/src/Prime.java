import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int number ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        number = sc.nextInt();
        double sqrt = Math.sqrt(number);

        if(number<2){
            System.out.println("number not prime");
        } else {
            int i=2;
            boolean check = true;
            while(i<=sqrt){
                if(number% i== 0){
                    check = false;
                } else {
                    check = true;
                }
                i++;
            }
            if(check){
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        }
    }
}
