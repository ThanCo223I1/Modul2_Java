package ThucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Nhap phan tu trong mang: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang cua ban la: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            break;
        }
        System.out.println("Begin sort processing...");
        bubbleSortByStep(arr);
    }

    public static void bubbleSortByStep(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.println(arr[j] + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass = false) {
                System.out.println("Mảng có thể được sắp xếp và không cần vượt qua tiếp theo");
                break;
            }
            System.out.println("List after the  " + i + "' sort: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.println(Arrays.toString(arr));
                break;
            }
            System.out.println();
        }
    }
}
