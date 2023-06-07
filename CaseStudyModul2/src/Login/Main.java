package Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerLogin managerLogin = new ManagerLogin();
        while (true){
            try {
                while (true){
                    System.out.println("-----LOGIN-----");
                    System.out.println("|   1. Login    |");
                    System.out.println("|   2. Exit.    |");
                    System.out.println("|  Enter Choice.|");
                    System.out.println("-----------------");;
                    String choice = scanner.nextLine();
                    switch (choice){
                        case "1":
                            managerLogin.checkLogin();
                            break;
                        case "2":
                            System.exit(2);
                        default:
                            System.out.println("Not found Choice!");
                    }
                }

            }catch (Exception e){
                System.err.println("Enter number");
            }
        }
    }
}
