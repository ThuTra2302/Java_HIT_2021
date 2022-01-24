package btl.DO;

import btl.DO.FoodDrink;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Bill {
    private String maHD,timeMuaDo;
    ArrayList<FoodDrink> listDo = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.println("Nhap ma hoa don: ");
        maHD = sc.nextLine();
        System.out.println("Nhap t: ");
        timeMuaDo = sc.nextLine();
    }
    public void xuat(){
        System.out.println("========================== BILL ============================");
        long tongTien=0;
        System.out.printf("%-20s%-20s%\n", "Ma HD", "Thoi gian mua do");
        System.out.printf("%-20s%-20s% \n", maHD, timeMuaDo);
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Mã Món", "Tên Món", "Giá Bán" , "So Luong");
        for (int i=0; i< listDo.size(); i++) {
            listDo.get(i).xuatFD();
            tongTien+=listDo.get(i).getGiaCa(sc.nextDouble())*listDo.get(i).getSolg();
        }
        System.out.println("TONG TIEN CAN THANH TOAN: "+ tongTien);
        System.out.println("========================== BILL ============================");
    }

    public Bill() {
    }

    public Bill(String maHD, String timeMuaDo, ArrayList<FoodDrink> listDo, Scanner sc) {
        this.maHD = maHD;
        this.timeMuaDo = timeMuaDo;
        this.listDo = listDo;
        this.sc = sc;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getTimeMuaDo() {
        return timeMuaDo;
    }

    public void setTimeMuaDo(String timeMuaDo) {
        this.timeMuaDo = timeMuaDo;
    }

    public ArrayList<FoodDrink> getListDo() {
        return listDo;
    }

    public void setListDo(ArrayList<FoodDrink> listDo) {
        this.listDo = listDo;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
