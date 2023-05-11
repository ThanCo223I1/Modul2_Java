package ThucHanhKeThua;

public class Circle extends Shape {
    private double radius = 3.0;
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //chu vi hinh tron
    public double getArea(){
        return radius * radius * Math.PI;
    }
    //dien tich hinh tron
    public double getPerimeter(){
        return 2*radius * Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius +  "\t"
                ;
    }
}


