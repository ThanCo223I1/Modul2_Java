public class SP implements Comparable<SP> {
    private int id;
    public static int idTemp = 1;
    private String maSp ;
    private String nameSp;
    private  float giaSp;
    private  int soLuongSP;
    private  String moTa;

    public SP(String tenSanPham) {
    }

    public SP(String maSp, String nameSp, float giaSp, int soLuongSP, String moTa) {
        this.id = idTemp++;
        this.maSp = maSp;
        this.nameSp = nameSp;
        this.giaSp = giaSp;
        this.soLuongSP = soLuongSP;
        this.moTa = moTa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdTemp() {
        return idTemp;
    }

    public static void setIdTemp(int idTemp) {
        SP.idTemp = idTemp;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getNameSp() {
        return nameSp;
    }

    public void setNameSp(String nameSp) {
        this.nameSp = nameSp;
    }

    public float getGiasp() {
        return giaSp;
    }

    public void setGiasp(float giasp) {
        this.giaSp = giasp;
    }

    public int getSoLuongSP() {
        return soLuongSP;
    }

    public void setSoLuongSP(int soLuongSP) {
        this.soLuongSP = soLuongSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SP {" +
                " id= " + id +
                ", maSp = '" + maSp + '\'' +
                ", nameSp = '" + nameSp + '\'' +
                ", giasp = " + giaSp +
                ", soLuongSP = " + soLuongSP +
                ", moTa = '" + moTa + '\'' +
                '}';
    }

    @Override
    public int compareTo(SP o) {
        return (int) (giaSp - o.giaSp);
    }
}
