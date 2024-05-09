import java.util.Scanner;
// ax+b=c
public class phuongtrinhbac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap b:");
       double b = scanner.nextDouble();
        System.out.println("Nhap c:");
       double c = scanner.nextDouble();
       if(a!=0) {
           double x = (c-b)/a;
           System.out.println("phuong tirnh co 1 nghiem : x= " +x);
       } else {
           if(b==0 && c==0){
               System.out.println("Phuong trinh co vo so nghiem!");
           } else {
               System.out.println("Phuong trinh vo nghiem!");
           }
       }

    }
}
