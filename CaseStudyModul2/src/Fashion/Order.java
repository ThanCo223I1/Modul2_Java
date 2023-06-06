package Fashion;

import java.util.List;

public class Order {
    private List<Product> products;
    private Admin employee;
    private Customer customer;

    public Order(List<Product> products, Admin employee, Customer customer) {
        this.products = products;
        this.employee = employee;
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Admin getEmployee() {
        return employee;
    }

    public void setEmployee(Admin employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "products=" + products +
                ", employee=" + employee +
                ", customer=" + customer +
                '}';
    }
}
