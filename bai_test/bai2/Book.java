package bai_test.bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Book extends Document {
    private int numberOfPage;
    private String author;
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> x = new ArrayList<>();
    public void inputB(){
        super.input();
        System.out.println("Input author: ");
        author = sc.nextLine();
        System.out.println("Input number of page: ");
        numberOfPage = sc.nextInt();

    }
    public void outputB(){
        super.output();
        //System.out.printf("%-20d %-20s",numberOfPage,author);
        System.out.println("Number of page: "+ numberOfPage);
        System.out.println("Author: "+ author);
    }
    public Book(){

    }
    public Book(int numberOfPage, String author, Scanner sc, ArrayList<Book> x) {
        this.numberOfPage = numberOfPage;
        this.author = author;
        this.sc = sc;
        this.x = x;
    }

    public Book(String id, String name, String publisher, float price, Scanner sc, int numberOfPage, String author, Scanner sc1, ArrayList<Book> x) {
        super(id, name, publisher, price, sc);
        this.numberOfPage = numberOfPage;
        this.author = author;
        this.sc = sc1;
        this.x = x;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Scanner getSc() {
        return sc;
    }

    @Override
    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public ArrayList<Book> getX() {
        return x;
    }

    public void setX(ArrayList<Book> x) {
        this.x = x;
    }
}
