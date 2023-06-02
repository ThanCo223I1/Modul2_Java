import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Manager Admin: ");
            System.out.println("________________");
            System.out.println("1. Display.");
            System.out.println("2. Add Employee.");
            System.out.println("3. Edit.");
            System.out.println("4. Delete.");
            System.out.println("5. Check In.");
            System.out.println("6. Total Salary.");
            System.out.println("7. Exit.");
            System.out.println("Enter Choice");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    managerEmployee.Display();
                    break;
                case "2":
                    managerEmployee.AddEmployee();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    managerEmployee.checkInEmployee();
                    break;
                case "6":
                    managerEmployee.Salary();
                    break;
                case "7":
                    System.exit(7);
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }
}
