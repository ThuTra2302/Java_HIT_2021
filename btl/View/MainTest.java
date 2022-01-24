package btl.View;

import btl.FileController.Controller;
import btl.Nguoi.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTest {
    static ArrayList<Account> listAccount = new ArrayList<>();
    static Controller controller = new Controller();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        listAccount = controller.ReadAccountFromData("ACCOUNT.txt");
        for(int i = 0;i<listAccount.size();i++){
            System.out.println(listAccount.get(i));
        }

    }
}
