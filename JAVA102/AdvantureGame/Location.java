package JAVA102.AdvantureGame;

public abstract class Location {
    private Player player;
    private String name;

    public Location(Player player) {
        this.player = player;
        
    }

    
    public abstract boolean onLocation(); // abstract method

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
