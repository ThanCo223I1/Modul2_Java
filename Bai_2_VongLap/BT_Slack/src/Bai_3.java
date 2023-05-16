import java.util.Scanner;

//        3. Viết chương trình để tính tổng của tất cả các số nguyên tố nhỏ hơn hoặc bằng một số được nhập từ bàn phím.
public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So n: ");
        int n = scanner.nextInt();
        int total = 0;
        for (int i = 2; i <= n ; i++) {
            boolean check = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0){
                    check = false;
                    break;
                }
            }if (check){
                total +=i;
            }
        }
        System.out.println("Total is: " + total);
    }
}
