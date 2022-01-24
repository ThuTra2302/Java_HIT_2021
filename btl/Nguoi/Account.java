package btl.Nguoi;

import btl.FileController.Controller;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
    private String reUserName =  " ^ [ \\ w] {6,} $ " ;
    private String rePassword =  "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&])[A-Za-z0-9@$!%*?&]{8,}$";
    private String username, password;
    Scanner sc = new Scanner(System.in);
    public Account(){
    }
    public Account(String username,String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
