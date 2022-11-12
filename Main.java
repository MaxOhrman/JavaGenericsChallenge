package ohrman.max;

/*
- Implement a league table for a sport
- Should be able to allow teams to be added to a list and store a list of teams that belong to the league
- Method that prints out teams in order by ranking
- only teams of the same type should be added to any particular instance of the league class
- the program should fail to compile if we try to add an incompatible team.
 */

import ohrman.max.teams.LeagueOfLegendsTeam;
import ohrman.max.teams.SoccerTeam;

public class Main {

    public static void main(String[] args) {

        //Create some teams

        Team<LeagueOfLegendsTeam> jd_gaming = new Team<>("JD Gaming");
        Team<LeagueOfLegendsTeam> gen_g = new Team<>("Gen.G");
        Team<LeagueOfLegendsTeam> top_esport = new Team<>("Top Esports");
        Team<LeagueOfLegendsTeam> t1 = new Team<>("T1");

        Team<SoccerTeam> manchester = new Team<>("Manchester");

        jd_gaming.setWinner(gen_g);
        jd_gaming.setWinner(gen_g);
        jd_gaming.setWinner(gen_g);
        jd_gaming.setDraw(gen_g);

        t1.setWinner(top_esport);

        LeagueTable<LeagueOfLegendsTeam> table = new LeagueTable<>();
        table.addMember(jd_gaming);
        table.addMember(gen_g);
        table.addMember(top_esport);
        table.addMember(t1);

        table.printLeagueTable();

    }
}
