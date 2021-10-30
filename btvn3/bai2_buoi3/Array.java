package bai2_buoi3;
import java.util.Scanner;
public class Array {
    private int n;
    private int[] a;
    public static Scanner sc = new Scanner(System.in);

    public Array() {
        n = 0;
        a = null;
    }

    public Array(int n,int []a){
        this.n = n;
        this.a = a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int[] getA() {

        return a;
    }
    public int getN() {

        return n;
    }
    public void setN(int n) {

        this.n = n;
    }
    public void inputData() {
        System.out.print("Nhap n: ");
        int[] a = new int[n];
        System.out.println("Nhap phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }

    public void show() {
        System.out.print("Xuat phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum;
    }
    public void filter(boolean flag) {
        if (flag) {
            System.out.println("Cac phan tu chan la : ");
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 == 0) {
                    System.out.println(a[i] + " ");
                }
            }
        }
        else {
            System.out.println("Cac phan tu le la : ");
            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    System.out.println(a[i] + " ");
                }
            }
        }
    }
}
