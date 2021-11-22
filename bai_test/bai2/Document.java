package bai_test.bai2;

import java.util.Scanner;

public class Document {
    protected String id,name, publisher;
    protected float price;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Input id: ");
        id = sc.nextLine();
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input publisher: ");
        publisher = sc.nextLine();
        System.out.println("Input price: ");
        price = sc.nextFloat();
    }
    public void output(){
        System.out.println("ID : "+ id);
        System.out.println("Name : "+ name);
        System.out.println("Publisher : "+ publisher);
        System.out.println("Price : "+ price);
       //System.out.printf("%-20s %-20s %-20s %-20f",id, name, publisher,price);
    }

    public Document() {
    }

    public Document(String id, String name, String publisher, float price, Scanner sc) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
        this.sc = sc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
