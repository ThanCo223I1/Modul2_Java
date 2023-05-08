import java.util.Scanner;

//        5. Viết chương trình để tính tổng của tất cả các số nguyên tố có hai chữ số.
public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tong = 0;
        for (int i = 0; i < 500; i++) {
            int a = i;
            for (int j = 0; j <= a; j++) {
                if (i == a) {
                    tong += a;
                    break;
                }
                if (a % i == 0) {
                    break;
                }
            }
        }
        System.out.println(tong);
    }
}

