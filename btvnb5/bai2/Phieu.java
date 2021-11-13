package btvnb5.bai2;

import btvnb4.bai4.May;
import btvnb5.bai1.DieuHoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maP;
    private String tenP;
    private Date a;
    ArrayList<SanPham> list = new ArrayList<>();
    private int n;

    Scanner sc = new Scanner(System.in);
    public void nhapP(){
        System.out.println("Nhap ma phieu : ");
        maP = sc.nextLine();
        System.out.println("Nhap ten phieu: ");
        tenP = sc.nextLine();
        a = new Date();
        a.nhapD();
        System.out.println("Nhap n : ");
        n = sc.nextInt();
        for (int i = 0;i<n;i++){
            System.out.println("Nhap san pham thu : " + (i + 1));
            SanPham x = new SanPham();
            x.nhapSP();
            list.add(x);
        }
    }
    public void xuatP(){
        System.out.println("Ma phieu : " + maP);
        System.out.println("Ten phieu: "+ tenP);
        a.xuatD();
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin san pham thu : " + (i + 1));
            list.get(i).xuatSP();
        }
    }
}
