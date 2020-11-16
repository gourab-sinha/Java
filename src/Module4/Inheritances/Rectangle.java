package Module4.Inheritances;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width, int color){
        super(color);
        this.height=height;
        this.width=width;
    }

    @Override
    public double getArea() {
        return this.height*this.width;
    }
}
