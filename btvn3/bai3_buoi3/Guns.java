package bai3_buoi3;

public class Guns {
    private String weaponName;
    private int ammoNumber;
    public void load(int x){
        this.ammoNumber += x;
    }
    public void shoot(int x){
        if(this.ammoNumber-x >= 0){
            this.ammoNumber -= x;
        }
        else if(this.ammoNumber ==0){
            System.out.println("Het dan");
        }
    }
    public Guns(){

    }
    public String getweaponName(){
        return weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
}
