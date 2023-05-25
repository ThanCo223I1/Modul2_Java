package vaccine;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class QuanLiCustomer {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Customer> customers = new ArrayList<>();

    public void hienThi() {
        for (Customer cs : customers) {
            System.out.println(cs);
        }
    }

    public void themCustomer() {
        Customer customer = taoDoiTuong();
        customers.add(customer);
    }

    public Customer taoDoiTuong() {
        System.out.println("Danh Sách Khách Hàng: ");
        System.out.println("_________________________");
        System.out.println("Nhập Tên Khách Hàng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Số Điện Thoại: ");
        String phone = scanner.nextLine();
        return new Customer(name, phone);
    }

    public int checkName(String name) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getNameCustomer().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Vaccine taoVacccine() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Chọn Vaccine Tiêm Chủng: ");
        System.out.println("____________________________");
        System.out.println("Nhập Tên Vaccin: ");
        String name = scanner.nextLine();
        System.out.println("Ngày Sản Xuất Vaccin: ");
        Date date1;
        while (true) {
            try {
                String inputDate = scanner.nextLine();
                date1 = dateFormat.parse(inputDate);
                break;
            } catch (Exception e) {
                System.out.println("Sai Định Dạng Ngày");
            }
        }
        System.out.println("Giá Vaccine: ");
        double price = Float.parseFloat(scanner.nextLine());
        System.out.println("Ngày Tiêm Vaccine: ");
        Date date2;
        while (true) {
            try {
                String inputDate = scanner.nextLine();
                date2 = dateFormat.parse(inputDate);
                break;
            } catch (Exception e) {
                System.out.println("Sai Định Dạng Ngày");
            }
        }
        return new Vaccine(name, date1, price, date2);
    }

    public void tiemVaccine () {
        System.out.print("Nhập Tên Khách Hàng Cần Tiêm : ");
        String tenCanTiem = scanner.nextLine();
        int index = checkName(tenCanTiem);
        if (index != -1) {
            Vaccine vaccine = taoVacccine();
            customers.get(index).addVaccine(vaccine);
        }
    }
}

