package btl.DO;

import java.util.Scanner;

public class FoodDrink {
    public String tenFD,maFD;
    public double giaCa;
    public int solg;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma mon: ");
        maFD = sc.nextLine();
        System.out.println("Nhap ten mon: ");
        tenFD = sc.nextLine();
        System.out.println("Nhap gia ca  : ");
        giaCa = sc.nextDouble();
        System.out.println("Nhap so luong  : ");
        solg = sc.nextInt();
    }

    public FoodDrink() {
    }

    public FoodDrink(String maFD,String tenFD,  double giaCa) {
        this.maFD = maFD;
        this.tenFD = tenFD;
        this.giaCa = giaCa;
    }
    public FoodDrink( String maFD,String tenFD, double giaCa, int solg) {
        this.maFD = maFD;
        this.tenFD = tenFD;
        this.giaCa = giaCa;
        this.solg = solg;
    }
    public void xuat(){
        System.out.printf("%-20s%-20s%-20f\n", maFD, tenFD, giaCa);
    }
    public void xuatFD(){
        System.out.printf("%-10s%-20s%-20f%-20f\n", maFD, tenFD, giaCa,solg);
    }

    public String getTenFD() {
        return tenFD;
    }

    public void setTenFD(String tenFD) {
        this.tenFD = tenFD;
    }

    public String getMaFD() {
        return maFD;
    }

    public void setMaFD(String maFD) {
        this.maFD = maFD;
    }

    public int getSolg() {
        return solg;
    }

    public void setSolg(int solg) {
        this.solg = solg;
    }

    public double getGiaCa(double v) {
        return giaCa;
    }

    public void setGiaCa(double giaCa) {
        this.giaCa = giaCa;
    }

    public double getGiaCa() {
        return 0;
    }
}
