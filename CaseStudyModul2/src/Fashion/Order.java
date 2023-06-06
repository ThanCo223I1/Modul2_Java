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

    public Order() {

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

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalMoney() {
        int count = 1;
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%s", "Product: ", "STT", "NameProduct", "Price", "Size", "Quantity", "Total Product \n");
        double totalMoney = 0;
        for (Product product : products) {
            totalMoney += product.getTotalPrice();
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%s", "", ++count, product.getNameProduct(), product.getPrice(), product.getSize(),
                    product.getQuantityOrder(), product.getQuantityOrder() * product.getPrice(), "\n");
        }
        return totalMoney;
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
