import java.util.Scanner;

//2. Viết chương trình để tìm tất cả các số hoàn hảo trong một khoảng số được nhập từ bàn phím.
public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So Dau: ");
        int a = scanner.nextInt();
        System.out.println("Nhap So Cuoi: ");
        int b = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            int count = 0;
            for (int j = 1; j < i ; j++) {
                if (i % j == 0){
                    count += j;
                }
            }
            if (i == count){
                System.out.println("So hoan hao la: " + i);
            }
        }
    }
}
