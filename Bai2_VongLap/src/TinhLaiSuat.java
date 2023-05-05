import java.util.Scanner;

public class TinhLaiSuat {
    public static void main(String[] args) {
        double tien = 1.0;
        int thang  = 1;
        double laiSuat = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số Tiền Vay");
        tien = scanner.nextDouble();

        System.out.println("Số Tháng Vay");
        thang = scanner.nextInt();

        System.out.println("Lãi Suất");
        laiSuat = scanner.nextDouble();

        double  tong = 0;
        for (int i = 0; i < thang; i++) {
            tong += tien * (laiSuat/100)/12 * thang;
        }System.out.println("Tổng lãi suất sau kỳ hạn vay: " + tong);
    }
}
