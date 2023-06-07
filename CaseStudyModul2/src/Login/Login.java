package Login;

import Fashion.Validate;

import java.util.Scanner;

public class Login {
    private String userName;
    private String passWord;

    public Login(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public Login() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
