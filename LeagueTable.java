package ohrman.max;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T> {
    private final String leagueName;

    private final ArrayList<Team<T>> members = new ArrayList<>();

    public LeagueTable(String leagueName) {
        this.leagueName = leagueName;
    }

    public void addMember(Team<T> team){
        members.add(team);
    }

    public void printLeagueTable(){
        Collections.sort(members);
        int ranking = 1;
        System.out.println("The " + leagueName);

        for (Team<T> team : members) {
            System.out.println(ranking + ". " + team.getName() + " wins: " + team.getWins() );
            ranking++;
        }
    }
}
