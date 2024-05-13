public class Fan {

    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    public int speed;
    public boolean on;
    public String color;
    public double radius;

    public Fan() {
        speed = SLOW;
        on = false;
        color = "blue";
        radius = 5;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        if (on) {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + ", Fan is on";
        } else {
            return "Color: " + color + ", Radius: " + radius + ", Fan is off";
        }
    }



}
