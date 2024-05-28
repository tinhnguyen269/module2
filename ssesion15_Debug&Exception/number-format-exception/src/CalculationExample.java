import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập y: ");
        int y = Integer.parseInt(scanner.nextLine());
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("tong x cong y la:" + a);
            System.out.println("tong x tru y la:" + b);
            System.out.println("tong x nhan y la:" + c);
            System.out.println("tong x chia y la:" + d);
        }
        catch(Exception e){
            System.err.println("xay ra loi" + e.getMessage());
        }
    }
}
