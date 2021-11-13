package btvnb5.bai2;

import java.util.Scanner;

public class Date {
    private int d;
    private int m;
    private int y;
    Scanner sc = new Scanner(System.in);
    public void nhapD(){
        System.out.println("Nhap ngay  : ");
        d = sc.nextInt();
        System.out.println("Nhap thang : ");
        m = sc.nextInt();
        System.out.println("Nhap nam   : ");
        y = sc.nextInt();
    }
    public void xuatD(){
        System.out.println("Ngay : "+ d);
        System.out.println("Thang: "+ m);
        System.out.println("Nam  : "+ y);
        System.out.println();
    }
}
