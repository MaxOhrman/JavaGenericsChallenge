package ohrman.max.teams;

import ohrman.max.Team;

public class LeagueOfLegendsTeam extends Team {

    public LeagueOfLegendsTeam(String name) {
        super(name);
    }

    @Override
    public void setDraw(Team opposingTeam) {
        System.out.println("League of legends match cannot be a draw.");
    }


}
