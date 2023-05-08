public class TimMinTrongMang {
    public static void main(String[] args) {
        int[] arr = {5,3,5,7};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}