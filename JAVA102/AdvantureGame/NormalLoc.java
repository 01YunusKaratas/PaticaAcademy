package JAVA102.AdvantureGame;

public abstract class NormalLoc extends Location {

    public NormalLoc(Player player) {
        super(player);

    }

    @Override
    public boolean onLocation(){

        System.out.println("Welcome NormalLoc");
        return true;
    }

}