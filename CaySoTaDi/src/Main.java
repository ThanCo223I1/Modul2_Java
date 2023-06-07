import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerEmployee managerEmployee = new ManagerEmployee();
        ManagerProduct managerProduct = new ManagerProduct();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Manager Admin: ");
            System.out.println("________________");
            System.out.println("1. Display Employee.");
            System.out.println("2. Display Product.");
            System.out.println("3. Add Employee.");
            System.out.println("4. Add Product.");
            System.out.println("5. Edit.");
            System.out.println("6. Delete.");
            System.out.println("7. Check In.");
            System.out.println("8. Total Salary.");
            System.out.println("9. Exit.");
            System.out.println("Enter Choice");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    managerEmployee.Display();
                    break;
                case "2":
                    managerProduct.showProduct();
                    break;
                case "3":
                    managerEmployee.AddEmployee();
                    break;
                case "4":
                    managerProduct.AddProduct();
                    break;
                case "5":
                    break;
                case "6":

                case "7":
                    managerEmployee.checkInEmployee();
                    break;
                case "8":
                    managerEmployee.Salary();
                    break;
                case "9":
                    System.exit(7);
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }
}
