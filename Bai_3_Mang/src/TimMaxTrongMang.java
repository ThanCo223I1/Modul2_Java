import java.util.Arrays;
import java.util.Scanner;

public class TimMaxTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int doDai ;
        int[] arr;
        do {
            System.out.println("Nhập độ dài: ");
            doDai = scanner.nextInt();
            if (doDai>20){
                System.out.println("không vượt quá 20");
            }
        }while (doDai>20);
        arr = new int[doDai];
        int i = 0;
        while (i<arr.length){
            System.out.println("Nhập phần tử: " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Danh sách mảng là: ");
        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max){
                max = arr[j];
                index= j + 1;
            }
        }System.out.println("Số lớn nhất là: " + max + ", Vị trí người dùng thấy là: " + index);
    }
}
