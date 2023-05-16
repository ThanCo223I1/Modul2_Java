package BT_QuanLiNhanVien;

import java.util.Date;

public class QuanLiNhanVien {
    private int id ;
    private String name ;
    private String phone;
    private String  Birthday;
    public  QuanLiNhanVien(){

    }

    public QuanLiNhanVien(int id, String name, String phone, String birthday) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        Birthday = birthday;
    }

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

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }
}
