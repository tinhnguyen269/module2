import java.util.Scanner;

public class LeapYearCaculator {
    public static void main(String[] args) {
        System.out.println("Enter year :");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if( year % 4 == 0 && year % 400 ==0){
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is a not leap year");
        }
    }
}
