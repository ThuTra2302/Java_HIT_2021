package btvnb5.bai1;

import java.util.Scanner;

public class SanPham {
    public String maSP;
    public String tenSP;
    public String tenHangSX;
    public String ngayNhap;
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma san pham  : ");
        maSP = sc.nextLine();
        System.out.println("Nhap ten san pham : ");
        tenSP = sc.nextLine();
        System.out.println("Nhap ten hang san xuat : ");
        tenHangSX = sc.nextLine();
        System.out.println("Nhap ngay nhap : ");
        ngayNhap = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ma san pham : "+ maSP);
        System.out.println("Ten san pham : "+ tenSP);
        System.out.println("Ten hang san xuat : "+ tenHangSX);
        System.out.println("Ngay nhap: "+ ngayNhap);
    }
    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }
}
