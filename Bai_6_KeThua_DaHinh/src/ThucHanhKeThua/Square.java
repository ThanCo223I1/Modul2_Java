package ThucHanhKeThua;

public class Square extends Rectangle{
    private double side = 6.8;
    void Shape(double side){
        side = 3.5;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth(double side){
        return this.getWidth(side);
    }


    @Override
    public void setWidth(double side){
         this.side = 5.4;
    }

    @Override
    public String toString() {
        return super.toString() + "side = " + side;
    }
}
