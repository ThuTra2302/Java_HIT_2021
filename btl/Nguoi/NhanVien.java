package btl.Nguoi;

import java.util.Scanner;

public class NhanVien extends Person {
    private String maNV;
    private String tenCV;
    private int ngayLamViec;
    private String caLam;
    Scanner sc = new Scanner(System.in);

    public NhanVien(String maNV, String tenCV, int ngayLamViec, String caLam) {
        this.maNV = maNV;
        this.tenCV = tenCV;
        this.ngayLamViec = ngayLamViec;
        this.caLam = caLam;
    }

    public NhanVien(String maNV, String name, String numberPhone, String address, int age , String tenCV, int ngayLamViec, String caLam) {
        super(name, numberPhone, address, age);
        this.maNV = maNV;
        this.tenCV = tenCV;
        this.ngayLamViec = ngayLamViec;
        this.caLam = caLam;
    }
    public String getTenCV() {
        return tenCV;
    }

    public void setTenCV(String tenCV) {
        this.tenCV = tenCV;
    }

    public String getCaLam() {
        return caLam;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
    }

    @Override
    public void nhap() {
        System.out.println("Nhap ma nhan vien  : ");
        maNV = sc.nextLine();
        super.nhap();
        sc.nextLine();
        System.out.println("Nhap ten cong viec : ");
        tenCV = sc.nextLine();
        System.out.println("Nhap so ngay lam cong viec  : ");
        ngayLamViec = sc.nextInt();
    }
    public void OutputNV(){
        System.out.printf("%-20s%-20s%-15s%-20s%-10d%-20d%-20s%-20s\n", maNV, getName(), getNumberPhone(),
                getAddress(), getAge(), getNgayLamViec(),tenCV, caLam);
    }
    public long Luong(){
        if (caLam.compareToIgnoreCase("ca sang")==0 )
            return 70000*getNgayLamViec();
        else  if (caLam.compareToIgnoreCase("ca chieu")==0 )
            return 70000*getNgayLamViec();
        else if(caLam.compareToIgnoreCase("ca toi")==0)
            return 80000*getNgayLamViec();
        else return 90000*getNgayLamViec();
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getNgayLamViec() {
        return ngayLamViec;
    }

    public void setNgayLamViec(int ngayLamViec) {
        this.ngayLamViec = ngayLamViec;
    }
}
