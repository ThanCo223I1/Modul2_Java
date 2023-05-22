package BaiTap;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0,"VietNam");
        System.out.println("Index: " + "0, Element: " + list.get(0));

        list.add(1,"American");
        System.out.println("Index: " + "1, Element: " + list.get(1));

        list.add(2,"ThaiLand");
        System.out.println("Index: " + "2, Element: " + list.get(2));

        list.add(3,"France");
        System.out.println("Index: " + "3, Element: " + list.get(3));

        list.add(4,"Gernany");
        System.out.println("Index: " + "4, Element: " + list.get(4));
    }
}
