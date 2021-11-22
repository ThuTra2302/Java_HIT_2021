package bai_test.bai2;

import bai_test.bai2.Book;
import ontap.bai1.sinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> x = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n, choice;
        do {
            System.out.println("\t------------MENU------------");
            System.out.println("1. Add book");
            System.out.println("2. Edit book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Sort books by name");
            System.out.println("5. Sort books by price");
            System.out.println("6. Show all books");
            System.out.println("7. Exit");
            System.out.println("----------------------------");
            System.out.println("\tYou can choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input n = ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        Book a = new Book();
                        System.out.println("Input book the " + (i + 1));
                        a.inputB();
                        x.add(a);
                    }
                    break;
                case 2:
                    int count = 0;
                    System.out.println("Input id to edit: ");
                    String idEdit = sc.nextLine();
                    for (int i = 0; i < x.size(); i++) {
                        if (x.get(i).getId() == idEdit) {
                            Book a = new Book();
                            a.inputB();
                            x.remove(i);
                            x.add(i, a);
                            count++;
                        }
                    }
                    if(count == 0) {
                        System.out.println("Id edit doesn't have ");
                    }
                    else{
                        System.out.println("Done.");
                    }
                    break;
                case 3:

                    System.out.println("Input id to delete: ");
                    String idDelete = sc.nextLine();
                    for (int i = 0; i < x.size(); i++) {
                        if(x.get(i).getId() == idDelete){
                            Book a = new Book();
                            a.inputB();
                            x.remove(i);
                        }
                        else {
                            System.out.println("Id edit doesn't have ");
                        }
                    }
                    System.out.println("Done.");
                    break;
                case 4:
                    for(int i = 0;i<x.size()-1;i++){
                        for(int j = i +1;j<x.size();j++){
                            String name1 = x.get(j-1).getName();
                            String name2 = x.get(j).getName();
                            if(name1.compareToIgnoreCase(name2)>0){
                                Book temp = x.get(j-1);
                                x.set(j-1,x.get(j));
                                x.set(j,temp);
                            }
                        }
                    }
                    break;
                case 5:
                    for(int i = 0;i<x.size()-1;i++){
                        for(int j = i +1;j<x.size();j++){
                            if(x.get(i).getPrice()>x.get(j).getPrice()){
                                Book temp = x.get(j-1);
                                x.set(j-1,x.get(j));
                                x.set(j,temp);
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("\t\t-----------Show all books-----------");
                    //System.out.printf("%-20s %-20s %-20s %-20f","Id","Name","Publisher","Price","Number of page","Author");
                    //for(int i = 0;i<x.size();i++){
                    // x.get(i).input();
                    // }
                    for(Book a : x) {
                        a.outputB();
                    }
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please, rechoice");
            }
        }
        while (choice != 0);
    }
}
