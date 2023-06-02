package Fashion;

public class Customer extends Person{
    final int Role = 0;
    public Customer(String name, String gender, String birthday, String phone, String email) {
        super(name, gender, birthday, phone, email);
    }

    public int getRole() {
        return Role;
    }
}
