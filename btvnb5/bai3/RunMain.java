package btvnb5.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        LopHoc a = new LopHoc();
        Scanner sc = new Scanner(System.in);
//        ArrayList<SinhVien> list = new ArrayList<>();
        System.out.println("Nhap ma lop hoc : ");
        a.setMaLH(sc.nextLine());
        System.out.println("Nhap ten lop hoc: ");
        a.setTenLH(sc.nextLine());
        System.out.println("Nhap ngay mo    : ");
        a.setNgayMo(sc.nextLine());
        System.out.println("Nhap giao vien  : ");
        a.setGiaoVien(sc.nextLine());
        System.out.println("Nhap n : ");
        a.setN(sc.nextInt());
        for (int i = 0; i < a.getN(); i++) {
            SinhVien x = new SinhVien();
            System.out.println("Nhap sinh vien thu : " + (i + 1));
            x.nhapSV();
            a.getList().add(x);
        }
        int d = 0;
        for (int i = 0; i < a.getN(); i++) {
            if (a.getList().get(i).getKhoa() == 15) {
                d++;
            }
        }
        if (d == 0) {
            System.out.println("Khong co sinh vien khoa 15");
        } else {
            System.out.println("Co " + d + "sinh vien khoa 15");
        }

        //bây giờ học arrayList rôi, mình sẽ k sắp xếp thế này nữa
//        for(int i =0;i<a.getN()-1;i++){
//            for(int j = i+1;j<a.getN();j++){
//                if(a.getList().get(i).getKhoa()>a.getList().get(j).getKhoa()){
//                    SinhVien temp = a.getList().get(i);
//                    a.getList().set(i,a.getList().get(j));
//                    a.getList().set(j,temp);
//                }
//            }
//        }

        // đây là cách sắp xếp, cái này a giải thích sơ qua nè
        // sort là phương thức có sẵn của Collections, ArrayList nó extend từ Collections
        // muốn sắp xếp 1 cái arraylist thì mk đem thằng sort của cha nó ra áp dụng thôi
        // ấn Ctrl r click vào cái Object Collections đó thì e có thể vào đó xem code, các hàm có sẵn của Object đó
        // bên trong phương thức sort thì nó có 1 hàm compare, hàm này nếu
        // return 0 thì nó sẽ k sắp xếp
        // return 1 hoặc số dương thì nó sẽ sắp xếp tăng. return -1 hoặc số âm thì sẽ ngược lại
        // o1 và o2 là 2 phần tử liên tiếp của array list đang duyệt để đổi vị trí,
        // phần return a lấy 2 cái khoa trừ đi nhau, vậy nếu khoa trước trừ khoa sau mà dương. tức là khoa trước lớn hơn khoa sau
        // thì nó sẽ sắp xếp  tăng,
        // ở cái a vừa nhập, cái đầu tiên khoa = 88, cái thứ 2 = 2
        
        Collections.sort(a.getList(), new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getKhoa()-o2.getKhoa();
            }
        });

        System.out.println("Danh sach khi sap xep ");
        xuat(a);
    }
    public static void xuat(LopHoc a){
        System.out.println("Ma lop hoc : " + a.getMaLH());
        System.out.println("Ten lop hoc: "+ a.getTenLH());
        System.out.println("Ma ngay mo : " + a.getNgayMo());
        System.out.println("Giao vien  : "+ a.getGiaoVien());
        for (int i = 0; i < a.getN(); i++) {
            System.out.println("Thong tin sinh vien thu : " + (i + 1));
            a.getList().get(i).xuatSV();
        }
    }

}
