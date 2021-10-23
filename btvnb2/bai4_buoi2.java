package btvnb2;
import java.util.Scanner;
public class bai4_buoi2 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi bat ki: ");
        str = sc.nextLine();
        str = str.trim().toLowerCase();
        str = str.replaceAll(" +", " ");
        System.out.println("Chuan 1+2 la: "+ str);
        str = str.replaceAll("[0-9]","");
        System.out.println("Chuan 3 la: "+ str);
        char[] a = str.toLowerCase().toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        for(int i = 0;i< a.length;i++)
            if (!Character.isLetter(a[i]))
                    a[i+1] = Character.toUpperCase(a[i+1]);
        str = String.valueOf(a);
        System.out.println("Chuoi 4 la: " + str);
    }
}
