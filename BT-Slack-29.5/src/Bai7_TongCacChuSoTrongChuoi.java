import sun.text.normalizer.UCharacter;

import java.util.Arrays;
import java.util.Scanner;

//Bài tập 7: Tính tổng các chữ số trong một chuỗi số.
//Viết một hàm có tên "tinh_tong_chu_so(chuoi)"
// nhận đầu vào là một chuỗi số và trả về tổng của các chữ số trong chuỗi
public class Bai7_TongCacChuSoTrongChuoi {
    public static int TinhTongChuSo(String string){
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Character.isDigit(ch)){
                int number = Character.getNumericValue(ch);
                sum += number;
            }
        }return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element: ");
            int number = Integer.parseInt(sc.nextLine());
            arr[i] = number;
        }
        int total = TinhTongChuSo(Arrays.toString(arr));
        System.out.println("Sum of digits in string " + Arrays.toString(arr) + " is: " + total);
    }
}
