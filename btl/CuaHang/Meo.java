package btl.CuaHang;

import btl.DO.FoodDrink;

import java.util.Scanner;

public class Meo {
    private String maM,tenM, giongM,tinhTrang;
    private FoodDrink doAnMeo;
    private int slg;
    Scanner sc = new Scanner(System.in);
    public void nhapM(){
        System.out.println("Nhap ten meo: ");
        maM = sc.nextLine();
        System.out.println("Nhap ten meo: ");
        tenM = sc.nextLine();
        System.out.println("Nhap giong meo   : ");
        giongM = sc.nextLine();
        System.out.println("Nhap tinh trang   : ");
        tinhTrang = sc.nextLine();
        System.out.println("Nhap so luong  : ");
        slg = sc.nextInt();
        doAnMeo.xuat();
    }

    @Override
    public String toString() {
        return "Meo{" +
                "maM='" + maM + '\'' +
                ", tenM='" + tenM + '\'' +
                ", giongM='" + giongM + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                ", doAnMeo=" + doAnMeo +
                ", slg=" + slg +
                ", sc=" + sc +
                '}';
    }

    public Meo() {
    }

    public Meo(String maM, String tenM, String giongM, String tinhTrang, int slg, Scanner sc) {
        this.maM = maM;
        this.tenM = tenM;
        this.giongM = giongM;
        this.tinhTrang = tinhTrang;
        this.slg = slg;
        this.sc = sc;
    }

    public String getMaM() {
        return maM;
    }

    public void setMaM(String maM) {
        this.maM = maM;
    }

    public String getTenM() {
        return tenM;
    }

    public void setTenM(String tenM) {
        this.tenM = tenM;
    }

    public String getGiongM() {
        return giongM;
    }

    public void setGiongM(String giongM) {
        this.giongM = giongM;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSlg() {
        return slg;
    }

    public void setSlg(int slg) {
        this.slg = slg;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
