package ThucHanh;

import java.util.Arrays;

public class bubbleSort {
    static int[] arr = {1,2,3,4,6,3,4,6,7,-1};

    public static void BubbleSort(int[] arr) {
        boolean needNextPass = true;
        for (int i = 1; i < arr.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
       BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array " + Arrays.toString(arr) );
            break;
        }
    }

}
