package BT_QLNS_15_5;

import java.util.Date;

public class NSPartTime extends NhanSu{
    private double soGioLam;

    @Override
    public double tinhLuong() {
        return soGioLam * 30000;
    }


    public NSPartTime(double soGioLam) {
        this.soGioLam = soGioLam;
    }

    public NSPartTime(String name, String phone, Date birthDay, double soGioLam) {
        super(name, phone, birthDay);
        this.soGioLam = soGioLam;
    }

    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }
}
