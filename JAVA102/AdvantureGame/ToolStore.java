package JAVA102.AdvantureGame;

import java.util.Scanner;

public class ToolStore extends NormalLoc {
    Scanner sc = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player);

    }

    public boolean onLocation() {

        System.out.println("Welcome to ToolStore ");
        System.out.println("Money : " + getPlayer().getMoney());
        System.out.println("*".repeat(30));
        System.out.println("1-WEAPON STORE" + "\n2-ARMOR STORE" + "\n3-EXIT");
        System.out.println("*".repeat(30));
        System.out.println("Please enter the store :");
        int choose = sc.nextInt();
        int ıtemID; // atama yapmak için kullandık

        switch (choose) {

            case 1:
                ıtemID = weaponMenu();
                buyWeapon(ıtemID);
                break;
            case 2:
                ıtemID = armorMenu();
                buyArmor(ıtemID);
                break;
            case 3:
                System.out.println("Exiting System.");
                break;

            default:
                System.err.println("Please enter the valid value. !!");
                break;

        }

        return true;
    }

    public int armorMenu() {
        System.out.println("1. Light    Money : 15    Damage : 1");
        System.out.println("2. Medium   Money : 25    Damage : 3");
        System.out.println("3. Heavy     Money : 40   Damage : 5");
        System.out.println("4. .............................EXIT");
        System.out.print("Please choose the armor  : ");

        int armorID = sc.nextInt();

        return armorID;

    }

    public void buyArmor(int armorID) {
        int damage = 0;
        int money = 0;
        String armorName = null;
        switch (armorID) {
            case 1:
                damage = 1;
                money = 15;
                armorName = "Light";
                break;
            case 2:
                damage = 3;
                money = 25;
                armorName = "Medium";
                break;
            case 3:
                damage = 5;
                money = 40;
                armorName = "Heavy";
                break;
            case 4:
                System.out.println("Exiting System..");
                return;
            default:
                System.out.println("Please enter a valid value.");
                return;
        }

        if (money > 0) {
            if (getPlayer().getMoney() >= money) {
                getPlayer().getInventory().setArmorDamage(damage); // Güncel zırh hasarı
                getPlayer().getInventory().setArmorName(armorName); // Güncel zırh adı
                getPlayer().setMoney(getPlayer().getMoney() - money); // Parayı güncelle
                System.out.println(getPlayer().getName() + " bought " + armorName + ". New armor damage: "
                        + getPlayer().getTotalArmorDamage());
            } else {
                System.out.println("There is not enough money.");
            }
        }
    }

    // Weapon Menu
    public int weaponMenu() {
        System.out.println("1. Gun      Money  : 25    Damage : 2");
        System.out.println("2. Sword    Money  : 35    Damage : 3");
        System.out.println("3. Rifle    Money  : 45    Damage : 7");
        System.out.println("4. ..............................EXIT");
        System.out.print("Please choose the weapon  : ");

        int weaponID = sc.nextInt();

        return weaponID;
    }

    // Weapon Buy
    public void buyWeapon(int weaponID) {
        int damage = 0;
        int money = 0;
        String weaponName = null;
        switch (weaponID) {
            case 1:
                damage = 2;
                money = 25;
                weaponName = "Gun";
                break;
            case 2:
                damage = 3;
                money = 35;
                weaponName = "Sword";
                break;
            case 3:
                damage = 7;
                money = 45;
                weaponName = "Rifle";
                break;
            case 4:
                System.out.println("Exiting System..");
                return;
            default:
                System.out.println("Please enter the valid ...");
                return;
        }

        if (money > 0) {
            if (getPlayer().getMoney() >= money) {
                getPlayer().getInventory().setWeaponDamage(damage); // Güncel silah hasarı
                getPlayer().getInventory().setWeaponName(weaponName); // Güncel silah adı
                getPlayer().setMoney(getPlayer().getMoney() - money); // Parayı güncelle
                System.out.println(getPlayer().getName() + " bought " + weaponName + ". New damage: "
                        + getPlayer().getTotalWeaponDamage());
            } else {
                System.out.println("There is not enough money.");
            }
        }
    }

}
