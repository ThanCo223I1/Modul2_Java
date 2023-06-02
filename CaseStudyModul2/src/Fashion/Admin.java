package Fashion;

public class Admin extends Person{
    private final int Role = 1;
    public Admin(String name, String gender, String birthday, String phone, String email) {
        super(name, gender, birthday, phone, email);
    }

    public int getRole() {
        return Role;
    }
}
