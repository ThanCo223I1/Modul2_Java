package BT_QuanLiNhanVien;

import java.util.Scanner;

public class Menu extends QuanLiNhanVien {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CRUD nhanVien = new CRUD();
        while (true){
            System.out.println("Quản Lí Nhân Viên: ");
            System.out.println("1. Hiển thị toàn bộ nhân viên");
            System.out.println("2. Thêm nhân viên");
            System.out.println("3. Tính lương của nhân viên");
            System.out.println("4. Xóa nhân viên theo ID");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    nhanVien.hienThi();
                    break;
                case 2:
                    nhanVien.themNV();
                    break;
                case 3:
                    nhanVien.TinhLuongNV();
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(5);
            }
        }
    }
}
