import java.util.ArrayList;

public class Migrate {

    public Object perform(Object object) {
        ArrayList<Team> teams = (ArrayList<Team>) object;
        for (Team team : teams) {
            ArrayList<Object> players = team.getPlayers();
            ArrayList<Object> newPlayers = new ArrayList<Object>();
            for (Object player : players) {
                Object newPlayer = changePlayers(((Player) player));
                newPlayers.add(newPlayer);
            }
            team.setPlayers(newPlayers);
        }
        return teams;
    }

    private Object changePlayers(Player player) {
        return new NewPlayer(player.getName(), player.getSurname(), ((player.getAge() + 1) + "yrs old"));
    }
}
