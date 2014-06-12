import java.util.ArrayList;

public class MainOld {

    private static final String TEAM_FILE = "newTeam";

    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();

        MakeNew makeNew = new MakeNew();
        ArrayList<Team> teams = makeNew.teams();
        System.out.println(teams);

        outputStream.serialize(TEAM_FILE, teams);
    }
}
