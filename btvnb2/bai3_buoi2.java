package btvnb2;

import java.util.Scanner;

public class bai3_buoi2 {
    public static void main(String[] args){
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
            System.out.println("true");
            System.out.print("Trung binh cong la: "+ (double)sum / dem);
        }
        else{
            System.out.println("false");
            System.out.println("Trung binh cong = 0");
        }
    }
}
