package BT_ThucHanh;

public class TestStaticMethod{
    public static void main(String[] args) {
        Static_Method.change();
        Static_Method staticMethod = new Static_Method(111, "Hoang");
        Static_Method staticMethod1 = new Static_Method(111, "Khanh");
        Static_Method staticMethod2 = new Static_Method(111, "Nam");
        staticMethod.display();
        staticMethod1.display();
        staticMethod2.display();
    }
}