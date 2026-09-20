class Team {
    String name;
    int matchesPlayed, wins, draws;

    Team(String n, int m, int w, int d) {
        name = n;
        matchesPlayed = m;
        wins = w;
        draws = d;
    }

    int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {
    CricketTeam(String n, int m, int w, int d) {
        super(n, m, w, d);
    }

    int calculatePoints() {
        return wins * 2 + draws;
    }
}

class FootballTeam extends Team {
    FootballTeam(String n, int m, int w, int d) {
        super(n, m, w, d);
    }

    int calculatePoints() {
        return wins * 3 + draws;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Team t1 = new CricketTeam("India", 10, 6, 2);
        Team t2 = new FootballTeam("Barcelona", 8, 6, 1);

        System.out.println("Team: " + t1.name + " (Cricket) Points: " + t1.calculatePoints());
        System.out.println("Team: " + t2.name + " (Football) Points: " + t2.calculatePoints());
    }
}