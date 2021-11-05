package btvnb4.bai4;

import java.util.Scanner;

public class PhongMay {
    private String maP;
    private String tenP;
    private float dienTich;
    private QuanLy x;
    private May []y;
    private int n;
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Nhap ma phong : ");
        maP = sc.nextLine();
        System.out.println("Nhap ten phong : ");
        tenP = sc.nextLine();
        System.out.println("Nhap dien tich : ");
        dienTich = sc.nextFloat();
        x = new QuanLy();
        x.nhap();
        System.out.println("Nhap n : ");
        n = sc.nextInt();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            y[i] = new May();
            System.out.println("Nhap may thu : " + (i + 1));
            y[i].nhap();
        }
    }
    public void output(){
        System.out.println("Ma phong : "+ maP);
        System.out.println("Ten phong : "+ tenP);
        System.out.println("Dien tich : "+ dienTich);
        x.xuat();
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin may thu : " + (i + 1));
            y[i].xuat();
        }
    }
}
