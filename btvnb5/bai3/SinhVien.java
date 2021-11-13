package btvnb5.bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi {
    private String maSV;
    private String nganh;
    private int khoa;

    public SinhVien() {

    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    public void nhapSV() {
        super.nhapN();
        System.out.println("Nhap ma sinh vien: ");
        setMaSV(sc.nextLine());
        System.out.println("Nhap nganh hoc   : ");
        setNganh(sc.nextLine());
        System.out.println("Nhap khoa hoc    : ");
        setKhoa(sc.nextInt());
        sc.nextLine();
    }
    public void xuatSV() {
        super.xuatN();
        System.out.println("Ma sinh vien    : " + getMaSV());
        System.out.println("Nganh : " + getNganh());
        System.out.println("Khoa hoc : " + getKhoa());
    }
}
