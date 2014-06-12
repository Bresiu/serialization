import org.joda.time.DateTime;

import java.util.ArrayList;

public class MakeNew {

    private ArrayList<Player> generatePlayers() {

        ArrayList<Player> players = new ArrayList<Player>();

        // /*
        Player bresiu = new Player(getCurrentDate(), "Michal", "Brewczak", 26, 7.7, false);
        Player giggsy = new Player(getCurrentDate(), "Ryan", "Giggs", 40, 8.5, true);
        Player beckham = new Player(getCurrentDate(), "David", "Beckham", 39, 7.5, false);
        Player keano = new Player(getCurrentDate(), "Roy", "Keane", 42, 7.9, false);

        players.add(bresiu);
        players.add(giggsy);
        players.add(beckham);
        players.add(keano);
        // */

        return players;
    }

    public ArrayList<Team> teams() {

        ArrayList<Team> teams = new ArrayList<Team>();

        Team manchesterU18 = new Team("manchesterU18", generatePlayers());
        Team manchesterU21 = new Team("manchesterU21", generatePlayers());
        Team manchesterU50 = new Team("manchesterU50", generatePlayers());

        teams.add(manchesterU18);
        teams.add(manchesterU21);
        teams.add(manchesterU50);

        return teams;
    }

    private DateTime getCurrentDate() {
        return new DateTime();
    }
}