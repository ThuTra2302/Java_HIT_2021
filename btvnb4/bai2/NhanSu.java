package btvnb4.bai2;

import java.util.Scanner;

public class NhanSu {
    private String idNS;
    private String name;
    private Date NS;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Input id NS : ");
        idNS = sc.nextLine();
        System.out.println("Input name : ");
        name = sc.nextLine();
        System.out.println("Input date : ");
        NS = new Date();
        NS.input();
    }
    public void output(){
        System.out.println("Id NS : "+ idNS);
        System.out.println("Name : "+name);
        System.out.println("Date : ");
        NS.output();
    }
}
