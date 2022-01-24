package btl.View;

import btl.DO.FoodDrink;
import btl.DO.NguyenLieu;
import btl.DO.Bill;
import btl.FileController.Controller;
import btl.Nguoi.Account;
import btl.Nguoi.KhachHang;
import btl.Nguoi.NhanVien;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Bill> listBill = new ArrayList<>();
    static ArrayList<FoodDrink> listFD = new ArrayList<>();
    static ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    static ArrayList<KhachHang> listKhachHang = new ArrayList<>();
    static ArrayList<NguyenLieu> listNguyenLieu = new ArrayList<>();
    static ArrayList<Account> listAccount = new ArrayList<>();
    static Controller controller =new Controller();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("====================WELCOME TO TEA CAT COFFEE======================");
            System.out.println("1. ĐĂNG NHẬP TÀI KHOẢN ");
            System.out.println("2. ĐĂNG KÝ TÀI KHOẢN");
            System.out.println("3. THOAT CHUONG TRINH ");
            System.out.println("\tYou can choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    SignIn();
                    break;
                case 2:
                    SignOut();
                    break;
                case 3:
                    System.out.println("SEE YOU LATER");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please, rechoice");
            }
        } while (true);
    }
    public static void SignIn() {
        listAccount = controller.ReadAccountFromData("ACCOUNT.txt");
        sc.nextLine();
        String userName, passWord;
        System.out.println("Enter user name: ");
        userName = sc.nextLine();
        System.out.println("Enter pass word: ");
        passWord = sc.nextLine();
        Account account = new Account();
        if (checkAP(userName, passWord)) {
            for (Account value : listAccount) {
                if (value.getUsername().compareTo(userName) == 0)
                    System.out.println(" -------------Đăng nhập thành công---------------");
            }
            if (userName.compareTo("admin1") == 0) {
                int choice;
                while (true) {

                    System.out.println(" -------------------NHAN VIEN--------------------");
                    System.out.println(" |   1. Hiển thị danh sách nhan vien            |");
                    System.out.println(" |   2. Thêm nhân viên                          |");
                    System.out.println(" |   3. Sửa danh sách nhân viên                 |");
                    System.out.println(" |   4. Xóa nhân viên                           |");
                    System.out.println(" |   5. Sắp xếp nhân viên theo id               |");
                    System.out.println(" |   6. Sắp xếp nhân viên theo tên công viêc    |");
                    System.out.println(" |   7. Tìm kiếm nhân viên theo id              |");
                    System.out.println(" -------------------KHÁCH HÀNG-------------------");
                    System.out.println(" |   8. Hiển thị danh sách khách hàng           |");
                    System.out.println(" |   9. Thêm lịch sử khách hàng                 |");
                    System.out.println(" |   10. Xóa khách hàng                         |");
                    System.out.println(" -------------------NGUYÊN LIỆU------------------");
                    System.out.println(" |   11. Hiển thị danh sách nguyên liệu         |");
                    System.out.println(" |   12. Thêm nguyên liệu                       |");
                    System.out.println(" |   13. Xóa nguyên liệu                        |");
                    System.out.println(" |   14. Sắp xếp nguyên liệu theo id            |");
                    System.out.println(" ---------------------CAFE-----------------------");
                    System.out.println(" |   15. Hiển thị danh sách cafe                |");
                    System.out.println(" |   16. Thêm loại đồ uống cafe                 |");
                    System.out.println(" |   17. Sửa danh sách cafe                     |");
                    System.out.println(" |   18. Xóa loai đồ uống cafe                  |");
                    System.out.println(" |   19. Sắp xếp loại đồ uống cafe              |");
                    System.out.println(" |   20. Tìm kiếm loại đồ uống cafe bằng id     |");
                    System.out.println(" |   0. EXIT                                    |");
                    System.out.println(" ------------------------------------------------");
                    System.out.print("Your choose: ");
                    choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            hienThiDSNhanVien(listNhanVien);
                            break;
                        case 2:
                            addEmployee(listNhanVien);
                            break;
                        case 3:
                            fixEmployee(listNhanVien);
                            break;
                        case 4:
                            removeEmployee(listNhanVien);
                            break;
                        case 5:
                            sortEmployeebyID(listNhanVien);
                            break;
                        case 6:
                            sortEmployeebyNameCV(listNhanVien);
                            break;
                        case 7:
                            searchEmployeeByID(listNhanVien);
                            break;
                        case 8:
                            hienThiDSKhachHang(listKhachHang);
                            break;
                        case 9:
                            addCustomer(listKhachHang);
                            break;
                        case 10:
                            removeCustomer(listKhachHang);
                            break;
                        case 11:
                            hienThiDSNguyenLieu(listNguyenLieu);
                            break;
                        case 12:
                            addMaterial(listNguyenLieu);
                            break;
                        case 13:
                            removeMaterial(listNguyenLieu);
                            break;
                        case 14:
                            sortMaterialByID(listNguyenLieu);
                            break;
                        case 15:
                            hienThiDSCafe(listFD);
                            break;
                        case 16:
                            addCafe(listFD);
                            break;
                        case 17:
                            fixCafe(listFD);
                            break;
                        case 18:
                            removeCafe(listFD);
                            break;
                        case 19:
                            sortCafeByID(listFD);
                            break;
                        case 20:
                            searchCafeByID(listFD);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                    }
                }
            } else {
                int choice2;
                do {
                    System.out.println(" ---------------------CAFE-----------------------");
                    System.out.println(" |   0. EXIT                                    |");
                    System.out.println(" |   1. Hiển thị danh sách cafe                 |");
                    System.out.println(" |   2. Mua loại đồ uống cafe                   |");
                    System.out.println(" |   3. Tìm kiếm loại đồ uống cafe              |");
                    System.out.print("Your choose: ");
                    choice2 = sc.nextInt();
                    sc.nextLine();
                    switch (choice2) {
                        case 1:
                            hienThiDSCafe(listFD);
                            break;
                        case 2:
                            buyCafe(listFD);
                            break;
                        case 3:
                            searchCafeByID(listFD);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ");
                    }
                } while (true);
            }
        } else System.out.println("Not sign in successful");
    }
    public static void SignOut() {
        ArrayList<Account> accounts = new ArrayList<>();
        //Account accounts = new Account();
        String userName, passWord,confirmPass;
        System.out.println("====SIGN OUT ACCOUNT====");
        sc.nextLine();
        do{
            System.out.println("Enter user name: ");
            userName = sc.nextLine();
            if (checkAccount(accounts, userName)) {
                System.out.println("********Exsting user name ");
            }
        }while (checkAccount(accounts,userName));
        do{
            System.out.println("Enter pass word: ");
            passWord = sc.nextLine();
            System.out.print("Confirm password : ");
            confirmPass = sc.nextLine();
            if (passWord.compareTo(confirmPass) != 0)
                System.out.println("Password is not correct,Please re-enter");
        } while (confirmPass.compareTo(passWord) != 0);
        Account a = new Account(userName,passWord);
        listAccount.add(a);
        controller.WriteAccountToFile("ACCOUNT.txt",a);
        System.out.println("=====SIGN OUT SUCCESSFUL=====");
    }
    //sort
    public static void sortEmployeebyNameCV(ArrayList<NhanVien> nhanViens){
        Collections.sort( nhanViens,new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getTenCV().compareTo(o2.getTenCV());
            }
        });
        controller.UpdateEmployeeToFile(nhanViens, "EMPLOYEE.txt");
        System.out.println("Sort successful ");
    }
    public static void sortEmployeebyID(ArrayList<NhanVien> nhanViens){
        listNhanVien = controller.ReadNhanVienFromData("EMPLOYEE.txt");

        Collections.sort( nhanViens,new Comparator<NhanVien>() {

            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                return o1.getMaNV().compareTo(o2.getMaNV());
            }
        });
        controller.UpdateEmployeeToFile(nhanViens, "EMPLOYEE.txt");
        System.out.println("Sort successful ");
    }
    public static void sortMaterialByID(ArrayList<NguyenLieu> nguyenLieus){
        Collections.sort( nguyenLieus,new Comparator<NguyenLieu>() {

            @Override
            public int compare(NguyenLieu o1, NguyenLieu o2) {
                return o1.getMaNL().compareTo(o2.getMaNL());
            }
        });
        controller.UpdateMaterialToFile(nguyenLieus, "MATERIAL.txt");
        System.out.println("Sort successful ");
    }
    public static void sortCafeByID(ArrayList<FoodDrink> foodDrinks){
        Collections.sort( foodDrinks,new Comparator<FoodDrink>() {

            @Override
            public int compare(FoodDrink o1,FoodDrink o2) {
                return o1.getMaFD().compareTo(o2.getMaFD());
            }
        });
        controller.UpdateFoodDrinkToFile(foodDrinks, "CAFE.txt");
        System.out.println("Sort successful ");
    }
    //remove
    public static void removeEmployee(ArrayList<NhanVien> nhanViens){
        String id;
        System.out.println("Input id employee to remove: ");
        id = sc.nextLine();
        boolean idD = false;
        for(int i = 0;i<nhanViens.size();i++){
            if(nhanViens.get(i).getMaNV().compareToIgnoreCase(id)== 0){
                nhanViens.remove(i);
                idD = true;
            }
        }
        if(idD == false) System.out.println("Not found id employee to remove: ");
        else {
            controller.UpdateEmployeeToFile(nhanViens, "EMPLOYEE.txt");
            System.out.println("Remove successful ");
        }
    }
    public static void removeMaterial(ArrayList<NguyenLieu> nguyenLieus){
        String id;
        System.out.println("Input id material to remove: ");
        id = sc.nextLine();
        boolean idD = false;
        for(int i = 0;i<nguyenLieus.size();i++){
            if(nguyenLieus.get(i).getMaNL().compareToIgnoreCase(id)== 0){
                nguyenLieus.remove(i);
                idD = true;
            }
        }
        if(idD == false) System.out.println("Not found id material to remove: ");
        else {
            controller.UpdateMaterialToFile(nguyenLieus, "MATERIAL.txt");
            System.out.println("Remove successful ");
        }
    }
    public static void removeCafe(ArrayList<FoodDrink> foodDrinks){
        String id;
        System.out.println("Input id cafe to remove: ");
        id = sc.nextLine();
        boolean idD = false;
        for(int i = 0;i<foodDrinks.size();i++){
            if(foodDrinks.get(i).getMaFD().compareToIgnoreCase(id)== 0){
                foodDrinks.remove(i);
                idD = true;
            }
        }
        if(idD == false) System.out.println("Not found id cafe to remove: ");
        else {
            controller.UpdateFoodDrinkToFile(foodDrinks, "CAFE.txt");
            System.out.println("Remove successful ");
        }
    }
    public static void removeCustomer(ArrayList<KhachHang> khachHangs){
        String id;
        System.out.println("Input id khach hang to remove: ");
        id = sc.nextLine();
        boolean idD = false;
        for(int i = 0;i<khachHangs.size();i++){
            if(khachHangs.get(i).getIdKhach().compareToIgnoreCase(id)== 0){
                khachHangs.remove(i);
                idD = true;
            }
        }
        if(idD == false) System.out.println("Not found id customer to remove: ");
        else {
            controller.UpdateKhachHangToFile(khachHangs, "CUSTOMER.txt");
            System.out.println("Remove successful ");
        }
    }
    //fix
    public static void fixCafe(ArrayList<FoodDrink> foodDrinks){
        String id;
        System.out.println("Input id cafe to fix: ");
        id = sc.nextLine();
        boolean idD = false;
        for(int i = 0;i<foodDrinks.size();i++){
            if(foodDrinks.get(i).getMaFD().compareToIgnoreCase(id)== 0){
                System.out.println("Fix name fd: ");
                foodDrinks.get(i).setTenFD(sc.nextLine());
                System.out.println("Fix cost: ");
                foodDrinks.get(i).getGiaCa(sc.nextDouble());
                idD = true;
            }
        }
        if(idD == false) System.out.println("Not found id cafe to remove: ");
        else {
            controller.UpdateFoodDrinkToFile(foodDrinks, "CAFE.txt");
            System.out.println("Remove successful ");
        }
    }
    public static void fixEmployee(ArrayList<NhanVien> nhanViens){
        String id;
        System.out.println("Input id employee to fix: ");
        id = sc.nextLine();
        boolean idD = false;
        for(int i = 0;i<nhanViens.size();i++){
            if(nhanViens.get(i).getMaNV().compareToIgnoreCase(id)== 0){
                System.out.println("Fix name employee : ");
                nhanViens.get(i).getName();
                System.out.println("Fix numberphone employee : ");
                nhanViens.get(i).getNumberPhone();
                System.out.println("Fix address employee : ");
                nhanViens.get(i).getAddress();
                System.out.println("Fix age employee : ");
                nhanViens.get(i).getName();
                System.out.println("Fix name CV employee : ");
                nhanViens.get(i).getTenCV();
                idD = true;
            }
        }
        if(!idD) System.out.println("Not found id employee to remove: ");
        else {
            controller.UpdateEmployeeToFile(nhanViens, "EMPLOYEE.txt");
            System.out.println("Remove successful ");
        }
    }
    //add
    public static void addMaterial(ArrayList<NguyenLieu> nguyenLieus){
        NguyenLieu nguyenLieu = new NguyenLieu();
        nguyenLieu.nhap();
        nguyenLieus.add(nguyenLieu);
        controller.WriteMaterialToFile("MATERIAL.txt",nguyenLieu);
        System.out.println("Add successful");
    }
    public static void addCafe(ArrayList<FoodDrink> foodDrinks){
        FoodDrink foodDrink = new FoodDrink();
        foodDrink.nhap();
        foodDrinks.add(foodDrink);
        controller.WriteFoodDrinkToFile("CAFE.txt",foodDrink);
        System.out.println("Add successful");
    }
    public static void addCustomer(ArrayList<KhachHang> khachHangs){
        KhachHang khachHang = new KhachHang();
        khachHang.InputKH();
        khachHangs.add(khachHang);
        controller.WirteKhachHangToFile("CUSTOMER.txt",khachHang);
        System.out.println("Add successful");
    }
    public static void addEmployee(ArrayList<NhanVien> nhanViens){
    String idNV,nameNV,numberP,address,nameCV,shift;
    int age,dateStart;
       System.out.println("Nhap ma nhan vien  : "); idNV = sc.nextLine();
       System.out.println("Nhap ten  : ");
       nameNV = sc.nextLine();
       System.out.println("Nhap so dien thoai : ");
       numberP = sc.nextLine();
       System.out.println("Nhap dia chi : ");
       address = sc.nextLine();
       System.out.println("Nhap tuoi : ");
       age = sc.nextInt();
       sc.nextLine();
       System.out.println("Nhap ten cong viec : ");
       nameCV = sc.nextLine();
       System.out.println("Nhap ca lam : ");
       shift = sc.nextLine();
       System.out.println("Nhap so ngay lam cong viec  : ");
       dateStart = sc.nextInt();
       NhanVien nhanVien = new NhanVien(idNV,nameNV,numberP,address,age,nameCV,dateStart,shift);
       nhanViens.add(nhanVien);
       controller.WriteNhanVienToFile("EMPLOYEE.txt",nhanVien);
       System.out.println("Add successful");
    }
    public static void searchCafeByID(ArrayList<FoodDrink> foodDrinks ){
        listFD = controller.ReadFoodDrinkFromData("CAFE.txt");
        String searchCafe;
        System.out.println("Enter the ID of the cafe to be searched");
        searchCafe = sc.nextLine();
        System.out.printf("-20s%-20s%-20s\n", "Mã Món", "Tên Món", "Giá Món");
        for(int i = 0;i< foodDrinks.size();i++)
            if(listFD.get(i).getMaFD().compareToIgnoreCase(searchCafe)== 0)
                foodDrinks.get(i).xuatFD();
            else
            System.out.println("Not found");
    }
    public static void searchEmployeeByID(ArrayList<NhanVien> nhanViens ){
        listNhanVien = controller.ReadNhanVienFromData("EMPLOYEE.txt");
        String searchEmployee;
        System.out.println("Enter the ID of the employee to be searched: ");
        searchEmployee = sc.nextLine();
        System.out.printf("%-20s%-20s%-15s%-20s%-10s%-20s%-20s%-20s\n",
                "Ma NV ", "Ten NV","SDT","Dia chi", "Tuoi", "Ten CV","So ngay lam ","Ca lam");
        for(int i = 0;i<listNhanVien.size();i++) {
            if (listNhanVien.get(i).getMaNV().compareToIgnoreCase(searchEmployee) == 0) {
                listNhanVien.get(i).OutputNV();
            } else {
                System.out.println("Not found");
            }
        }
    }
    public static void hienThiDSNhanVien(ArrayList<NhanVien> nhanViens){
        listNhanVien = controller.ReadNhanVienFromData("EMPLOYEE.txt");
        System.out.println("\t\t\t=========DANH SÁCH NHÂN VIÊN===========");
        System.out.printf("%-20s%-20s%-15s%-20s%-10s%-20s%-20s%-20s\n",
                "Ma NV ", "Ten NV","SDT","Dia chi", "Tuoi", "Ten CV","So ngay lam ","Ca lam" );
        for(int i = 0;i<listNhanVien.size();i++)
            listNhanVien.get(i).OutputNV();
    }
    public static void hienThiDSNguyenLieu(ArrayList<NguyenLieu> nguyenLieus){
        listNguyenLieu = controller.ReadMaterialFromData("MATERIAL.txt");
        System.out.println("\t\t\t=========DANH SÁCH NGUYÊN LIỆU===========");
        System.out.printf("%-20s%-20s%-20s%-20s\n",
                "Mã NL ", "Tên NL", "Số Lượng", "Giá tiền" );
        for(int i = 0;i< listNguyenLieu.size();i++){
            listNguyenLieu.get(i).xuat();
        }
    }
    public static void hienThiDSKhachHang(ArrayList<KhachHang> khachHangs){
        listKhachHang = controller.ReadKhachHangFromData("CUSTOMER.txt");
        System.out.println("\t=========DANH SÁCH KHÁCH HÀNG===========");
        System.out.printf("%-20s%-20s%-20s\n", "Ma KH", "Ten KH", "Bàn Số" );
        for(int i = 0;i<listKhachHang.size();i++){
            listKhachHang.get(i).xuat();
        }
    }
    public static void hienThiDSCafe(ArrayList<FoodDrink> foodDrinks){
        listFD = controller.ReadFoodDrinkFromData("CAFE.txt");
        System.out.println("\t=========DANH SÁCH CAFE===========");
        System.out.printf("%-20s%-20s%-20s\n", "Mã Món", "Tên Món", "Giá Món");
        for(int i = 0;i<listFD.size();i++){
            listFD.get(i).xuat();
        }
    }
    public static void buyCafe(ArrayList<FoodDrink> foodDrinks){
        listFD = controller.ReadFoodDrinkFromData("CAFE.txt");
        String name ;
        int number;
        FoodDrink foodDrink = new FoodDrink();
        do{
            int d = 0;
            System.out.println("Nhap ten do: ");
            name = sc.nextLine();

            for (int i=0;i<foodDrinks.size();i++) {
                if(name.compareToIgnoreCase(foodDrinks.get(i).getTenFD())==0) {
                    d ++ ;
                    foodDrink = foodDrinks.get(i);
                    break;
                }
            }
            if(d == 0) System.out.println("Khong co loai do uong nay. Vui long chon mon khac !");
            else break;
        }while (true);
        do{
            System.out.println("Nhap so luong  : ");
            number = sc.nextInt();
            if(number>foodDrink.getSolg()) System.out.println("Khong co du loai do uong nay. Vui long chon mon khac !");
        }while (number> foodDrink.getSolg());
        System.out.println("So tien ban can tra la: " + foodDrink.getGiaCa()*number);
        Bill bill = new Bill();
        bill.nhap();
        listBill.add(bill);
        controller.UpdateFoodDrinkToFile(foodDrinks,"CAFE.txt");
    }
    public static boolean checkAccount(ArrayList<Account> accounts,String check){
        listAccount = controller.ReadAccountFromData("ACCOUNT.txt");
        for(int i = 0;i<accounts.size();i++)
            if (accounts.get(i).getUsername().compareTo(check) == 0) {
                return true;
            }
        return false;
    }
    public static boolean checkAP(String userName,String passWord){
        listAccount = controller.ReadAccountFromData("ACCOUNT.txt");
        for(Account account : listAccount) {
            if (account.getUsername().compareToIgnoreCase(userName) == 0 &&
                    account.getPassword().compareToIgnoreCase(passWord) == 0) {
                return true;
            }
        }return false;
    }
}





