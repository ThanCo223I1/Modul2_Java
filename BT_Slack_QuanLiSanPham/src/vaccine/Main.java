package vaccine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLiCustomer quanLiCustomer = new QuanLiCustomer();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Danh Sách Khách Hàng Tiêm Chủng: ");
            System.out.println("______________________");
            System.out.println("1. Hiển Thị Khách Hàng .");
            System.out.println("2. Thêm Khách Hàng.");
            System.out.println("3. Tiêm Vaccine.");
            System.out.println("4. Thoát.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    quanLiCustomer.hienThi();
                    break;
                case 2:
                    quanLiCustomer.themCustomer();
                    break;
                case 3:
                    quanLiCustomer.tiemVaccine();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Lựa Chọn Không Hợp Lệ.");
                    break;
            }
        }
    }
}
