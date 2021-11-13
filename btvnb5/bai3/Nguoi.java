package btvnb5.bai3;

import java.util.Scanner;

public class Nguoi {
    protected String name;
    protected String date;
    protected String hometown;
    Scanner sc = new Scanner(System.in);
    public void nhapN() {
        System.out.println("Nhap ho ten : ");
        name = sc.nextLine();
        System.out.println("Nhap ngay sinh : ");
        date = sc.nextLine();
        System.out.println("Nhap que quan : ");
        hometown = sc.nextLine();
    }
    public void xuatN() {
        System.out.println("Ho ten    : " + name);
        System.out.println("Ngay sinh : " + date);
        System.out.println("Que quan  : " + hometown);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
