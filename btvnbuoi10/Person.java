package btvnbuoi10;

import java.util.Scanner;

public class Person implements Comparable<Person>{
    private int id;
    private String name,address;
    public Person() {
    }

    public Person(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id : ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten : ");
        name = sc.nextLine();
        System.out.println("Nhap que quan : ");
        address = sc.nextLine();
    }
    //public void xuatN() {
    //System.out.println("ID : " + id);
    //    System.out.println("Ho ten    : " + name);
     //   System.out.println("Que quan  : " + address);
    //}
    public int compareTo(Person o) {
        if(this.getName().compareTo(o.getName()) == 0)
            return this.getAddress().compareTo(o.getAddress());
        else
            return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
