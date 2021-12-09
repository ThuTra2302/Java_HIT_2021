package btvnb7.bai1;

public class RunMain {
    public static void main(String[] args) {
        Person x = new Employee("Trung", "HN", 3300);
        Person y = new Customer("Linh", "BN", 10400);
        x.display();
        y.display();
    }
}
