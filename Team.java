package ohrman.max;

import java.security.PublicKey;

public class Team<T> {
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

}
