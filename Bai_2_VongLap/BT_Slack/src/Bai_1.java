import java.util.Scanner;

//        1.Viết chương trình để tìm số nguyên tố thứ n(với n là số nguyên dương).

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Can Tim: ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 2; i > 0; i++) {
            boolean check = true;
            for (int k = 2; k <= Math.sqrt(i); k++) {
                if (i % k == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
            }
            if (count == n) {
                System.out.println("SNT la: " + i);
                break;
            }
        }
    }
}
