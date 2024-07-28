package JAVA102.AdvantureGame;

public class GameCharacter {
    private int damage ;
    private int healty;
    private int money;

    //constructor
    public GameCharacter(int damage, int healty ,int money){

        this.damage =damage;
        this.healty = healty;
        this.money = money;


    }

    
    // Setter and Getter 
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

}
