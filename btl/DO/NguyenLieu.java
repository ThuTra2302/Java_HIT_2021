package btl.DO;


import java.util.Scanner;

public class NguyenLieu {
   protected double cost ;
   protected int number;
   public String maNL,nameNL;
   Scanner sc = new Scanner(System.in);
   public void nhap(){
      System.out.println("Nhap ma nguyen lieu: ");
      maNL = sc.nextLine();
      System.out.println("Nhap ten nguyen lieu: ");
      nameNL = sc.nextLine();
      System.out.println("Nhap gia tien : ");
      cost = sc.nextDouble();
      System.out.println("Nhap so luong : ");
      number = sc.nextInt();
   }
   public NguyenLieu(){
   }

   public NguyenLieu( String maNL, String nameNL,double cost, int number) {
      this.maNL = maNL;
      this.nameNL = nameNL;
      this.cost = cost;
      this.number = number;
   }

   public void xuat(){
      System.out.printf("%-20s%-20s%-20f%-20d\n", maNL, nameNL,cost,  number);

   }

   public double getCost() {
      return cost;
   }

   public void setCost(double cost) {
      this.cost = cost;
   }

   public int getNumber() {
      return number;
   }

   public void setNumber(int number) {
      this.number = number;
   }

   public String getMaNL() {
      return maNL;
   }

   public void setMaNL(String maNL) {
      this.maNL = maNL;
   }
   public NguyenLieu(String data, String s, int i, double v) {
   }
   public String getNameNL() {
      return nameNL;
   }

   public void setNameNL(String nameNL) {
      this.nameNL = nameNL;
   }

   public Scanner getSc() {
      return sc;
   }

   public void setSc(Scanner sc) {
      this.sc = sc;
   }

}
