package Fashion;

public class Customer extends Person{
    final int Role = 0;
    public static int number;
    public static int countIDCustomer = 1;
    public Customer(String name, String gender, String birthday, String phone, String email) {
        super(name, gender, birthday, phone, email);
        this.number = number;
    }

    public int getRole() {
        return Role;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Customer.number = number;
    }
}
