package JAVA102.AdvantureGame;

import java.util.Scanner;

public class game {
    Scanner sc = new Scanner(System.in);

    public void start() {

        System.out.println("Welcome the ADVANTURE GAME !!!!");
        System.out.print("Please enter the NAME for playing game :");
        String name = sc.nextLine();
        Player p1 = new Player(name);

        System.out.println("Welcome " + name + " for ADVANTURE GAME");
        p1.selectCharacter();

        ToolStore t1 = new ToolStore(p1);
        t1.onLocation(); // this area provides to select the toolstore.
        

      


    }

}
