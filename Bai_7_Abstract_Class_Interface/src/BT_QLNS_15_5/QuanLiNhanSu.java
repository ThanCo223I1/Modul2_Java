package BT_QLNS_15_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static BT_QLNS_15_5.Main.quanLiNhanSu;

public class QuanLiNhanSu {
    static Scanner scanner = new Scanner(System.in);
    NhanSu[] mangCu = new NhanSu[0];
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    public void hienThi() {
        System.out.println("Tổng Nhân Sự: ");
        System.out.println("--------------------");
        System.out.println("Họ và Tên " + "\t" + " Số Điện Thoại " + "\t" + " Ngày Tháng Năm Sinh " + " \t \t \t " + "Số Ngày Làm / " + "Số Giờ ");
        for (NhanSu ns : mangCu) {
            System.out.println(ns.getName() +" \t " + ns.getPhone() + " \t " + ns.getBirthDay() +" \t \t \t " + (ns instanceof NSFullTime ? + ((NSFullTime) ns).getSoNgayLuong() : + ((NSPartTime) ns).getSoGioLam()));
        }
    }

    public void themNS(NhanSu nhanSu) {
        NhanSu[] mangMoi = new NhanSu[mangCu.length + 1];
        mangMoi[mangMoi.length - 1] = nhanSu;
        for (int i = 0; i < mangCu.length; i++) {
            mangMoi[i] = mangCu[i];
        }
        mangCu = mangMoi;
    }

    public NhanSu createNS(boolean isNSFullTime) throws ParseException {
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập Số Điện Thoại");
        String phone = scanner.nextLine();
        System.out.println("Nhập Ngày Tháng Năm Sinh");
        String date = scanner.nextLine();
        Date birthDay = format.parse(date);
        if (isNSFullTime) {
            System.out.println("Nhập Số Ngày Công: ");
            double soNgayLuong = Double.parseDouble(scanner.nextLine());
            return new NSFullTime(name, phone, birthDay, soNgayLuong);
        } else {
            System.out.println("Nhập Số Giờ Làm: ");
            int soGio = Integer.parseInt(scanner.nextLine());
            return new NSPartTime(name, phone, birthDay, soGio);
        }
    }

    public void tinhLuong(boolean isFullTime) {
        if (isFullTime) {
            System.out.println("Nhân Viên FullTime: ");
            System.out.println("---------------------");
            System.out.println("Họ Và Tên " + " \t " + "  Tiền Lương");
            for (NhanSu ns : mangCu) {
                if (ns instanceof NSFullTime) {
                    System.out.println(ns.getName() + " \t " + "  " + ns.tinhLuong());
                }
            }
        } else {
            System.out.println("Nhân Viên PartTime: ");
            System.out.println("Họ Và Tên     " + "   Tiền Lương");
            for (NhanSu ns1 : mangCu) {
                if (ns1 instanceof NSPartTime) {
                    System.out.println(ns1.getName() + "   " + "   " + ns1.tinhLuong());
                }
            }
        }
    }

    public static void bangLuongNV() {
        while (true) {
            System.out.println("1. Nhân Sự FullTime");
            System.out.println("2. Nhân Sự PartTime");
            System.out.println("3. Thoát");
            int tuyChon = Integer.parseInt(scanner.nextLine());
            switch (tuyChon) {
                case 1:
                    quanLiNhanSu.tinhLuong(true);
                    break;
                case 2:
                    quanLiNhanSu.tinhLuong(false);
                    break;
                case 3:
                    return;
            }
        }
    }
    public void themNhanSu() throws ParseException {
        int choice ;
        do {
            System.out.println("1. Nhân Sự FullTime.");
            System.out.println("2. Nhân Sự PartTime.");
            System.out.println("3. Thoát ra.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    NhanSu nhanSu1 = quanLiNhanSu.createNS(true);
                    quanLiNhanSu.themNS(nhanSu1);
                    break;
                case 2:
                    NhanSu nhanSu2 = quanLiNhanSu.createNS(false);
                    quanLiNhanSu.themNS(nhanSu2);
                    break;
                case 3:
                    break;
                default:
                    System.err.println("Bạn Đã Nhập Sai! Vui Lòng Nhập Lại. ");
            }
        }while (choice != 3);
    }

   public void sapXep() {
       for (int i = 0; i < mangCu.length -1; i++) {
           for (int j = i + 1; j < mangCu.length; j++) {
               if (mangCu[i].getBirthDay().before( mangCu[j].getBirthDay())){
                   NhanSu temp = mangCu[i];
                   mangCu[i] = mangCu[j];
                   mangCu[j] = temp;
               }
           }
       }
   }
}
