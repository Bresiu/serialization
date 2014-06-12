import java.util.ArrayList;

public class MainNew {
    private static final String TEAM_FILE = "newTeam";

    public static void main(String[] args) {
        OutputStream outputStream = new OutputStream();
        InputStream inputStream = new InputStream();

        ArrayList<Team> teams = (ArrayList<Team>) inputStream.deserialize(TEAM_FILE);
        System.out.println(teams);

        outputStream.serialize(TEAM_FILE, teams);
    }
}