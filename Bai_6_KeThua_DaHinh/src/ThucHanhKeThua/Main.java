package ThucHanhKeThua;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle();

        System.out.println("Chu Vi Hình Tròn: " + circle.getArea());
        System.out.println("Diện Tích Hình Tròn: " + circle.getPerimeter());



        Rectangle rectangle = new Rectangle();

        System.out.println("Chu vi HCN: " + rectangle.getArea());
        System.out.println("Diện Tích HCN: " + rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);
    }
}

