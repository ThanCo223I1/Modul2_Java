import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private int number;
    public static int num;
    public static int count;
    private String nameProduct;
    private String trademark; //thương hiệu
    private String material; // chất liệu
    private double price;
    private String size;
    private int quantity;

    public Product(String nameProduct, String trademark, String material, double price, String size, int quantity) {
        this.id = count++;
        this.number  = num++;
        this.nameProduct = nameProduct;
        this.trademark = trademark;
        this.material = material;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
