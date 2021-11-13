package btvnb5.bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham{
    public double congSuat;
    public double giaBan;
    Scanner sc = new Scanner(System.in);
    public void nhapD(){
        super.nhap();
        System.out.println("Nhap cong suat  : ");
        congSuat = sc.nextDouble();
        System.out.println("Nhap gia ban    : ");
        giaBan = sc.nextDouble();
    }
    public void xuatD(){
        super.xuat();
        System.out.println("Cong suat : "+ congSuat);
        System.out.println("Gia ban : "+ giaBan);
    }
    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }
}
