package JAVA102.AdvantureGame;

import java.util.Scanner;

public class Player {
    private String name;
    private int damage;
    private int healty;
    private int money;
    Inventory inventory;
    private String cName;
    private int rhealty; // Maksimum sağlık değeri

    // Constructor
    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectCharacter() {
        switch (showCharacter()) {
            case 1:
                initPlayer("Samurai", 5, 21, 15); // Samurai için sağlık değeri 21
                break;
            case 2:
                initPlayer("Archer", 7, 18, 20); // Archer için sağlık değeri 18
                break;
            case 3:
                initPlayer("Knight", 8, 24, 5); // Knight için sağlık değeri 24
                break;
        }
        System.out.println("******************************CHARACTER INFORMATION******************************");
        System.out.println(
                "NAME :" + cName + "\nDAMAGE:" + damage + "\nHEALTY:" + healty + "\nMONEY:" + money);
    }

    public int showCharacter() {
        System.out.println();
        System.out.println("             Character Table       ");
        Scanner sc = new Scanner(System.in);
        System.out.println("*".repeat(50));
        System.out.println("CHARACTER   ID  DAMAGE  HEALTY  MONEY");
        System.out.println("Samurai     1     5       21     15");
        System.out.println("Archer      2     7       18     20");
        System.out.println("Knight      3     8       24      5");
        System.out.println("*".repeat(50));

        int charID = -1;

        System.out.println("Choosing the character :");

        while (true) {
            if (sc.hasNextInt()) {
                charID = sc.nextInt();
                if (charID >= 1 && charID <= 3) {
                    break;
                } else {
                    System.err.println("Please enter a valid value (1, 2, or 3):");
                }
            } else {
                sc.next();
                System.err.println("Invalid input. Please enter a number between 1 and 3:");
            }
        }

        return charID;
    }

    public void initPlayer(String cName, int damage, int healty, int money) {
        this.setCName(cName);
        this.setDamage(damage);
        this.setHealty(healty);
        this.setMoney(money);
        this.rhealty = healty; // Maksimum sağlık değeri
        this.healty = healty; // Başlangıç sağlık değeri
    }

    public int getTotalDamage() {
        return (this.damage + this.inventory.getDamage());
    }

    public int getTotalArmorDamage() {
        return this.getDamage() + this.inventory.getArmorDamage();
    }

    public int getTotalWeaponDamage() {
        return this.getDamage() + this.inventory.getWeaponDamage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealty() {
        return healty;
    }

    public void setHealty(int healty) {
        this.healty = healty;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getRhealty() {
        return rhealty;
    }

    public void setRhealty(int rhealty) {
        this.rhealty = rhealty;
    }
}
