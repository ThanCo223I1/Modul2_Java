import java.util.Arrays;
import java.util.Scanner;

public class XoaPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 5, 5, 6};
        System.out.println("Nhập phần tử cần xóa");
        int delete = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete) {
                index = i;
                break;
            }
        }
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i +1];
        }
        arr[arr.length -1] = 0;
        System.out.println("Mang sau khi xoa: " + Arrays.toString(arr));
    }
}
