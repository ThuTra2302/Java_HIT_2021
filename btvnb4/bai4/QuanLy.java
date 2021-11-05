package btvnb4.bai4;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma quan ly  : ");
        maQL = sc.nextLine();
        System.out.println("Nhap ho ten : ");
        hoTen = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma quan ly : "+ maQL);
        System.out.println("Ho ten : " + hoTen);
        System.out.println();
    }
}
