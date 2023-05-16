package BT_QLNS_15_5;

import java.util.Date;

public abstract class NhanSu {
    private int id;
    private String name;
    private String phone;
    private Date birthDay;
    private static int count = 0;

    public NhanSu() { // tao phuong thuc cho bien dem id.
        this.id = ++count;
    }

    public NhanSu(String name, String phone, Date birthDay) {
        this.id = ++count;
        this.name = name;
        this.phone = phone;
        this.birthDay = birthDay;
    }
    public abstract double tinhLuong();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
