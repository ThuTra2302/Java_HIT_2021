package btvnb4.bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        Sach1 []a = new Sach1[n];
        for(int i = 0;i<n;i++){
            a[i] = new Sach1();
            System.out.println("Nhap sach vao thu : "+ (i +1));
            a[i].input();
        }
        System.out.println("-------------Thong tin sach-------------");
        for(int i = 0;i<n;i++){
            System.out.println("Sach thu : "+ (i +1));
            a[i].output();
        }
    }
}
