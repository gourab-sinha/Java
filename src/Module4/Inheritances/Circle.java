package Module4.Inheritances;

public class Circle extends Shape{
    private int radius;

    public Circle(int radius, int color){
        super(color);
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*this.radius;
    }
}
