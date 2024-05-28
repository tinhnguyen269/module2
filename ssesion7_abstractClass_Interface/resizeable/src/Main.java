import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println("Dien tich hinh tron ban dau la:" + circle.getArea());
        circle.resize(100);
        System.out.println("Dien tich sau khi tang:" + circle.getArea());

        Square square = new Square(5.0);
        System.out.println("Dien tich hinh vuong ban dau la:" + square.getArea());
        square.resize(100);
        System.out.println("Dien tich sau khi tang la:" + square.getArea());

        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Dien tic hinh chu nhat ban dau:" + rectangle.getArea());
        rectangle.resize(100);
        System.out.println("Dien tich sau khi tang la:" + rectangle.getArea());

    }
}
