package btvnb5.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n : " );
        n = sc.nextInt();
        ArrayList<DieuHoa> list = new ArrayList<>();
        for (int i = 0;i<n;i++){
            System.out.println("Nhap may thu : " + (i + 1));
            DieuHoa a = new DieuHoa();
            a.nhapD();

            list.add(a);
        }
        System.out.println("---------Hien thi danh sach cac dieu hoa Electrolux----------");
        int d = 0;

        double min = list.get(0).getGiaBan();
        for(int i = 0;i<n;i++){
            if(min > list.get(i).getGiaBan()){
                min = list.get(i).getGiaBan();
            }
        }
        for(int i = 0;i<n;i++){
            if(list.get(i).getTenHangSX().compareToIgnoreCase("Electrolux")== 0 &&list.get(i).getGiaBan() == min){
                list.get(i).xuatD();
                d++;
            }
        }
        if(d == 0) {
            System.out.println("San pham khong ton tai");
        }
    }
}
