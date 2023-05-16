import java.util.Scanner;

public class TimMax2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập Số b: ");
        int b = scanner.nextInt();

        System.out.println("Nhập Số c: ");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            if (b >= c) {
                System.out.println(b + " Lớn Thứ 2 ");
            } else {
                System.out.println(c + " Lớn Thứ 2");
            }
        } else if (b > a && b > c) {
            if (a >= c) {
                System.out.println(a + " Lớn Thứ 2");
            } else {
                System.out.println(c + " Lớn Thứ 2");
            }
        } else if (a > b) {
            System.out.println(a + " Lớn Thứ 2");
        } else {
            System.out.println(b + " Lớn Thứ 2 ");
        }
    }
}

