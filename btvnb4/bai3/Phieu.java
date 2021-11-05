package btvnb4.bai3;

import btvnb4.bai1.Sach1;

import java.util.Scanner;

public class Phieu {
    private String idP;
    private Hang []a;
    private int n;
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Input id card : ");
        idP = sc.nextLine();
        System.out.println("Input n : ");
        n = sc.nextInt();
        a = new Hang[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Hang();
            System.out.println("Input hang thu : " + (i + 1));
            a[i].input();
        }
    }
    public void output() {
        System.out.println("Id card : "+ idP);
        float sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Hang thu : " + (i + 1));
            a[i].output();
        }
        for (int i = 0; i < n; i++) {
            sum += a[i].getCost();
        }
        System.out.println("Total money : "+ sum);
    }
}
