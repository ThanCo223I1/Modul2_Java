package Manager;

import java.util.Scanner;

public class MainProduct {
   public void ProductMain(){
        ManagerPerSon managerPerSon = new ManagerPerSon();
        ManagerProduct managerProduct = new ManagerProduct();
        ManagerOrder managerOrder = new ManagerOrder();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" |_-_-_-_-_-_-_-_- Fashion F'Mens -_-_-_-_-_-_-_-_-_|");
            System.out.println("|               1. Display List Product.           |");
            System.out.println(" |              2. Add Product.                     |");
            System.out.println("|               3. Display List Person.            |");
            System.out.println(" |              4. Add Person.                      |");
            System.out.println("|               5. Check In Person.                |");
            System.out.println(" |              6. Edit Product.                    |");
            System.out.println("|               7. Edit Person.                    |");
            System.out.println(" |              8. Delete Product.                  |");
            System.out.println("|               9. Delete Person.                  |");
            System.out.println(" |              10. Order.                          |");
            System.out.println("|               11. Salary Person.                 |");
            System.out.println(" |              12. LogOut.                         |");
            System.out.println("|__________________________________________________|");
            System.out.println("Enter Choice: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    managerProduct.DisplayProduct();
                    break;
                case "2":
                    managerProduct.AddProduct();
                    break;
                case "3":
                    managerPerSon.DisplayPerson();
                    break;
                case "4":
                    managerPerSon.AddPerson();
                    break;
                case "5":
                    managerPerSon.CheckInEmployee();
                    break;
                case "6":
                    managerProduct.EditProductById();
                    break;
                case "7":
                    managerPerSon.EditPerson();
                    break;
                case "8":
                    managerProduct.DeleteProductByID();
                    break;
                case "9":
                    managerPerSon.DeleteProductByID();
                case "10":
                    managerOrder.purchaseProduct();
                    break;
                case "11":
                    managerPerSon.Salary();
                    break;
                case "12":
                   return;
                default:
                    System.out.println("Not Found Choice!");
            }
        }
    }
}
