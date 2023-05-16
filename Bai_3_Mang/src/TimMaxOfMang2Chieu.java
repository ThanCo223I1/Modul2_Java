import java.util.Scanner;

public class TimMaxOfMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng");
        int rowspan = scanner.nextInt();
        System.out.println("Nhập số lượng phần tử của mảng trong mảng ");
        int colspan = scanner.nextInt();
        int[][] arr = new int[rowspan][colspan];
        System.out.println("Nhập các phần tử của mảng");
        for (int i = 0; i < rowspan; i++) {
            for (int j = 0; j < colspan; j++) {
                System.out.println("arr [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < rowspan; i++) {
            for (int j = 0; j < colspan; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
        scanner.close();
    }
}
