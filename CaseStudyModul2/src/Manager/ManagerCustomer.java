package Manager;

import Fashion.Customer;
import Fashion.Order;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ManagerCustomer {
    List<Customer> customers = new ArrayList<>();
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


}
