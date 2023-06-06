package Login;

import Fashion.Validate;

import java.util.Scanner;

public class Login {
    Validate validates = new Validate();
    Scanner scanner = new Scanner(System.in);

    public void Login() {
        String nameLogin;
        while (true) {
            System.out.println("Enter Name Login: ");
            String inputName = scanner.nextLine();
            if (validates.isValidateInputString(inputName, Validate.UserName_PATTERN)) {
                nameLogin = inputName;
                break;
            } else System.out.println("Not validate!");
        }
        String passLogin;
        while (true) {
            System.out.println("Enter Password : ");
            String inputPassword= scanner.nextLine();
            if (validates.isValidateInputString(inputPassword, Validate.PassWord_PATTERN)) {
                passLogin = inputPassword;
                break;
            } else System.out.println("Not validate!");
        }
    }
}
