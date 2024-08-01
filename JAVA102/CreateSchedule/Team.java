package CreateSchedule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Team {
    Scanner sc = new Scanner(System.in);
    private String teamName;
    private List<String> teams;
    private int counter;

    public Team() {
        this.teams = new ArrayList<>();
        this.counter = 0;
    }

    // Takım ekleme
    public void addTeam() {
        System.out.print("Team : ");
        String teamID = sc.nextLine();

        // "Bay" ekleme kontrolü
        if (teams.size() % 2 == 0 && teams.size() != 0) {
            if (!teams.contains("Bay")) {
                teams.add("Bay");
            }
        }

        this.teams.add(teamID);
        System.out.println(teamID + " added for fixture.");
    }

    // Takımları gösterme
    public void showTeams() {
        counter = 0;
        if (teams.size() == 0) {
            System.out.println("Fixture is empty");
        } else {
            System.out.println("**********TEAMS**********");
            for (String team : teams) {
                counter++;
                System.out.println(this.getCounter() + " -> " + team);
            }
        }
    }

    public void removeTeam() {
        this.showTeams(); // Burada takımları gösterecek
        System.out.println(" ");
        System.out.println("Lütfen silmek istediğiniz takımı girin: ");

        if (teams.size() == 0) {
            System.out.println("Bu listeden takım silemezsiniz! Liste boş.");
            return; // Liste boşsa metodu sonlandırır
        }

        String del = sc.nextLine(); // Kullanıcıdan silinecek takımı alır

        if (teams.remove(del)) { // Takım listeden başarıyla silindiyse
            System.out.println(del + " listeden silindi.");
        } else {
            System.out.println("Belirtilen takım listede bulunamadı.");
        }
    }

    // Fikstür oluşturma
    public void generateFixtures() {
        List<String> tempTeams = new ArrayList<>(teams);

        if (tempTeams.size() % 2 != 0) {
            tempTeams.add("Bay");
        }

        int numRounds = (tempTeams.size() - 1) * 2;
        int numMatchesPerRound = tempTeams.size() / 2;

        Collections.shuffle(tempTeams);

        List<String[]> fixtures = new ArrayList<>();
        for (int round = 0; round < numRounds; round++) {
            System.out.println("******ROUND******" + (round + 1));
            for (int match = 0; match < numMatchesPerRound; match++) {
                int home = (round + match) % (tempTeams.size() - 1);
                int away = (tempTeams.size() - 1 - match + round) % (tempTeams.size() - 1);

                if (match == 0) {
                    away = tempTeams.size() - 1;
                }

                String homeTeam = tempTeams.get(home);
                String awayTeam = tempTeams.get(away);

                if (round >= numRounds / 2) {
                    String temp = homeTeam;
                    homeTeam = awayTeam;
                    awayTeam = temp;
                }

                fixtures.add(new String[] { homeTeam, awayTeam });
                System.out.println(homeTeam + " vs " + awayTeam);
            }
        }
    }

    // Getter ve Setter'lar
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public List<String> getTeams() {
        return this.teams;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
