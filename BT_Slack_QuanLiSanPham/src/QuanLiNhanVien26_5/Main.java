package QuanLiNhanVien26_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("List of company personnel: ");
            System.out.println("_____________________________");
            System.out.println("1. Displays Employee: ");
            System.out.println("2. Add Employee: ");
            System.out.println("3. Checkin ID: ");
            System.out.println("4. Total Salary Of All Employees: ");
            System.out.println("5. Exit.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    managerEmployee.showEmployee();
                    break;
                case 2:
                    managerEmployee.addEmployee();
                    break;
                case 3:
                    managerEmployee.checkID();
                    break;
                case 4:
                    managerEmployee.TotalEmployee();
                    break;
                case 5:
                    System.exit(4);
                    break;
                default:
                    System.out.println("Not Found Choice!");
                    break;
            }
        }
    }
}
