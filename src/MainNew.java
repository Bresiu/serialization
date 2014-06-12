import java.util.ArrayList;

public class MainNew {
    private static final String TEAM_FILE = "newTeam";

    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();
        InputStream inputStream = new InputStream();

        ArrayList<Team> teams = (ArrayList<Team>) inputStream.deserialize(TEAM_FILE);
        System.out.println(teams);

        /*
        // TEST
        int somePlayerNumber = teams.get(0).getPlayers().get(0).getNumber();
        System.out.println("\nPlayer 0 from 0th team have: " + somePlayerNumber + " number\n");

        teams.get(0).getPlayers().get(0).setNumber(17);
        somePlayerNumber = teams.get(0).getPlayers().get(0).getNumber();
        System.out.println("\nPlayer 0 from 0th team have: " + somePlayerNumber + " number\n");
        */

        outputStream.serialize(TEAM_FILE, teams);
    }
}