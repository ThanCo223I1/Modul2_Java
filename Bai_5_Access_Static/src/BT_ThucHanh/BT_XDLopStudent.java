package BT_ThucHanh;

public class BT_XDLopStudent {
    static String name = "Than";
    static String classes = "C0223h1";

    public BT_XDLopStudent() {
    }

    public BT_XDLopStudent (String name1, String classes1) {
        name = name1;
        classes = classes1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", classes='" + classes;
    }
}
