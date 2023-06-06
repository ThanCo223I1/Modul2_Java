package Manager;

import Fashion.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ManagerOrder extends ManagerProduct {

    static List<Product> orders = new ArrayList<>();
    ManagerProduct managerProduct = new ManagerProduct();
    ManagerPerSon managerPerSon = new ManagerPerSon();
    ManagerCustomer managerCustomer = new ManagerCustomer();
    Scanner scanner = new Scanner(System.in);

    public static void writeDataToFile(List<Product> orders) {
        try {
            FileOutputStream fos = new FileOutputStream("Order.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(orders);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile() {
        List<Product> products1 = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("Order.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products1 = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products1;
    }


    public void purchaseProduct() { // mua sản phẩm.
        Product product = null;
        int quantity = 0;
        int count = 0;
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Choose To Buy Products");
            System.out.println("2. purchaseProduct");
            System.out.println("3. Exit.");
            System.out.println("Enter Choice!");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                 //   List<Product> products1 = readDataFromFile();
                    System.out.println("Enter Product Name: ");
                    String productName = scanner.nextLine();
                    for (Product product1 : products) {
                        if (product1.getNameProduct().equals(productName)) {
                            product = product1;
                            System.out.printf("%-20s%-20s%-20s%-20s%s", "Product: ", "STT", "NameProduct", "Price", "Size \n");
                            System.out.printf("%-20s%-20s%-20s%-20s%-20s%s", "", product.getId(), product.getNameProduct(), product.getPrice(), product.getSize(), "\n");
                            System.out.println("Enter Quantity: ");
                            quantity = Integer.parseInt(scanner.nextLine());
                            product = new Product(product1.getNameProduct(), product1.getTrademark(),
                                    product1.getMaterial(), product1.getPrice(), product1.getSize(), product1.getQuantity(), quantity);
                            orders.add(product);
                            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%s", "Product: ", "STT", "NameProduct", "Price", "Size", "Quantity", "Total Product \n");
                            for (Product order1 : orders) {
                                System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%s", "", ++count, order1.getNameProduct(), order1.getPrice(), order1.getSize(),
                                        order1.getQuantityOrder(), order1.getQuantityOrder() * order1.getPrice(), "\n");
                            }
                            count = 0;
                            break;
                        }
                    }
//                    writeDataToFile(products1);
                    break;
                case "2":
                    List<Product> products11 = readDataFromFile();
                    double totalPrice = 0;
                    for (Product order : orders) {
                        if (order.getQuantity() >= quantity) {
                            totalPrice = totalPrice + (order.getPrice() * order.getQuantityOrder());

                        }
                    }
                    System.out.println("\t\t\t\t" + " ------------------------------------ TOTAL BILLS PAYMENT -------------------------------------");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%s", "Product: ", "STT", "NameProduct", "Price", "Size", "Quantity", "Total Product", " \n");
                    for (Product order1 : orders) {
                        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%s", "", ++count, order1.getNameProduct(),
                                order1.getPrice(), order1.getSize(), order1.getQuantityOrder(), order1.getQuantityOrder() * order1.getPrice(), "\n");

                    }
                    count = 0;
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%s", "Total Order:", "", "", "", "", "", totalPrice, "\n");
                    writeDataToFile(products11);
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Not Found Choice!");
            }
        }

    }
}