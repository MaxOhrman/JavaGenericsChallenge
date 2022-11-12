package ohrman.max;

/*
- Implement a league table for a sport
- Should be able to allow teams to be added to a list and store a list of teams that belong to the league
- Method that prints out teams in order by ranking
- only teams of the same type should be added to any particular instance of the league class
- the program should fail to compile if we try to add an incompatible team.
 */

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team>{

    private ArrayList<Team<T>> members = new ArrayList<>();

    public void addMember(Team<T> team){
        members.add(team);
    }

    public void printLeagueTable(){
        Collections.sort(members);
        int ranking = 1;

        for (Team<T> team : members) {
            System.out.println(ranking + ". " + team.getName() + " wins: " + team.getWins() );
        }
    }
}
