package ohrman.max;

/*
- Implement a league table for a sport
- Should be able to allow teams to be added to a list and store a list of teams that belong to the league
- Method that prints out teams in order by ranking
- only teams of the same type should be added to any particular instance of the league class
- the program should fail to compile if we try to add an incompatible team.
 */

import ohrman.max.teams.LeagueOfLegendsTeam;

public class Main {

    public static void main(String[] args) {

        //Create some teams

        LeagueOfLegendsTeam jd_gaming = new LeagueOfLegendsTeam("JD Gaming");
        LeagueOfLegendsTeam gen_g = new LeagueOfLegendsTeam("Gen.G");
        LeagueOfLegendsTeam top_esport = new LeagueOfLegendsTeam("Top Esports");
        LeagueOfLegendsTeam t1 = new LeagueOfLegendsTeam("T1");


    }
}
