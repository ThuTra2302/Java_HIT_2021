package btl.FileController;

import btl.DO.FoodDrink;
import btl.DO.NguyenLieu;
import btl.Nguoi.Account;
import btl.Nguoi.KhachHang;
import btl.Nguoi.NhanVien;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public Scanner getScanner() {
        return this.scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    //Mo file de viet
    public void OpenFileToWrite(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();//hien thi cho sai
        }
    }

    //dong file sau khi doc
    public void CloseFileAfterWrite() {
        try {
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // mo file de doc
    public void OpenFileToRead(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            scanner = new Scanner(Paths.get(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //dong file sau khi doc
    public void CloseFileAfterRead() {
        try {
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void WriteAccountToFile(String fileName, Account account) {
        OpenFileToWrite(fileName);
        printWriter.println(
                account.getUsername()+ "|" +account.getPassword()
        );
        CloseFileAfterWrite();
    }
    public void WriteFoodDrinkToFile(String fileName, FoodDrink foodDrink) {
        OpenFileToWrite(fileName);
        printWriter.println(
                foodDrink.getMaFD() + "|" + foodDrink.getTenFD() + "|" + foodDrink.getGiaCa()
        );
        CloseFileAfterWrite();
    }

    public void WriteMaterialToFile(String fileName, NguyenLieu nguyenLieu) {
        OpenFileToWrite(fileName);
        printWriter.println(
                nguyenLieu.getMaNL() + "|" + nguyenLieu.getNameNL() + "|" + nguyenLieu.getNumber() + "|" + nguyenLieu.getCost()
        );
        CloseFileAfterWrite();
    }
    public void WriteNhanVienToFile(String fileName, NhanVien nhanVien) {
        OpenFileToWrite(fileName);
        printWriter.println(
                nhanVien.getMaNV() + "|"+nhanVien.getName() + "|" + nhanVien.getNumberPhone()
                        + "|" + nhanVien.getAddress() + "|" + nhanVien.getAge()
                        + "|" +nhanVien.getTenCV()+ "|" + nhanVien.getNgayLamViec() + "|" + nhanVien.getCaLam()
        );
        CloseFileAfterWrite();
    }
    public void WirteKhachHangToFile(String fileName, KhachHang khachHang) {
        OpenFileToWrite(fileName);
        printWriter.println(
                khachHang.getIdKhach() + "|" + khachHang.getTenKhach() + "|" + khachHang.getSoBan()
        );
    }
    public ArrayList<NhanVien> ReadNhanVienFromData(String fileName) {
        OpenFileToRead(fileName);
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            String[] KhachStr = data.split("\\|");
            NhanVien nhanVien = new NhanVien( KhachStr[0],KhachStr[1],KhachStr[2],KhachStr[3],
                    Integer.parseInt(KhachStr[4]),KhachStr[5],Integer.parseInt(KhachStr[6]),KhachStr[7]);
            listNhanVien.add(nhanVien);
        }
        CloseFileAfterRead();
        return listNhanVien;
    }
    public ArrayList<KhachHang> ReadKhachHangFromData(String fileName) {
        OpenFileToRead(fileName);
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            String[] KhachStr = data.split("\\|");
            KhachHang khachHang = new KhachHang(KhachStr[0], KhachStr[1], Integer.parseInt(KhachStr[2]));
            listKhachHang.add(khachHang);
        }
        CloseFileAfterRead();
        return listKhachHang;
    }

    public ArrayList<Account> ReadAccountFromData(String fileName) {
        OpenFileToRead(fileName);
        ArrayList<Account> listAccount = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            String[] KhachStr = data.split("\\|");
            Account acc = new Account(KhachStr[0], KhachStr[1]);
            listAccount.add(acc);
        }
        CloseFileAfterRead();
        return listAccount;
    }
    public ArrayList<FoodDrink> ReadFoodDrinkFromData(String fileName) {
        OpenFileToRead(fileName);
        ArrayList<FoodDrink> listFoodDrink = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            String[] KhachStr = data.split("\\|");
            FoodDrink foodDrink = new FoodDrink(KhachStr[0], KhachStr[1], Double.parseDouble(KhachStr[2]));
            listFoodDrink.add(foodDrink);
        }
        CloseFileAfterRead();
        return listFoodDrink;
    }

    public ArrayList<NguyenLieu> ReadMaterialFromData(String fileName) {
        OpenFileToRead(fileName);
        ArrayList<NguyenLieu> listNguyenLieu = new ArrayList<>();
        while (scanner.hasNext()) {
            String data = scanner.nextLine();
            String[] KhachStr = data.split("\\|");
            NguyenLieu nguyenLieu = new NguyenLieu(KhachStr[0], KhachStr[1], Double.parseDouble(KhachStr[2]), Integer.parseInt(KhachStr[3]));
            listNguyenLieu.add(nguyenLieu);
        }
        CloseFileAfterRead();
        return listNguyenLieu;
    }
    public void UpdateKhachHangToFile(ArrayList<KhachHang> khachHangs, String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        for (KhachHang x : khachHangs) {
            WirteKhachHangToFile(fileName, x);
        }
    }
    public void UpdateAccountToFile(ArrayList<Account> accounts,String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        for (Account x : accounts) {
            WriteAccountToFile(fileName, x);
        }
        //CloseFileAfterWrite();
    }
    public void UpdateMaterialToFile(ArrayList<NguyenLieu> nguyenLieus, String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        for (NguyenLieu x : nguyenLieus) {
            WriteMaterialToFile(fileName, x);
        }
    }

    public void UpdateFoodDrinkToFile(ArrayList<FoodDrink> foodDrinks, String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        for (FoodDrink x : foodDrinks) {
            WriteFoodDrinkToFile(fileName, x);
        }
    }

    public void UpdateEmployeeToFile(ArrayList<NhanVien> nhanViens, String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        for (NhanVien x : nhanViens) {
            WriteNhanVienToFile(fileName, x);
        }
    }

    public void UpdateFoodDrinkToFile(String s) {
    }
}

