package Module4.Inheritances;

public class Square extends Shape{
    private int length;

    public Square(int length, int color){
        super(color);
        this.length=length;
    }

    @Override
    public double getArea() {
        return this.length*this.length;
    }
}
