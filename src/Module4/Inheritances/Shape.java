package Module4.Inheritances;

public abstract class Shape {
    public int color;
    public Shape(int color){
        this.color=color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color){
        this.color=color;
    }

    public abstract double getArea();
}
