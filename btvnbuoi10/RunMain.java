package btvnbuoi10;

import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        int n;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
            for(int i = 0;i<n;i++){
                Person a = new Person();
                a.input();
                list.add(a);
            }
        }
        catch(Exception ex){
            System.out.println("Nhap sai du lieu");
        }

        System.out.println("Danh sach nguoi : ");
        for(Person a : list){
            System.out.println(a.toString());
        }
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId()-o2.getId();
            }
        });
        System.out.println("Sap xep nguoi theo id");
        for(Person a: list){
            System.out.println(a.toString());
        }
        Collections.sort(list);
        System.out.println("Sap xep nguoi theo name : ");
        for(Person a: list){
            System.out.println(a.toString());
        }
    }

}
