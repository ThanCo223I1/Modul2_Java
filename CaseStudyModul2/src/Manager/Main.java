package Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerPerSon managerPerSon = new ManagerPerSon();
        ManagerProduct managerProduct = new ManagerProduct();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("----------------- Fashion Shopping F'Mens -------------------");
            System.out.println("1. Display List Product.");
            System.out.println("2. Display List Person.");
            System.out.println("3. Add Product.");
            System.out.println("4. Add Person.");
            System.out.println("5. Edit Product.");
            System.out.println("6. Edit Person.");
            System.out.println("7. Delete Product.");
            System.out.println("8. Delete Person.");
            System.out.println("9. Order.");
            System.out.println("10. Exit.");
            System.out.println("Enter Choice.");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    managerProduct.showProduct();
                case "2":
                    managerPerSon.Display();
                    break;
                case "3":
                    managerProduct.AddProduct();
                    break;
                case "4":
                    managerPerSon.AddPerson();
                    break;
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "10":
            }
        }
    }
}
