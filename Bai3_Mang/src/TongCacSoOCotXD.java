import javafx.scene.transform.Scale;

import java.util.Scanner;

public class TongCacSoOCotXD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng: ");
        int rowspan = scanner.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int colspan = scanner.nextInt();
        int[][] arr = new int[rowspan][colspan];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < rowspan; i++) {
            for (int j = 0; j < colspan; j++) {
                System.out.println("arr[" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Nhập cột muốn tính tổng: ");
        int col = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < rowspan; i++) {
            total += arr[i][col];
        }
        System.out.println("Tổng các phần tử ở cột " + col + " là: " + total);
        scanner.close();
    }
}
