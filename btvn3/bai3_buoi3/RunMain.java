package bai3_buoi3;

import java.util.Random;

public class RunMain {
    public static void main(String [] args){
        Guns Diepbede    = new Guns();
        Guns Doanxinhgai = new Guns();
        Diepbede.setWeaponName("Sung nuoc ");
        Diepbede.setAmmoNumber(100);
        Doanxinhgai.setWeaponName("Sung tieu lien ");
        Doanxinhgai.setAmmoNumber(100);
        Random rn = new Random();
        while (Diepbede.getAmmoNumber() != 0 && Doanxinhgai.getAmmoNumber() != 0){
            Diepbede.shoot(rn.nextInt(10)+1);
            Doanxinhgai.shoot(rn.nextInt(10)+1);
            if(Diepbede.getAmmoNumber()== 0 && Doanxinhgai.getAmmoNumber() == 0) {
                System.out.println("Nap dan");
                Diepbede.load(rn.nextInt(10)+1);
                Doanxinhgai.load(rn.nextInt(10)+1);
            }
            else{
                if (Diepbede.getAmmoNumber() == 0) {
                    System.out.println("Ci Doan thang");
                    break;
                }
                else if (Doanxinhgai.getAmmoNumber() == 0) {
                    System.out.println("Ci Diep thang");
                    break;
                }
            }
        }

    }
}
