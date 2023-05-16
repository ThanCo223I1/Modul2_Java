package BT_QuanLiNhanVien;

import java.util.Date;

public class PartTime extends QuanLiNhanVien {
    private double gioLam;

    public PartTime(double gioLam) {
        this.gioLam = gioLam;
    }

    public PartTime(int id, String name, String phone, String birthday, double gioLam) {
        super(id, name, phone, birthday);
        this.gioLam = gioLam;
    }

    public double getGioLam() {
        return gioLam;
    }

    public void setGioLam(double gioLam) {
        this.gioLam = gioLam;
    }
    public double tinhLuong(){
        return this.gioLam * 30000;
    }
}
