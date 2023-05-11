package BT_ThucHanh;

public class Test extends BT_XDLopStudent{
    public static void main(String[] args) {
        BT_XDLopStudent btXdLopStudent = new BT_XDLopStudent();
        btXdLopStudent.getName();
        btXdLopStudent.setName("Khanh");
        btXdLopStudent.getClasses();
        btXdLopStudent.setClasses("C03");
        System.out.println(btXdLopStudent);
    }
}
