package btvnb4.bai3;

import java.util.Scanner;

public class Hang {
    private String idH;
    private String nameH;
    private float cost;
    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Input id Hang : ");
        idH = sc.nextLine();
        System.out.println("Input name Hang : ");
        nameH = sc.nextLine();
        System.out.println("Input cost : ");
        cost = sc.nextFloat();
    }
    public void output(){
        System.out.println("Id hang : "+ idH);
        System.out.println("Name hang : "+nameH);
        System.out.println("Cost : "+ cost);
        System.out.println();
    }

    public float getCost() {
        return cost;
    }
}
