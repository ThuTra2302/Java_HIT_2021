package btvnb5.bai3;

import java.util.ArrayList;
import java.util.Scanner;
public class LopHoc {
    private String maLH;
    private String tenLH;
    private String ngayMo;
    private String giaoVien;
    ArrayList<SinhVien> list = new ArrayList<>();
    private int n;
    Scanner sc = new Scanner(System.in);
    public LopHoc(){

    }
    public LopHoc(String maLH, String tenLH, String ngayMo, String giaoVien, ArrayList<SinhVien> list, int n, Scanner sc) {
        this.maLH = maLH;
        this.tenLH = tenLH;
        this.ngayMo = ngayMo;
        this.giaoVien = giaoVien;
        this.list = list;
        this.n = n;
        this.sc = sc;
    }

    public String getMaLH() {
        return maLH;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }

    public ArrayList<SinhVien> getList() {
        return list;
    }

    public void setList(ArrayList<SinhVien> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
