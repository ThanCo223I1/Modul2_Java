package Fashion;

public class Admin extends Person{ //Person nó là cụ tổ. Admin là cha kế thừa phẩm chất đức tính của cụ tổ
    private final int Role = 1;
    public Admin(String name, String gender, String birthday, String phone, String email) {
        super(name, gender, birthday, phone, email);
    }

    public int getRole() {
        return Role;
    }
}
