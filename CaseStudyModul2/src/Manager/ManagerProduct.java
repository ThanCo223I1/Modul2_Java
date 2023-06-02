package Manager;

import Fashion.EmployeeFullTime;
import Fashion.EmployeePartTime;
import Fashion.Person;
import Fashion.Product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    List<Product> products = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static void writeDataToFile(List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream("SanPham.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile() {
        List<Product> products1 = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("SanPham.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products1 = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products1;
    }

    public Product creatProduct() {
        System.out.println("Enter Name Product: ");
        String nameProduct = scanner.nextLine();
        System.out.println("Enter Trademark: ");
        String trademark = scanner.nextLine();
        System.out.println("Enter Material: ");
        String material = scanner.nextLine();
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter Size: ");
        String size = scanner.nextLine();
        System.out.println("Enter Quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        return new Product(nameProduct,trademark,material,price,size,quantity);
    }
    public void AddProduct(){
        List<Product> products1 = readDataFromFile();
        System.out.println("1. Add Product: ");
        System.out.println("2. Exit.");
        System.out.println("Enter Choice.");
        String choice = scanner.nextLine();
        switch (choice){
            case "1":
                products.add(creatProduct());
                writeDataToFile(products1);
                break;
            case "2":
                return;
            default:
                System.out.println("Not Found Choice!");
        }
    }
    public void showProduct() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Product: ", "Number", "ID", "Name", "Age", "Phone", "Address", "Email", "WorkTime \n");
        for (Product product : products) {
            if (product instanceof Product) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((Product) product).getNumber(), product.getId(), product.getNameProduct(), product.getTrademark(), product.getMaterial(), product.getPrice(), product.getSize(), ((Product) product).getQuantity() + "\n");
            }
        }
    }

}
