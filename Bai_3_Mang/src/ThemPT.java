import java.util.Arrays;
import java.util.Scanner;

public class ThemPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {4, 5, 2, 4, 6};
        System.out.println("Nhập số cần thêm: ");
        int NhapPt = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm: ");
        int viTri = scanner.nextInt();
        int[] arr1 = new int[arr.length + 1];
        if (viTri <= -1 || viTri >= arr.length - 1) {
            System.out.println("Không được chèn vào mảng");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (i < viTri){
                    arr1[i] = arr[i];
                } else if (i == viTri) {
                    arr1[i] = NhapPt;
                }else {
                    arr1[i] = arr[i-1];
                }
            }
        }
        System.out.println("Mảng sau khi được thêm: " + Arrays.toString(arr1));
    }
}
