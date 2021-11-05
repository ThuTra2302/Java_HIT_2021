package btvnb4.bai1;
import java.util.Scanner;

public class Sach1 {
    private String maSach;
    private String tenSach;
    private String nxb;
    private int soTrang;
    private float gia;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap ma sach  : ");
        maSach = sc.nextLine();
        System.out.println("Nhap ten sach : ");
        tenSach = sc.nextLine();
        System.out.println("Nhap nha xuat ban : ");
        nxb = sc.nextLine();
        System.out.println("Nhap so trang : ");
        soTrang = sc.nextInt();
        System.out.println("Nhap gia tien : ");
        gia = sc.nextFloat();
    }
    public void output(){
        System.out.println("Ma sach : " + maSach);
        System.out.println("Ten sach : " + tenSach);
        System.out.println("Nha xuat ban : " + nxb);
        System.out.println("So trang : " + soTrang);
        System.out.println("Gia tien : " + gia);
        System.out.println();
    }
}
