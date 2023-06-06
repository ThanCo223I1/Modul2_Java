package Manager;

import Fashion.Product;
import Fashion.Validate;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
  public static List<Product> products = new ArrayList<>();
  Validate validate = new Validate();
   static Scanner scanner = new Scanner(System.in);

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
        products = products1;
        return products1;
    }

    //1. Hiển thị danh sách sản phẩm
    public void DisplayProduct() {
        List<Product> products1 = readDataFromFile();
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Product: ", "Number", "ID", "Name", "Age", "Phone", "Address", "Email", "WorkTime \n");
        for (Product product : products1) {
            if (product instanceof Product) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((Product) product).getNumber(), product.getId(), product.getNameProduct(), product.getTrademark(), product.getMaterial(), product.getPrice(), product.getSize(), ((Product) product).getQuantity() + "\n");
            }
        }

    }

    //2. Thêm sản phẩm
    public Product creatProduct() {
        String nameProduct;
        while (true) {
            System.out.println("Enter Name Product: ");
            String inputNameProduct = scanner.nextLine();
            if (validate.isValidateInputString(inputNameProduct, Validate.NameProDuct_PETTERN)) {
                nameProduct = inputNameProduct;
                break;
            } else System.out.println("Not validate!");
        }
        String trademark;
        while (true) {
            System.out.println("Enter Trademark: ");
            String inputTrademark = scanner.nextLine();
            if (validate.isValidateInputString(inputTrademark, Validate.Trademark_PETTERN)) {
                trademark = inputTrademark;
                break;
            } else System.out.println("Not validate!");
        }
        String material;
        while (true) {
            System.out.println("Enter Material: ");
            String inputMaterial = scanner.nextLine();
            if (validate.isValidateInputString(inputMaterial, Validate.Material_PETTERN)) {
                material = inputMaterial;
                break;
            } else System.out.println("Not validate!");
        }
        double price;
        while (true) {
            System.out.println("Enter Price: ");
            double inputPrice = Double.parseDouble(scanner.nextLine());
            if (validate.isValidateInputString(String.valueOf(inputPrice), Validate.Price_PETTERN)) {
                price = inputPrice;
                break;
            } else System.out.println("Not validate!");
        }
        String size;
        while (true) {
            System.out.println("Enter Size: ");
            String inputSize = scanner.nextLine();
            if (validate.isValidateInputString(inputSize, Validate.Size_PETTERN)) {
                size = inputSize;
                break;
            } else System.out.println("Not validate!");
        }
        int quantity;
        while (true) {
            System.out.println("Enter Quantity: ");
            int inputQuantity = Integer.parseInt(scanner.nextLine());
            if (validate.isValidateInputString(String.valueOf(inputQuantity), Validate.Quantity_PETTERN)) {
                quantity = inputQuantity;
                break;
            } else System.out.println("Not validate!");
        }

        return new Product(nameProduct,trademark,material,price,size,quantity);
    }
    public void AddProduct() {
        while (true) {
            List<Product> products1 = readDataFromFile();
            System.out.println("1. Add Product: ");
            System.out.println("2. Exit.");
            System.out.println("Enter Choice.");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    products1.add(creatProduct());
                    writeDataToFile(products1);
                    break;
                case "2":
                    return;
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }

    // Tạo đối tượng tìm kiếm id chung
    public int findIndexById(int id) {
        if (!products.isEmpty()) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId() == id) return i;
            }
        }
        return -1;
    }

    // 3. Sửa Sản Phẩm theo id
    public void EditProductById() {
        List<Product> products1 = readDataFromFile();
        if (products.isEmpty()) {
            System.out.println("Products is Empty!");
        } else {
            System.out.print("Enter ID : ");
            int id = Integer.parseInt(scanner.nextLine());
            Product newProduct = creatProduct();
            Product.count--;
            int checkID = findIndexById(id);
            if (checkID != -1) {
                newProduct.setId(products.get(checkID).getId());
                products.set(checkID, newProduct);
            } else System.out.println("Not found ID!");
        }
        writeDataToFile(products1);
    }

    // 4. Xóa sản phẩm theo id
    public void DeleteProductByID() {
        List<Product> products1 = readDataFromFile();
        if (products.isEmpty()) {
            System.out.println("Products is Empty!");
        } else {
            System.out.print("Enter ID : ");
            int id = Integer.parseInt(scanner.nextLine());
            int checkID = findIndexById(id);
            if (checkID != -1) {
                products.remove(checkID);
            } else System.out.println("Not found ID!");
        }
        writeDataToFile(products1);
    }
}
