package JAVA102.AdvantureGame;

public class River extends BattleLoc {

    // constructor
    public River(Player player) {
        super(player, "River", new Bear(), "water"); // burada el ile gerekli bilgileri girdik .

    }

    @Override
    public boolean onLocation() {
        // TODO Auto-generated method stub
        return true;
    }
}
