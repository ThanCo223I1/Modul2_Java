package BT_QLNS_15_5;

import java.util.Date;

public class NSFullTime extends NhanSu {
    private double soNgayLuong;

    @Override
    public double tinhLuong() {
        return soNgayLuong * 3000000;
    }

    public NSFullTime() {
    }

    public NSFullTime(String name, String phone, Date birthDay, double soNgayLuong) {
        super(name, phone, birthDay);
        this.soNgayLuong = soNgayLuong;
    }

    public double getSoNgayLuong() {
        return soNgayLuong;
    }

    public void setSoNgayLuong(double soNgayLuong) {
        this.soNgayLuong = soNgayLuong;
    }
}
