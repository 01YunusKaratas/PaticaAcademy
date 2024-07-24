package JAVA102.AdvantureGame;

public abstract class BattleLoc extends Location {

    private Obstacle obstacle;

    public BattleLoc(String name, Obstacle obstacle) {
        super(name); // from Location
        this.obstacle = new Obstacle(); // create object for Obstacle Class.

    }


    public boolean onLocation() {

        return false; // örnek

    };

    public void combat(){
        
    }

}
