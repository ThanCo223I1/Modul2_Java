package QuanLiNhanVien26_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ManagerEmployee {
    static File file = new File("Qlnv.txt");

    static {
        try {
            if (!file.exists()) file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void WriteFile(Employee el) {
        try (FileWriter fileWriter = new FileWriter("Qlnv.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(String.valueOf(el + "\n"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void ReaderFile() {
        try (FileReader fileReader = new FileReader("Qlnv.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    Scanner sc = new Scanner(System.in);
    private ArrayList<Employee> employees = new ArrayList<>();

    private void showAllEmployee() { // hien thi tat ca danh sach nhan vien
        showAdministrativeEmployee();
        showTechNiCalEmployee();
        showSalesEmployee();
    }

    public void showEmployee() {
        while (true) {
            System.out.println("Show Employee: ");
            System.out.println("_________________________________");
            System.out.println("1. Show Administrative Employee: ");
            System.out.println("2. Show TechNiCal Employee: ");
            System.out.println("3. Show Sales Employee: ");
            System.out.println("4. Show All Employee: ");
            System.out.println("5. Exit.");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    showAdministrativeEmployee();
                    break;
                case "2":
                    showTechNiCalEmployee();
                    break;
                case "3":
                    showSalesEmployee();
                    break;
                case "4":
                    showAllEmployee();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Not found choice! ");
            }
        }
    }

    private void showAdministrativeEmployee() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%s", "Admin:", "ID", "Name", "Age", "Salary", "Days", "DaysOff \n");
        for (Employee employee : employees) {
            if (employee instanceof AdministrativeEmployee) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((AdministrativeEmployee) employee).getId(), employee.getName(), employee.getAge(), employee.getSalary(), employee.getDate(), ((AdministrativeEmployee) employee).getDaysoff() + "\n");
            }
            System.out.println();
        }
    }

    private void showTechNiCalEmployee() {
        System.out.printf("%-15s%-15s%-15s%-15s%-12s%-15s%s", "TechNiCal:", "ID", "Name", "Age", "Salary", "Days", "Project\n");
        for (Employee employee : employees) {
            if (employee instanceof TechnicalEmployee) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((TechnicalEmployee) employee).getId(), employee.getName(), employee.getAge(), employee.getSalary(), employee.getDate(), ((TechnicalEmployee) employee).getProjects() + "\n");
            }
            System.out.println();
        }
    }

    private void showSalesEmployee() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%s", "Sales:", "ID", "Name", "Age", "Salary", "Days", "Sales\n");
        for (Employee employee : employees) {
            if (employee instanceof SalesEmployee) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%s", "", ((SalesEmployee) employee).getId(), employee.getName(), employee.getAge(), employee.getSalary(), employee.getDate(), ((SalesEmployee) employee).getSales() + "\n");
            }
            System.out.println();
        }
    }

    private void creatAdministrativeEmployee() {
        while (true) {
            try {
                System.out.println("Add AdministrativeEmployee: ");
                System.out.println("_______________________________");
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Salary: ");
                double salary = Double.parseDouble(sc.nextLine());
                System.out.println("Enter Days: ");
                int days = Integer.parseInt(sc.nextLine());
                System.out.println("DayOff: ");
                int dayOff = Integer.parseInt(sc.nextLine());
                AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee(name, age, salary, days, dayOff);
                employees.add(administrativeEmployee);
                WriteFile(administrativeEmployee);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    private void creatTechNiCalEmployee() {
        while (true) {
            try {
                System.out.println("Add TechNiCalEmployee : ");
                System.out.println("_________________________");
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                System.out.println("Enter Age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Salary: ");
                double salary = Double.parseDouble(sc.nextLine());
                System.out.println("Enter Days: ");
                int days = Integer.parseInt(sc.nextLine());
                System.out.println("Enter Projects: ");
                int projects = Integer.parseInt(sc.nextLine());
                TechnicalEmployee technicalEmployee = new TechnicalEmployee(name, age, salary, days, projects);
                employees.add(technicalEmployee);
                WriteFile(technicalEmployee);
                break;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void creatSalesEmployee() {

        System.out.println("Add SalesEmployee : ");
        System.out.println("_____________________");
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println("Enter Days: ");
        int days = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Sales: ");
        int sales = Integer.parseInt(sc.nextLine());
        SalesEmployee salesEmployee = new SalesEmployee(name, age, salary, days, sales);
        employees.add(salesEmployee);
        WriteFile(salesEmployee);
    }

    public void addEmployee() {
        while (true) {
            System.out.println("Add To Staff List: ");
            System.out.println("________________________________");
            System.out.println("1. Add AdministrativeEmployee.");
            System.out.println("2. Add TechnicalEmployee.");
            System.out.println("3. Add SalesEmployee");
            System.out.println("4. Exit.");
            System.out.println("Enter Choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    creatAdministrativeEmployee();
                    break;
                case "2":
                    creatTechNiCalEmployee();
                    break;
                case "3":
                    creatSalesEmployee();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Not found choice");
            }
        }
    }

    // Tinh Tong Luong Tat Ca Nhan Vien.
    public void TotalEmployee() {
        System.out.println("Total Salary: ");
        System.out.println("___________________");
        System.out.println("1. Total Salary of AdminEmployee.");
        System.out.println("2. Total Salary of TechEmployee.");
        System.out.println("3. Total Salary of SalesEmployee.");
        System.out.println("4. Total Salary All Employee.");
        System.out.println("5. Exit.");
        System.out.println("Enter choice.");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                salaryAdmin();
                break;
            case "2":
                salaryTech();
                break;
            case "3":
                salarySales();
                break;
            case "4":
                calculateTotalSalary();
                break;
            case "5":
                return;
            default:
                System.out.println("Not found choice!");
        }
    }

    public void calculateTotalSalary() {
        double total;
        total = (salaryAdmin() + salaryTech() + salarySales());
        System.out.println("Total of Employee: " + total);
    }

    // Tinh luong cua Admin.
    public double salaryAdmin() {
        double TotalSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof AdministrativeEmployee)
                TotalSalary += ((AdministrativeEmployee) employee).calculateMonthlySalary();
        }
        System.out.println("Salary Employee Admin: " + TotalSalary);
        return TotalSalary;
    }

    // Tinh luong cua Tech.
    public double salaryTech() {
        double TotalSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof TechnicalEmployee)
                TotalSalary += ((TechnicalEmployee) employee).calculateMonthlySalary();
        }
        System.out.println("Salary Employee Tech: " + TotalSalary);
        return TotalSalary;
    }

    //Tinh luong cua Sales.
    public double salarySales() {
        double TotalSalary = 0;
        for (Employee employee : employees) {
            if (employee instanceof SalesEmployee)
                TotalSalary += ((SalesEmployee) employee).calculateMonthlySalary();
        }
        System.out.println("Salary Employee Sale: " + TotalSalary);
        return TotalSalary;
    }

    // Diem Danh Nhan Vien.
    public void checkID() {
        System.out.println("CheckIn: ");
        System.out.println("_________________");
        System.out.println("1. CheckIn Admin.");
        System.out.println("2. CheckIn Tech.");
        System.out.println("3. CheckSale.");
        System.out.println("4. Exit.");
        System.out.println("Enter choice.");
        String choice = sc.nextLine();
        switch (choice) {
            case "1":
                checkIDAdmin();
                break;
            case "2":
                checkIntech();
                break;
            case "3":
                checkInSales();
                break;
            case "4":
                return;
            default:
                System.out.println("Not found choice");
        }
    }

    public void checkIDAdmin() {
        boolean b = false;
        int day;
        System.out.println("Enter Id Check In: ");
        int employeeId = Integer.parseInt(sc.nextLine());
        for (Employee employee : employees) {
            if (employee instanceof AdministrativeEmployee) {

                if (((AdministrativeEmployee) employee).getId() == employeeId) {
                    b = true;
                    day = employee.getDate();
                    employee.setDate(++day);
                }
            }
        }
        if (b) {
            System.out.println("Attendance marked for Employee with ID: " + employeeId);
            // cham cong duoc danh dau cho nhan vien cos id la:
        } else {
            System.out.println("Employee with ID //Nhan vien co ID: " + employeeId + " not found//Khong Tim Thay.");
        }
    }

    public void checkIntech() {
        boolean b = false;
        int day;
        System.out.println("Enter Id Check In");
        int employeeId = Integer.parseInt(sc.nextLine());
        for (Employee employee : employees) {
            if (employee instanceof TechnicalEmployee) {
                if (((TechnicalEmployee) employee).getId() == employeeId) {
                    b = true;
                    day = employee.getDate();
                    employee.setDate(++day);
                }
            }
        }
        if (b) {
            System.out.println("Attendance marked for Employee with ID: " + employeeId);
            // cham cong duoc danh dau cho nhan vien cos id la:
        } else {
            System.out.println("Employee with ID //Nhan vien co ID: " + employeeId + " not found//Khong Tim Thay.");
        }
    }

    public void checkInSales() {

        boolean b = false;
        int day;
        System.out.println("Enter Id Check In");
        int employeeId = Integer.parseInt(sc.nextLine());
        for (Employee employee : employees) {
            if (employee instanceof SalesEmployee) {

                if (((SalesEmployee) employee).getId() == employeeId) {
                    b = true;
                    day = employee.getDate();
                    employee.setDate(++day);
                }
            }
        }
        if (b) {
            System.out.println("Attendance marked for Employee with ID: " + employeeId);
            // cham cong duoc danh dau cho nhan vien cos id la:
        } else {
            System.out.println("Employee with ID //Nhan vien co ID: " + employeeId + " not found//Khong Tim Thay.");
        }
    }
}