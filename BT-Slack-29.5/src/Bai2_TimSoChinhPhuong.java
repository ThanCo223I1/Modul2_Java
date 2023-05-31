import java.util.Scanner;

//Bài tập 2: Tìm số chính phương gần nhất.
//Viết một hàm có tên "tim_so_chinh_phuong_gan_nhat(n)"
// nhận đầu vào là một số nguyên dương n và
// trả về số chính phương gần nhất và nhỏ hơn n.
public class Bai2_TimSoChinhPhuong {
    public static boolean checkChinhPhuong(int n) {
        for (int i = 0; i < n; i++) {
            if (Math.pow(i , 2) == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int enterNumber = Integer.parseInt(sc.nextLine());
        while (!checkChinhPhuong(enterNumber)) {
            enterNumber++;
        }
        System.out.println("The next perfect square is: " + enterNumber);

    }
}
