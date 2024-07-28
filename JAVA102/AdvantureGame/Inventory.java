package JAVA102.AdvantureGame;

public class Inventory {
    private boolean water; // su
    private boolean food; // yemek
    private boolean firewood; // yakacak odun
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorDamage;
    private int damage;

    // constructor
    public Inventory() {
        this.water = false;
        this.food = false;
        this.firewood = false;
        this.weaponName = null; // silah ismi
        this.armorName = null;// zırh ismi
        this.weaponDamage = 0;
        this.armorDamage = 0;
        this.damage = 0;

    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

}
