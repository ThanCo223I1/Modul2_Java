package Login;

import Fashion.Validate;

import java.util.Scanner;

public class Login {
    Validate validates = new Validate();
    Scanner scanner = new Scanner(System.in);

    public void Login() {
        while (true) {
            System.out.println("Enter Name: ");
            String nameLogin = scanner.nextLine();
            System.out.println("Enter Password");
            String pass = scanner.nextLine();
        }
    }
}