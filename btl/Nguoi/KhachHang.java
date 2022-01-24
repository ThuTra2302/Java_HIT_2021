package btl.Nguoi;

import btl.Nguoi.Person;

import java.util.Scanner;

public class KhachHang {
    private String idKhach,tenKhach;
    private int soBan;
    Scanner sc = new Scanner(System.in);
    public KhachHang() {
    }
    public void InputKH(){
        System.out.println("Nhap ma khach hang  : ");
        idKhach = sc.nextLine();
        System.out.println("Nhap ten khach hang : ");
        tenKhach = sc.nextLine();
        System.out.println("Nhap ban so         : ");
        soBan = sc.nextInt();
    }

    public KhachHang(String idKhach, String tenKhach, int soBan) {
        this.idKhach = idKhach;
        this.tenKhach = tenKhach;
        this.soBan = soBan;
    }
    public void xuat(){

        System.out.printf("%-20s%-20s%-20d\n", idKhach,tenKhach, soBan);
    }
    public String getIdKhach() {
        return idKhach;
    }

    public void setIdKhach(String idKhach) {
        this.idKhach = idKhach;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

}
