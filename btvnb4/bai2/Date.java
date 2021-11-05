package btvnb4.bai2;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Input day : ");
        day = sc.nextInt();
        System.out.println("Input month : ");
        month = sc.nextInt();
        System.out.println("Input year : ");
        year = sc.nextInt();
    }
    public void output(){
        System.out.println("Day: "+ day);
        System.out.println("Month: "+ month);
        System.out.println("Year: "+ year);
        System.out.println();
    }
}
