package vaccine;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    public static int count;
    private String nameCustomer;
    private String phone;
    private List<Vaccine> vaccines = new ArrayList<>();

    public Customer( String nameCustomer, String phone, List<Vaccine> vaccines) {
        this.id = ++count;
        this.nameCustomer = nameCustomer;
        this.phone = phone;
        this.vaccines = vaccines;
    }

    public Customer(String nameCustomer, String phone) {
        this.id = ++count;
        this.nameCustomer = nameCustomer;
        this.phone = phone;
    }

    public Customer () {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(List<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }

    public void addVaccine(Vaccine vaccine) {
        vaccines.add(vaccine);
    }

    @Override
    public String toString() {
        return "Customer {" +
                "id = " + id +
                ", nameCustomer = '" + nameCustomer + '\'' +
                ", phone = '" + phone + '\'' +
                ", vaccines = " + vaccines +
                '}';
    }
}
