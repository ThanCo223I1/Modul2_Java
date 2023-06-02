import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerEmployee {
    private List<Employee> employees = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public static void writeDataToFile( List<Employee> employees) {
        try {
            FileOutputStream fos = new FileOutputStream("Hhxk.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employees);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Employee> readDataFromFile(){
        List<Employee> employees = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("Hhxk.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees = (List<Employee>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return employees;
    }


    public static void writeDataToFile1( List<Product> products) {
        try {
            FileOutputStream fos = new FileOutputStream("Hhxknv.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile1(){
        List<Product> products1 = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream("Hhxk.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            products1 = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products1;
    }

    private void showAll() {
        showEmployeeFullTime();
        showEmployeePartTime();
        showProduct();
    }

    private void showEmployeeFullTime() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Full Time: ", "Number", "ID", "Name", "Age", "Phone", "Address", "Email", "WorkDay", "Day Off \n");
        for (Employee employee : employees) {
            if (employee instanceof EmployeeFullTime) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((EmployeeFullTime) employee).getNumber(), employee.getId(), employee.getName(), employee.getAge(), employee.getPhone(), employee.getAddress(), employee.getEmail(), ((EmployeeFullTime) employee).getWorkDay(), ((EmployeeFullTime) employee).getDayOff() + "\n");
            }
        }
    }

    private void showEmployeePartTime() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Part Time: ", "Number", "ID", "Name", "Age", "Phone", "Address", "Email", "WorkTime \n");
        for (Employee employee : employees) {
            if (employee instanceof EmployeePartTime) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((EmployeePartTime) employee).getNumber(), employee.getId(), employee.getName(), employee.getAge(), employee.getPhone(), employee.getAddress(), employee.getEmail(), ((EmployeePartTime) employee).getWorkTime() + "\n");
            }
        }
    }

    private void showProduct() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "Product: ", "Number", "ID", "Name", "Age", "Phone", "Address", "Email", "WorkTime \n");
        for (Product product : products) {
            if (product instanceof Product) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((Product) product).getNumber(), product.getId(), product.getNameProduct(), product.getTrademark(), product.getMaterial(), product.getPrice(), product.getSize(), ((Product) product).getQuantity() + "\n");
            }
        }
    }

    //1. Hiển Thị Nhân Viên.
    public void Display() {
        while (true) {
            System.out.println("Display: ");
            System.out.println("_________________________________");
            System.out.println("1. Show Employee Full Time: ");
            System.out.println("2. Show Employee Part Time: ");
            System.out.println("3. Show Product: ");
            System.out.println("4. Show All : ");
            System.out.println("5. Exit.");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    showEmployeeFullTime();
                    break;
                case "2":
                    showEmployeePartTime();
                    break;
                case "3":
                    showProduct();
                    break;
                case "4":
                    showAll();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Not found choice! ");
            }
        }
    }

    // 2. Thêm Nhân Viên/ Sản Phẩm
    public Employee creatEmployee() { // Tạo đối tượng chung

        System.out.println("Add Employee Full Time: ");
        System.out.println("_________________________");
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Phone: ");
        String phone = sc.nextLine();
        System.out.println("Enter Address: ");
        String address = sc.nextLine();
        System.out.println("Enter Email: ");
        String email = sc.nextLine();
        Employee.count--;
        return new Employee(name, age, phone, address, email);

    }

    public Employee creatEmployeeFullTime() { //tạo đối tượng fullTime
        Employee employee = creatEmployee();
        System.out.println("Enter Work Day: ");
        int workDay = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Day Off");
        int dayOff = Integer.parseInt(sc.nextLine());
        return new EmployeeFullTime(employee.getName(), employee.getAge(),
                employee.getPhone(), employee.getAddress(), employee.getEmail(), workDay, dayOff);

    }

    public Employee creatEmployeePartTime() { //Tạo đối tượng partTime
        Employee employee = creatEmployee();
        System.out.println("Enter Work Time");
        int workTime = Integer.parseInt(sc.nextLine());
        return new EmployeePartTime(employee.getName(), employee.getAge(),
                employee.getPhone(), employee.getAddress(), employee.getEmail(), workTime);

    }

    public Product creatproduct() { //Tạo đối tượng sản phẩm.
        System.out.println("Add Product: ");
        System.out.println("________________");
        System.out.println("Enter Name Product: ");
        String name = sc.nextLine();
        System.out.println("Enter Trademark: ");
        String trademark = sc.nextLine();
        System.out.println("Enter Material: ");
        String material = sc.nextLine();
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Size: ");
        String size = sc.nextLine();
        System.out.println("Enter Quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        Product.count--;
        Product.num--;
        return new Product(name, trademark, material, price, size, quantity);
    }

    public Product creatProduct() {
        Product product = creatproduct();
        return new Product(product.getNameProduct(), product.getTrademark(),
                product.getMaterial(), product.getPrice(), product.getSize(), product.getQuantity());
    }

    public void AddEmployee() {
        while (true) {
            System.out.println("Add Employee: ");
            System.out.println("_________________");
            System.out.println("1. Add Employee Full Time: ");
            System.out.println("2. Add Employee Part Time: ");
            System.out.println("3. Add Product: ");
            System.out.println("4. Exit.");
            System.out.println("Enter Choice");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    employees.add(creatEmployeeFullTime());
                    writeDataToFile(employees);
                    break;
                case "2":
                    employees.add(creatEmployeePartTime());
                    writeDataToFile(employees);
                    break;
                case "3":
                    products.add(creatProduct());
                    writeDataToFile1(products);
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Not found choice!");
            }




        }
    }

    //5. Điểm danh
    public void checkInEmployee() {
        System.out.println("Check In Employee: ");
        System.out.println("___________________");
        System.out.println("1. Check In Employee Full Time: ");
        System.out.println("2. Check In Employee Part Time: ");
        System.out.println("3. Check In All Employee: ");
        System.out.println("4. Exit.");
        System.out.println("Enter Choice.");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                checkInEmployeeFullTime();
                break;
            case "2":
                checkInEmployeePartTime();
                break;
            case "3":
                checkInAllEmployee();
                break;
            case "4":
                return;
            default:
                System.out.println("Not Found Choice!");
        }
    }

    public void checkInAllEmployee() {
        checkInEmployeeFullTime();
        checkInEmployeePartTime();
    }

    public void checkInEmployeeFullTime() {
        boolean check = false;
        int workDay;
        System.out.println("Enter Id Check In Full Time: ");
        int employeeId = Integer.parseInt(sc.nextLine());
        for (Employee employee : employees) {
            if (employee instanceof EmployeeFullTime) {
                if (((EmployeeFullTime) employee).getId() == employeeId) {
                    check = true;
                    workDay = ((EmployeeFullTime) employee).getWorkDay();
                    ((EmployeeFullTime) employee).setWorkDay(++workDay);
                }
            }
        }
        if (check) {
            System.out.println("Attendance marked for Employee with ID: " + employeeId);
            // cham cong duoc danh dau cho nhan vien cos id la:
        } else {
            System.out.println("Employee with ID //Nhan vien co ID: " + employeeId + " not found//Khong Tim Thay.");
        }
    }

    public void checkInEmployeePartTime() {
        boolean check = false;
        int workTime;
        System.out.println("Enter Id Check In Part Time: ");
        int employeeId = Integer.parseInt(sc.nextLine());
        for (Employee employee : employees) {
            if (employee instanceof EmployeePartTime) {
                if (((EmployeePartTime) employee).getId() == employeeId) {
                    check = true;
                    workTime = ((EmployeePartTime) employee).getWorkTime();
                    ((EmployeePartTime) employee).setWorkTime(++workTime);
                }
            }
        }
        if (check) {
            System.out.println("Attendance marked for Employee with ID: " + employeeId);
            // cham cong duoc danh dau cho nhan vien cos id la:
        } else {
            System.out.println("Employee with ID //Nhan vien co ID: " + employeeId + " not found//Khong Tim Thay.");
        }
    }

    // 6. Tính Lương
    public double salaryEmployeeFullTime() {
        double salaryFullTime = 0;
        for (Employee employee : employees) {
            if (employee instanceof EmployeeFullTime)
                salaryFullTime += ((EmployeeFullTime) employee).Salary();
        }
        System.out.println("Salary Employee Full Time: " + salaryFullTime);
        return salaryFullTime;
    }

    public double salaryEmployeePartTime() {
        double salaryPartTime = 0;
        for (Employee employee : employees) {
            if (employee instanceof EmployeePartTime)
                salaryPartTime += ((EmployeePartTime) employee).Salary();
        }
        System.out.println("Salary Employee Part Time: " + salaryPartTime);
        return salaryPartTime;
    }

    public void totalSalaryEmployee() {
        double total;
        total = salaryEmployeeFullTime() + salaryEmployeePartTime();
        System.out.println("Total Salary Employee is: " + total);
    }

    public void Salary() {
        System.out.println("Salary Employee");
        System.out.println("___________________________");
        System.out.println("1. SalaryEmployeeFullTime: ");
        System.out.println("2. SalaryEmployeePartTime: ");
        System.out.println("3. TotalSalaryEmployee: ");
        System.out.println("4. Exit.");
        System.out.println("Enter Choice.");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                salaryEmployeeFullTime();
                break;
            case "2":
                salaryEmployeePartTime();
                break;
            case "3":
                totalSalaryEmployee();
                break;
            case "4":
                return;
            default:
                System.out.println("Not Found Choice!");
        }
    }
}
