package BT_KeThua;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(6,"red");
        System.out.println("Diện Tích: " + circle.AreaCircle() + "\n");

        Cylinder cylinder = new Cylinder(4,"Red",5);
        System.out.println("Thể Tích: " + cylinder.TTCylider());
    }
}
