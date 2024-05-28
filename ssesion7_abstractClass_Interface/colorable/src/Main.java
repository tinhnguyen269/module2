public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        Shape rectangle = new Rectangle();
        Square square = new Square();
        if(square instanceof Colorable){
            ((Colorable) square).howToColor();


        }
        Shape[] shapes = new Shape[3];
        shapes[0] =new Circle(1,"red",true);
        shapes[1]=new Rectangle(5,10,"blue",true);
        shapes[2]=new Square(20,"green",true);

        System.out.println(shapes[0]);
    }
}
