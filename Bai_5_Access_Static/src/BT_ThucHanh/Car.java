package BT_ThucHanh;

public class Car {
    private String ten;
    private  String dongCo;
    public static int SoLuongOTo;

    public Car(String ten, String dongCo) {
        this.ten = ten;
        this.dongCo = dongCo;
        SoLuongOTo++;
    }
}
