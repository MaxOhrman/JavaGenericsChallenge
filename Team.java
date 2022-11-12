package ohrman.max;

public class Team<T> implements Comparable<Team<T>>{
    private final String name;
    private int wins;
    private int losses;
    private int draw;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraw() {
        return draw;
    }

    private void addWin() {
        this.wins ++;
    }

    private void addLoss(){
        this.losses++;
    }

    private void addDraw() {
        this.draw ++;
    }

    public void setWinner(Team<T> loosingTeam) {
        addWin();
        loosingTeam.addLoss();
    }

    public void setDraw(Team<T> opposingTeam) {
        addDraw();
        opposingTeam.addDraw();
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.getWins() > team.getWins()) {
            return -1;
        } else if (this.getWins() < team.getWins() ) {
            return 1;
        } else {
            return 0;
        }
     }

}
