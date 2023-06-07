package Login;

import Fashion.Validate;
import Manager.MainProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerLogin {
    MainProduct mainProduct = new MainProduct();
    Scanner scanner = new Scanner(System.in);
    Login login = new Login();
    List<Login> logins = new ArrayList<>();

    public void addLogin() {
        login = new Login("than123", "123");
        logins.add(login);
    }

    public void checkLogin() {
        addLogin();
        System.out.println("Enter Username: ");
        String userName = scanner.nextLine();
        for (Login login1 : logins) {
            if (userName.equals(login1.getUserName())) {
                System.out.println("Enter PassWord: ");
                String passWord = scanner.nextLine();
                if (passWord.equals(login1.getPassWord())) {
                    System.out.println("Login Success");
                    mainProduct.ProductMain();
                    break;
                } else {
                    System.out.println("Wrong password");
                }
            } else {
                System.out.println("Wrong UserName!");
            }
        }
    }
}


