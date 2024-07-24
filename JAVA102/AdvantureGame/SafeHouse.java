package JAVA102.AdvantureGame;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player){
        super(player, "Safety Home");
        

    }

    public boolean onLocation() {
        return true; // örnek
    }
}
