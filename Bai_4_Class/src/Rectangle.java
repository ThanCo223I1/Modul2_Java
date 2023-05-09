import java.util.Scanner;

public class Rectangle {

        double width;
        double height;

    public Rectangle(){
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width * this.height) * 2;
    }
    public String display(){
        return  "Rectangle{" + "width = " + width + ", height = " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        double width = scanner.nextDouble();
        System.out.println("Nhap chieu rong: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("HCN la: " + rectangle.display());
        System.out.println("Chu vi HCN la : " + rectangle.getPerimeter());
        System.out.println("Dien Tich HCN la: " + rectangle.getArea());
    }
}