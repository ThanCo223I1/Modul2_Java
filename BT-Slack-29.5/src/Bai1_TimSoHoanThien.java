import java.util.Scanner;

//Bài tập 1: Tìm số hoàn thiện tiếp theo.
//Viết một hàm có tên "tim_so_hoan_thien_tiep_theo(n)"
// nhận đầu vào là một số nguyên dương n và
// trả về số hoàn thiện lớn hơn n đầu tiên.
// Một số hoàn thiện là số có tổng các ước số (không tính chính nó) bằng chính nó.
public class Bai1_TimSoHoanThien {
    public static int timSoHoanThienTiepTheo(int n) {
        int number = n + 1;
        while (true) {
            if (checkSoHoanThien(number)) {
                return number;
            }
            number++;
        }
    }

    // Khoi tao bien check.
    public static boolean checkSoHoanThien(int number) {
        int sum = 0;
        // Tìm các ước số và tính tổng
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number; // Kiểm tra tổng các ước số có bằng số đó hay không
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = Integer.parseInt(sc.nextLine());
        int soHoanThienTiepTheo = timSoHoanThienTiepTheo(n);
        System.out.println("The next major perfecting number of " + n + " is: " + soHoanThienTiepTheo);
    }
}
