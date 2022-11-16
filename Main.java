package ohrman.max;

/*
- Implement a league table for a sport
- Should be able to allow teams to be added to a list and store a list of teams that belong to the league
- Method that prints out teams in order by ranking
- only teams of the same type should be added to any particular instance of the league class
- the program should fail to compile if we try to add an incompatible team.
 */

import ohrman.max.teams.LeagueOfLegendsTeam;
import ohrman.max.teams.LeaguePlayers;

public class Main {

    public static void main(String[] args) {

        LeaguePlayers bob = new LeaguePlayers("Bob Schwang", 21);

        //Create some teams
        Team<LeagueOfLegendsTeam<LeaguePlayers>> jd_gaming = new LeagueOfLegendsTeam<>("JD Gaming");
        Team<LeagueOfLegendsTeam<LeaguePlayers>> gen_g = new LeagueOfLegendsTeam<>("Gen.G");
        Team<LeagueOfLegendsTeam<LeaguePlayers>> top_esports = new LeagueOfLegendsTeam<>("Top Esports");
        Team<LeagueOfLegendsTeam<LeaguePlayers>> t1 = new LeagueOfLegendsTeam<>("T1");

        jd_gaming.setWinner(gen_g);
        jd_gaming.setWinner(gen_g);
        jd_gaming.setWinner(gen_g);
        jd_gaming.setDraw(gen_g);

        LeagueTable<LeagueOfLegendsTeam<LeaguePlayers>> table = new LeagueTable<>("The league league");
        table.addMember(jd_gaming);
        table.addMember(gen_g);
        table.addMember(top_esports);
        table.addMember(t1);

        table.printLeagueTable();

    }
}
