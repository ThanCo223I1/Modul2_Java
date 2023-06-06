package Manager;

import Fashion.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    List<Customer> customers = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Validate validate = new Validate();

    public static void writeDataToFile(List<Customer> customers) {
        try {
            FileOutputStream fos = new FileOutputStream("Customer.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readDataFromFile() {
        List<Customer> customers1 = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("Customer.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            customers1 = (List<Customer>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return customers1;
    }

    public Customer creatCustomer() {
        String name;
        while (true) {
            System.out.println("Enter Name Customer: ");
            String inputName = scanner.nextLine();
            if (validate.isValidateInputString(inputName, Validate.Name_PATTERN)) {
                name = inputName;
                break;
            } else System.out.println("Not validate!");
        }
        String gender;
        while (true) {
            System.out.println("Enter Gender Customer: ");
            String inputGender = scanner.nextLine();
            if (validate.isValidateInputString(inputGender, Validate.Gender_PATTERN)) {
                gender = inputGender;
                break;
            } else System.out.println("Not validate!");
        }
        String birthDay;
        while (true) {
            System.out.println("Enter BirthDay Customer: ");
            String inputBirthDay = scanner.nextLine();
            if (validate.isValidateInputString(inputBirthDay, Validate.BirthDay_PETTERN)) {
                birthDay = inputBirthDay;
                break;
            } else System.out.println("Not validate!");
        }
        String phone;
        while (true) {
            System.out.println("Enter Phone Customer: ");
            String inputPhone = scanner.nextLine();
            if (validate.isValidateInputString(inputPhone, Validate.Phone_PETTERN)) {
                phone = inputPhone;
                break;
            } else System.out.println("Not validate!");
        }
        String email;
        while (true) {
            System.out.println("Enter Email Customer: ");
            String inputEmail = scanner.nextLine();
            if (validate.isValidateInputString(inputEmail, Validate.Email_PETTERN)) {
                email = inputEmail;
                break;
            } else System.out.println("Not validate!");
        }
        Customer.countIDCustomer--;
        return new Customer(name, gender, birthDay, phone, email);
    }

    // Thêm Khách Hàng
    public void AddCustomer() {
        List<Customer> customers1 = readDataFromFile();
        customers1.add(creatCustomer());
    }

    //Hiển thị khách hàng
    private void DisplayCustomer() {
        List<Customer> customers1 = readDataFromFile();
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Part Time: ", "Number", "ID", "Name", "Gender", "BirthDay", "Phone", "Email", "\n");
        for (Customer customer : customers1) {
            if (customer instanceof Customer) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((Customer) customer).getNumber(),
                        customer.getId(), customer.getName(), customer.getGender(), customer.getBirthday(), customer.getPhone(), customer.getEmail(), "\n");
            }
        }
    }

    public int findIndexById(int id) {
        if (!customers.isEmpty()) {
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getId() == id) return i;
            }
        }
        return -1;
    }

    //Sửa Khách Hàng
    public void EditCustomer() {
        List<Customer> customers1 = readDataFromFile();
        if (customers1.isEmpty()) {
            System.out.println("Customer is Empty!");
        } else {
            System.out.print("Enter ID Customer: ");
            int idCustomer = Integer.parseInt(scanner.nextLine());
            Customer customer = (Customer) creatCustomer();
            int checkID = findIndexById(idCustomer);
            if (checkID != -1) {
                customer.setId(customers1.get(checkID).getId());
                customers1.set(checkID, customer);
            } else System.out.println("Not found ID!");
        }
        writeDataToFile(customers1);
    }

    //Xoá Khách Hàng
    public void DeleteProductByID() {
        List<Customer> customers1 = readDataFromFile();
        if (customers1.isEmpty()) {
            System.out.println("Customer is Empty!");
        } else {
            System.out.print("Enter ID : ");
            int idCustomer = Integer.parseInt(scanner.nextLine());
            int checkID = findIndexById(idCustomer);
            if (checkID != -1) {
                customers1.remove(checkID);
            } else System.out.println("Not found ID!");
        }
        writeDataToFile(customers1);
    }
}
