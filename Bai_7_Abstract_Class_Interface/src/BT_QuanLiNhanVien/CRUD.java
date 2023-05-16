package BT_QuanLiNhanVien;

import java.util.Scanner;

public class CRUD extends QuanLiNhanVien {
    Scanner scanner = new Scanner(System.in);
    QuanLiNhanVien[] quanLiNhanViens = new QuanLiNhanVien[3];
    FullTime[] fullTime = new FullTime[1];
    PartTime[] partTimes = new PartTime[1];

    CRUD() {
        fullTime[0] = new FullTime(1, "Than", "0901285682", "2/2/1999", 1);
        partTimes[0] = new PartTime(1, "Thang", "0901285682", "2/2/1998", 1);
    }

    public void hienThi() {
        System.out.println("Nhân Viên Fulltime: ");
        System.out.println("--------------------------------------------------");
        System.out.println("ID" + "      " + "Name" + "       " + "Phone" + "         " + "Birthday" + "    " + "Số Ngày Làm");
        for (FullTime f : fullTime) {
            System.out.println(f.getId() + ".      " + f.getName() + "       " + f.getPhone() + "    " + f.getBirthday() + "    " + f.getHeSo());
        }
        System.out.println("Nhân Viên Parttime: ");
        System.out.println("--------------------------------------------------");
        System.out.println("ID" + "      " + "Name" + "       " + "Phone" + "         " + "Birthday" + "    " + "Số Giờ Làm");
        for (PartTime p : partTimes) {
            System.out.println(p.getId() + ".      " + p.getName() + "      " + p.getPhone() + "    " + p.getBirthday() + "    " + p.getGioLam());
        }
    }

    public void themNV() {
        int Nhap;
        do {
            System.out.println("1. Them nhan vien Fulltime:");
            System.out.println("2. Them nhan vien Parttime:");
            System.out.println("3. Thoat: ");
            Nhap = Integer.parseInt(scanner.nextLine());
            switch (Nhap) {
                case 1:
                    themNvFullTime();
                    break;
                case 2:
                    themNvPartTime();
                    break;
                case 3:
                    break;
            }
        }while (Nhap != 3);


    }

    public void themNvFullTime() {
        System.out.println("Nhap ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap Birthday: ");
        String bir = scanner.nextLine();
        System.out.println("Nhap He So: ");
        double heSo = Double.parseDouble(scanner.nextLine());
        FullTime[] newFullTimes = new FullTime[fullTime.length + 1];
        FullTime newFullTimes1 = new FullTime(id, name, phone, bir, heSo);
        newFullTimes[fullTime.length] = newFullTimes1;
        for (int i = 0; i < fullTime.length; i++) {
            newFullTimes[i] = fullTime[i];
        }
        fullTime = newFullTimes;
    }

    public void themNvPartTime() {
        System.out.println("Nhap ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap Name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap Birthday: ");
        String bir = scanner.nextLine();
        System.out.println("Nhap Gio Lam: ");
        double gioLam = Double.parseDouble(scanner.nextLine());
        PartTime[] newp = new PartTime[partTimes.length + 1];
        PartTime p1 = new PartTime(id, name, phone, bir, gioLam);
        newp[partTimes.length] = p1;
        for (int i = 0; i < partTimes.length; i++) {
            newp[i] = partTimes[i];
        }
        partTimes = newp;
    }

    public void TinhLuongNV(){
        System.out.println("Lương Nhân Viên FullTime: ");
        for (int i = 0; i < fullTime.length; i++) {
            double tienLuong;
            tienLuong = 3000000 * fullTime[i] .tinhTuong();
            System.out.println(tienLuong);
        }

    }
}
