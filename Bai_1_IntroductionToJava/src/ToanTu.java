import java.util.Scanner;
public class ToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);// khai bao doi tuong Scanner.
        System.out.println("Enter width: ");
        width = scanner.nextFloat(); //Nhap chieu rong
        System.out.println("Enter height: ");
        height = scanner.nextFloat(); // Nhap chieu dai
        float area = width * height;
        System.out.println("Area is: " + area);
        scanner.close();
    }
}
