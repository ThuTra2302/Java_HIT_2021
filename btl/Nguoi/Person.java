package btl.Nguoi;

import java.util.Scanner;

public class Person {
    private String name, numberPhone,address;
    private int age;
    Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public void nhap(){
        sc.nextLine();
        System.out.println("Nhap ten  : ");
        name = sc.nextLine();
        System.out.println("Nhap so dien thoai : ");
        numberPhone = sc.nextLine();
        System.out.println("Nhap dia chi : ");
        address = sc.nextLine();
        System.out.println("Nhap tuoi : ");
        age = sc.nextInt();
    }
    //public void xuat(){
    //    System.out.printf("%-20s%-15s%-15s%-10d%", name, numberPhone, address,age);
    //}

    public Person(String name, String numberPhone, String address, int age) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

