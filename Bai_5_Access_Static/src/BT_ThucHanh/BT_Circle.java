package BT_ThucHanh;

class BT_Circle {
    private double radius = 3.0;
    private String color = "red";
    public BT_Circle(){
    }

    public BT_Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public BT_Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

     public static void main(String[] args) {
         BT_Circle btCircle = new BT_Circle();
         System.out.println("Color: " + btCircle.color);
         System.out.println("Enter: " + btCircle.radius);
         System.out.println("Result: " + btCircle.getArea());
     }
}
