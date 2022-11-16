package ohrman.max.teams;

import ohrman.max.Team;

public class LeagueOfLegendsTeam<T> extends Team<T> {

    public LeagueOfLegendsTeam(String name) {
        super(name);
    }

    @Override
    public void setDraw(Team<T> opposingTeam) {
        System.out.println("League of legends match cannot be a draw.");
    }

}
