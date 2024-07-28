package JAVA102.AdvantureGame;

import java.util.Scanner;

public abstract class BattleLoc extends Location {

    protected Obstacle obstacle;
    protected String award;
    Scanner sc = new Scanner(System.in);

    public BattleLoc(Player player, String name, Obstacle obstacle, String award) {
        super(player);
        this.obstacle = obstacle;
        this.award = award;

        playerStats();
        enemyStats();

        // Bu noktada, obstacle.count() ile savaş başlatıyorsunuz.
        // combat(obstacle.count()) çağrısından sonra onLocation() çağırmak uygun
        // olmayabilir.
        // Genellikle, savaş bittikten sonra veya savaş sırasında ekranın güncellenmesi
        // gibi işlemler yapabilirsiniz.

        if (combat(obstacle.count())) { // Savaşın sonucunu kontrol et
            // Eğer savaş başarılıysa, ödül vb. işlemler
            afterHit(); // Savaş bitiminde sağlık durumu vb. kontrolü
        }
        onLocation(); // Ekran güncelleme veya diğer işlemler
    }

    public boolean onLocation() {
        int obsCount = obstacle.count();
        System.out.println("NOW you are in here: " + this.getName());
        System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " yaşıyor !");
        System.out.print("<v> -War veya <e>Escape:");
        String selCase = sc.nextLine();
        selCase = selCase.toUpperCase();
        if (selCase.equals("v")) {
            if (combat(obsCount)) {
                System.out.println(this.getName() + " bölgesindeki tüm düşmanları temizlediniz !");
                if (this.award.equals("Food") && getPlayer().getInventory().isFood() == false) {
                    System.out.println(this.award + " Kazandınız! ");
                    getPlayer().getInventory().setFood(true);
                } else if (this.award.equals("Water") && getPlayer().getInventory().isWater() == false) {
                    System.out.println(this.award + " Kazandınız! ");
                    getPlayer().getInventory().setWater(true);
                } else if (this.award.equals("Firewood") && getPlayer().getInventory().isFirewood() == false) {
                    System.out.println(this.award + " Kazandınız! ");
                    getPlayer().getInventory().setFirewood(true);
                }
                return true;
            }

            if (getPlayer().getHealty() <= 0) {
                System.out.println("Öldünüz !");
                return false;
            }

        }
        return true;
    }

    public boolean combat(int obsCount) {
        for (int i = 0; i < obsCount; i++) {
            int defObsHealth = obstacle.getHealth();
            playerStats();
            enemyStats();
            while (getPlayer().getHealty() > 0 && obstacle.getHealth() > 0) {
                System.out.print("<V>ur veya <K>aç :");
                String selCase = sc.nextLine();
                selCase = selCase.toUpperCase();
                if (selCase.equals("V")) {
                    System.out.println("Siz vurdunuz !");
                    obstacle.setHealth(obstacle.getHealth() - getPlayer().getTotalDamage());
                    afterHit();
                    if (obstacle.getHealth() > 0) {
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        getPlayer().setHealty(getPlayer().getHealty()
                                - (obstacle.getDamage() - getPlayer().getInventory().getArmorDamage()));
                        afterHit();
                    }
                } else {
                    return false;
                }
            }

            if (obstacle.getHealth() < getPlayer().getHealty()) {
                System.out.println("Düşmanı yendiniz !");
                getPlayer().setMoney(getPlayer().getMoney() + obstacle.getAward());
                System.out.println("Güncel Paranız : " + getPlayer().getMoney());
                obstacle.setHealth(defObsHealth);
            } else {
                return false;
            }
            System.out.println("-------------------");
        }
        return true;
    }

    public void playerStats() {
        System.out.println("Oyuncu Değerleri\n--------------");
        System.out.println("Can:" + getPlayer().getHealty());
        System.out.println("Hasar:" + getPlayer().getTotalDamage());
        System.out.println("Para:" + getPlayer().getMoney());
        if (getPlayer().getInventory().getWeaponDamage() > 0) {
            System.out.println("Silah:" + getPlayer().getInventory().getWeaponName());
        }
        if (getPlayer().getInventory().getArmorDamage() > 0) {
            System.out.println("Zırh:" + getPlayer().getInventory().getArmorName());
        }
    }

    public void enemyStats() {
        System.out.println("\n" + obstacle.getName() + " Değerleri\n--------------");
        System.out.println("Can:" + obstacle.getHealth());
        System.out.println("Hasar:" + obstacle.getDamage());
        System.out.println("Ödül:" + obstacle.getAward());
    }

    public void afterHit() {
        System.out.println("Oyuncu Canı:" + getPlayer().getHealty());
        System.out.println(obstacle.getName() + " Canı:" + obstacle.getHealth());
        System.out.println();
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
