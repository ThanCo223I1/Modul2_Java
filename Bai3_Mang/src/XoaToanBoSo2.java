import java.util.Arrays;

public class XoaToanBoSo2 {
    public static void main(String[] args) {
           int[] arr = {1,2,4,3,4,5,2,2};
           int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                count++;
            }
        }
        System.out.println(count);
        int[] arr1 = new int[arr.length - count];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                a++;
                continue;
            }arr1[i - a]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
