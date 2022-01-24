package btl.CuaHang;

import java.util.Scanner;

public class TrangTB {
    private String loaiTB;
    private int soLuong;
    private String tinhTrang;
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap loai TB : ");
        loaiTB = sc.nextLine();
        System.out.println("Nhap so luong : ");
        soLuong = sc.nextInt();
        System.out.println("Nhap tinh trang : ");
        tinhTrang = sc.nextLine();
    }
    public void xuat(){
        System.out.printf("%-20s%-10d%-20s\n", loaiTB, soLuong, tinhTrang );
    }
    public TrangTB() {
    }

    public TrangTB(String loaiTB, int soLuong, String tinhTrang) {
        this.loaiTB = loaiTB;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public String getLoaiTB() {
        return loaiTB;
    }

    public void setLoaiTB(String loaiTB) {
        this.loaiTB = loaiTB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
