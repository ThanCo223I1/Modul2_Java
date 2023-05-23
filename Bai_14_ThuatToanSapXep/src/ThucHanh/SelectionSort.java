package ThucHanh;

import java.util.Arrays;

public class SelectionSort {
    static double[] arr = {1, 2, 4, 5, 7, 6.6, -1.5};

    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            double min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Mang sau khi duoc sap xep");
            System.out.print("Array " + Arrays.toString(arr));
            break;
        }
    }
}

