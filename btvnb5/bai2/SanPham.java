package btvnb5.bai2;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double soLuong;
    private double donGia;
    Scanner sc = new Scanner(System.in);
    public void nhapSP(){
        System.out.println("Nhap ma san pham  : ");
        maSP = sc.nextLine();
        System.out.println("Nhap ten san pham : ");
        tenSP = sc.nextLine();
        System.out.println("Nhap so luong : ");
        soLuong = sc.nextDouble();
        System.out.println("Nhap don gia : ");
        donGia = sc.nextDouble();
    }
    public void xuatSP(){
        System.out.println("Ma san pham : "+ maSP);
        System.out.println("Ten san pham : "+ tenSP);
        System.out.println("So luong : "+ soLuong);
        System.out.println("Ngay nhap: "+ donGia);
        System.out.println("Thanh tien " + donGia* soLuong);
        System.out.println();
    }
}
