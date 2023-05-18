package BaiTap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0,"VietNam");
        System.out.println("(1)" + list);
        list.add(1,"American");
        System.out.println("(2)" + list);
        list.add(2,"ThaiLand");
        System.out.println("(3)" + list);
        list.add(3,"France");
        System.out.println("(4)" + list);
        list.add(4,"Gernany");
        System.out.println("(5)" + list);
    }
}
