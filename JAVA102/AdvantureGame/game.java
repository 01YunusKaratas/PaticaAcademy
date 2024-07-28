package JAVA102.AdvantureGame;

import java.util.Scanner;

public class game {
    Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to the ADVENTURE GAME !!!!");
        System.out.print("Please enter the NAME for playing the game: ");
        String name = sc.nextLine();
        Player player = new Player(name); // Create player

        System.out.println("Welcome " + name + " to the ADVENTURE GAME");
        player.selectCharacter();

        Location location = null;

        while (true) {
            System.out.println("*".repeat(15) + "LOCATIONS" + "*".repeat(15));
            System.out.println("1 -> Safe House \n2 -> Tool Store \n3 -> Forest \n4 -> Cave \n5 -> River \n0 -> Exit");
            System.out.print("Please enter the Location: ");
            int selectLoc = sc.nextInt();
            sc.nextLine(); // Consume the newline

            switch (selectLoc) {
                case 0:
                    System.out.println("Exiting the game. Goodbye!");
                    return;

                case 1:
                    location = new SafeHouse(player);
                    break;

                case 2:
                    location = new ToolStore(player);
                    break;

                case 3:
                    location = new Forest(player);
                    break;

                case 4:
                    location = new Cave(player);
                    break;

                case 5:
                    location = new River(player);
                    break;

                default:
                    System.out.println("Please enter a valid location!");
                    continue;
            }

            if (location instanceof SafeHouse) {
                if (player.getInventory().isFirewood() && player.getInventory().isFood()
                        && player.getInventory().isWater()) {
                    System.out.println("Congratulations, you won the game!");
                    break;
                }
            }

            if (location != null) {
                if (!location.onLocation()) {
                    System.out.println("Game Over!");
                    break;
                }
            }
        }
    }
}
