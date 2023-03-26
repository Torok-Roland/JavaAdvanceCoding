package ro.sda.advanced._6_generics;

public class Team<T> implements Comparable<Team<T>> {
    private String name;
    private int playedGames;
    private int won;
    private int lost;
    private int tied;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            opponent.lost++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            opponent.tied++;
            message = " tied with ";
        } else {
            lost++;
            opponent.won++;
            message = " lost too ";
        }
        playedGames++;
        opponent.playedGames++;

        System.out.println(this.getName() + message + opponent.name);
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> o) {
        if (this.ranking() > o.ranking()) {
            return -1;
        } else if (this.ranking() < o.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
