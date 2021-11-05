package btvnb4.bai4;

import java.util.Scanner;

public class May {
    private String maM;
    private String kieuM;
    private String tinhTrang;
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma may  : ");
        maM = sc.nextLine();
        System.out.println("Nhap kieu may : ");
        kieuM = sc.nextLine();
        System.out.println("Nhap tinh trang : ");
        tinhTrang = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma may : "+ maM);
        System.out.println("Kieu may : "+kieuM);
        System.out.println("Tinh trang : "+ tinhTrang);
        System.out.println();
    }
}
