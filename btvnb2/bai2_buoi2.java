package btvnb2;
import java.util.Scanner;
public class bai2_buoi2 {
    static Scanner sc = new Scanner(System.in);
    static int []a = new int[1000];
    static int n = 0;
        //select 1
    public static void nhapM(){
        System.out.print("Nhap n= ");
        n = sc.nextInt();
        System.out.print("Nhap cac phan tu trong mang: \n");
        for(int i = 0;i<n;i++){
            System.out.print("a["+ i + "]= ");
            a[i] = sc.nextInt();
        }
    }
    //select 2
    public static void xuatM(){
        System.out.print("Cac phan tu trong mang: ");
        for(int i = 0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
    //select 3
    public static void them1PT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri chen: ");
        int k = sc.nextInt();
        if(k>=0 && k <= n){
            System.out.print("Nhap phan tu can chen: " );
            int x = sc.nextInt();
            for(int i = n;i>k;i--)
                a[i] = a[i-1];
            a[k]= x;
            n++;
            xuatM();
        }
        else{
            System.out.println("Khong co vi tri hop le.");
        }
    }
    //select4
    public static void xoa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vi tri can xoa: ");
        int k = sc.nextInt();
        for(int i = 0;i<n;i++)
            a[k]= a[k +1];
        n--;
        xuatM();
    }
    //select 5
    public static void daoNguoc(){
        System.out.print("Mang khi dao nguoc: ");
        for(int i = n-1;i>=0;i--)
            System.out.print(a[i]+" ");
    }
    //select 6
    public static void soChiaHet(){
        System.out.println("Phan tu a[1]= "+ a[1]);
        System.out.println("Cac phan tu chia het cho a[1] la: ");
        int dem = 0;
        for(int i =0;i<n;i++){
            if(a[i]%a[1]== 0 && i != 1){
                dem++;
                System.out.println(" "+a[i]);
            }
        }
        if(dem == 0){
            System.out.println("Khong co so chia het cho a[1] trong mang");
        }
    }
    //select 7
    public static boolean check(int n){
        if(n<2) return true;
        for(int i = 2;i* i<=n;i++) {
            if (n % i == 0)
                return true;
        }
        return false;
    }
    public static void tongSNT(){
        int sum = 0;
        for(int i = 0;i<n;i++)
            if(!check(a[i]))
                sum += a[i];
        System.out.println("Tong cac so nguyen to "+ sum);
    }
    public static void main(String[] args){
        int chon;
        System.out.println("------------MENU------------");
        System.out.println("1.Nhap mang voi n so nguyen");
        System.out.println("2.Hien thi mang vua tao ");
        System.out.println("3.Them 1 phan tu vao vi tri k bat ky");
        System.out.println("4.Xoa phan tu tai vi tri k bat ky");
        System.out.println("5.Hien thi mang dao nguoc");
        System.out.println("6.Hien thi phan tu a[1] va cac so chia het cho a[1]");
        System.out.println("7.Xuat ra màn hinh tong cac so nguyen to co trong mang");
        System.out.println("8.Thoat chuong trinh");
        do {
            System.out.print("\tMoi ban chon chuc nang: ");
            chon= sc.nextInt();
            switch (chon) {
                case 1:
                    nhapM();
                    break;
                case 2:
                    xuatM();
                    break;
                case 3:
                    them1PT();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    daoNguoc();
                    break;
                case 6:
                    soChiaHet();
                    break;
                case 7:
                     tongSNT();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Yeu cau chon lai");
            }
        }while(chon !=0);
    }
}
