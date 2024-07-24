package JAVA102.AdvantureGame;

public class Inventory {
    private boolean water; //su
    private boolean food; //yemek
    private boolean firewood; //yakacak odun
    private String weaponName;
    private  String armorName;
    private int weaponDamage;
    private int armorDamage;

    // constructor
    public Inventory(){
        this.water =false;
        this.food= false;
        this.firewood = false;
        this.weaponName= null; //silah ismi
        this.armorName=null;// zırh ismi
        this.weaponDamage = 0;
        this.armorDamage=0;

    }

    

    
    public String getWeaponName() {
        return weaponName;
    }


    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    
    public String getArmorName() {
        return armorName;
    }

   
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    
    public int getWeaponDamage() {
        return weaponDamage;
    }

   
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

   
    public int getArmorDamage() {
        return armorDamage;
    }

   
    public void setArmorDamage(int armorDamage) {
        this.armorDamage = armorDamage;
    }

}

