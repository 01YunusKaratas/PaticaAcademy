package JAVA102.AdvantureGame;

public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player, "Forest", new Vampire(), "firewood");

    }

    @Override
    public boolean onLocation() {
        return true;
    }

}
