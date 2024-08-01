package CreateSchedule;

import java.util.Scanner;

/**
 * Program
 */
public class Program {
    Team t1 = new Team();

    public void start() {
        Scanner sc = new Scanner(System.in);

        Team t1 = new Team();

        while (true) {
            System.out.println("""
                    *******************************************
                    1-Takım ekle
                    2-Listeyi gör
                    3-liste oluştur
                    4-Listeden takım çıkar.
                    5-Programdan çık
                    *******************************************
                        """);

            System.out.println("Lütfen yapmak istediğiniz işlemi seçin :");
            int choose = sc.nextInt();

            switch (choose) {

                case 1:
                    t1.addTeam();
                    break;
                case 2:
                    t1.showTeams();
                    break;
                case 3:

                    t1.generateFixtures();
                    break;

                case 4:
                    t1.removeTeam();
                    break;
                case 5:
                    System.out.println("Program sonlandırıldı.");
                    System.exit(0);

                default:
                    System.out.println("Lütfen doğru bir seçim giriniz.");
                    break;
            }
        }

    }
}