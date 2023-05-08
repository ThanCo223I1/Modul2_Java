import java.util.Scanner;

public class DaoNguocPTMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;
        int[] array;
        do {
            System.out.println("Nhap do dai cua mang: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kich thuoc khong qua 20");
            }
        }
        while (size > 20) ;
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhap phan tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Các phần tử trong mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("Mang sau khi dao nguoc: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}