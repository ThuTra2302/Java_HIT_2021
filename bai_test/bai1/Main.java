package bai_test.bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi bat ki: ");
        str = sc.nextLine();
        int dem = 0;
        int sum = 0;
        for(int i = 0;i<str.length();i++)
            if(str.charAt(i) >= '0' && str.charAt(i)<='9'){
                dem ++;
                sum +=(str.charAt(i) - '0');
            }
        if(dem!= 0){
            System.out.println("Co " +dem+ "ky tu so");
        }
        else{
            System.out.println("Khong co ky tu so ");
        }

    }
}
