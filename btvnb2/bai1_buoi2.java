package btvnb2;
import java.lang.Math;
import java.util.Scanner;
public class bai1_buoi2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Max= "+ max(a,b,c));
    }
    public static int max(int a,int b,int c){
        return Math.max(Math.max(a,b), c);
    }
}
