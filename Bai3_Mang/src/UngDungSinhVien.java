import java.util.Scanner;

public class UngDungSinhVien {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Nhap do dai: ");
            size = scanner.nextInt();
            if (size > 30){
                System.out.println("Do dai khong qua 30");
            }
        }while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Nhap diem cho hoc sinh" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh dau danh sach: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
            if (array[j] >= 5 && array[j] <= 10){
                count++;
            }
        }
        System.out.println("So hoc sinh thi dat la: " + count);
    }
}
