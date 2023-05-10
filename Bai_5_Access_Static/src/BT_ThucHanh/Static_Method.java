package BT_ThucHanh;

public class Static_Method {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Static_Method(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

