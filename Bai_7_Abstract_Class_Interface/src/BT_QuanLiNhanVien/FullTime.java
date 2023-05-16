package BT_QuanLiNhanVien;

public class FullTime extends QuanLiNhanVien{
    private double heSo;



    public FullTime(int id, String name, String phone, String birthday, double heSo) {
        super(id, name, phone, birthday);
        this.heSo = heSo;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    public double tinhTuong(){
        return this.heSo * 3000000;
    }
}
