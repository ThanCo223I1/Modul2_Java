import java.util.Arrays;
import java.util.Scanner;

//Bài tập 3: Tìm số nguyên tố lớn nhất trong một danh sách.
//Viết một hàm có tên "tim_so_nguyen_to_lon_nhat(danh_sach)"
//nhận đầu vào là một danh sách các số và
//trả về số nguyên tố lớn nhất trong danh sách đó.
public class Bai3_TimSNTMax {
    public static int MaxSNT(int[] list) {
        int max = -1;
        for (int num : list) {
            if (checkSNT(num) && num > max) {
                max = num;
            }
        }
        return max;
    }

    private static boolean checkSNT(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element : ");
            int number = Integer.parseInt(sc.nextLine());
            arr[i] = number;
        }
        System.out.println("SNT Max is: " + MaxSNT(arr) +  " of Arrays: " + Arrays.toString(arr));
    }
}

