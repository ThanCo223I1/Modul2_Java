import java.util.Scanner;

public class TinhCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight;
        System.out.print("Cân nặng của bạn (tính bằng kg): ");
        weight = scanner.nextDouble();
        System.out.print("Chiều cao của bạn (tính bằng m): ");
        double height = scanner.nextDouble();
        double bmi = weight/Math.pow(height,2);
        if (bmi < 18) {
            System.out.printf( bmi + " Thieu Can");
        } else if (bmi < 25.0) {
            System.out.printf( bmi + " Binh Thuong");
        } else if (bmi < 30.0) {
            System.out.printf( bmi + " Thua can");
        } else {
            System.out.printf( bmi + " Beo phi");
        }
    }
}
