package circle;

public class Circle {
    private double radius;
    private String color;

    Circle(){
        radius = 1.0;
        color = "red";
    }
    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI * radius *radius;
    }
}
