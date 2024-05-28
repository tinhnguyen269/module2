public class Square extends Rectangle implements Resizeable {
    private double size;

    public Square(){
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public double getArea(){
        return this.size*this.size;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.size += percent*this.size/100;

    }
}


