public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        System.out.println(shape);
//
//        shape = new Shape("red",false);
//        System.out.println(shape);
//
//        Circle circle = new Circle();
//        System.out.println(circle);
//
//        Rectangle rectangle = new Rectangle();
//        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);



    }
}
