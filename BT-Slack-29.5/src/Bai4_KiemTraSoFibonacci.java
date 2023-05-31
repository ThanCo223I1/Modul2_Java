import java.util.ArrayList;
import java.util.Scanner;
//Bài tập 4: Kiểm tra chuỗi số có tạo thành dãy Fibonacci hay không.
//Viết một hàm có tên "kiem_tra_dãy_fibonacci(chuoi)"
// nhận đầu vào là một chuỗi số và trả về
// True nếu chuỗi số tạo thành một dãy Fibonacci,
// False nếu không phải.
public class Bai4_KiemTraSoFibonacci {

    public static boolean checkFibonacci(String string){
        // phan tach chuoi thanh mang.
        String[] arr = string.split(",");
        // kiem tra neu nho hon 3 thi false luon.
        if (arr.length < 3){
            return false;
        }
        //chuyen doi cac so trong mang thanh kieu int.
        int[] number = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            number[i] = Integer.parseInt(arr[i]);
        }
        //Kiem tra tu so 3 tro di trong mang
        for (int i = 2; i < number.length; i++) {
            if (number[i] != number[i - 1] + number[i - 2]) {
                return false; // Số không thỏa mãn điều kiện của dãy Fibonacci/
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        String Enter = sc.nextLine();
        boolean test = checkFibonacci(String.valueOf(Enter));
        System.out.println(test);
    }
}
