public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        System.out.println(point);

        MoveavlePoint moveavlePoint = new MoveavlePoint(1, 2);
        System.out.println(moveavlePoint);


        MoveavlePoint point4 = new MoveavlePoint(1, 4,2,2);
        System.out.println(point4.move());

    }
}
