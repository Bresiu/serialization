import org.joda.time.DateTime;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String teamFile = "newTeam";
        DateTime dateTime = new DateTime();

        outputStream(dateTime, teamFile);
        inputStream(teamFile);
    }
    private static void outputStream(DateTime dateTime, String teamFile) {
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            Player bresiu = new Player(dateTime, "Michal", "Brewczak", 26, 7.7, false);
            Player giggsy = new Player(dateTime, "Ryan", "Giggs", 40, 8.5, true);

            ArrayList<Player> players = new ArrayList<Player>();
            players.add(bresiu);
            players.add(giggsy);

            Team manutd = new Team("Manchester", players);

            Player beckham = new Player(dateTime, "David", "Beckham", 39, 7.5, false);
            Player keano = new Player(dateTime, "Roy", "Keane", 42, 7.9, false);

            ArrayList<Player> players2 = new ArrayList<Player>();
            players2.add(beckham);
            players2.add(keano);

            Team manutd2 = new Team("Manchester U50", players2);

            ArrayList<Team> teams = new ArrayList<Team>();
            teams.add(manutd);
            teams.add(manutd2);

            fos = new FileOutputStream(teamFile);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(teams);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings({"unchecked"})
    private static void inputStream(String teamFile) {
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(teamFile);
            ois = new ObjectInputStream(fis);
            //Player player = (Player) ois.readObject();
            ArrayList<Team> teams = (ArrayList<Team>) ois.readObject();
            //ArrayList<> teams = (ArrayList<Team>) ois.readObject();
            System.out.println(teams);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
