package JAVA102.AdvantureGame;

public class Cave extends BattleLoc {

    public Cave(Player player) {
        super(player, "Cave", new Zombie(), "Food");

    }

    @Override
    public boolean onLocation() {
        // TODO Auto-generated method stub
        return true;
    }

}
