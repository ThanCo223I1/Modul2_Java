package BT_QLNS_15_5;

import java.text.ParseException;
import java.util.Scanner;

import static BT_QLNS_15_5.QuanLiNhanSu.bangLuongNV;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static QuanLiNhanSu quanLiNhanSu = new QuanLiNhanSu();

    public static void main(String[] args) throws ParseException {
        int choice;
        do {
            System.out.println("Quản Lý Nhân Sự:");
            System.out.println("-----------------------------");
            System.out.println("1. Hiển Thị Toàn Bộ Nhân Sự.");
            System.out.println("2. Thêm Nhân Sự Mới.");
            System.out.println("3. Tính Lương Cho Nhân Sự.");
            System.out.println("4. Xóa Nhân Sự Theo ID.");
            System.out.println("5. Sửa Nhân Sự Theo ID.");
            System.out.println("6. Tìm Kiếm Nhân Sự Theo Tên.");
            System.out.println("7. Sắp Xếp Theo Tuổi.");
            System.out.println("8. Thoát ra.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    quanLiNhanSu.hienThi();
                    break;
                case 2:
                    quanLiNhanSu.themNhanSu();
                    break;
                case 3:
                    bangLuongNV();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    quanLiNhanSu.sapXep();
                    break;
            }
        }while (choice != 8);
    }
}
