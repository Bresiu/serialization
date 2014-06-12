import java.io.Serializable;
import java.util.ArrayList;

public class Team implements Serializable {

    private static final long serialVersionUID = 2L;

    private String name;
    private ArrayList<Object> players;

    public Team(String name, ArrayList<Object> players) {
        this.name = name;
        this.players = players;
    }

    public ArrayList<Object> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Object> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "\nname='" + name + '\'' +
                ",\nplayers=" + players +
                '}';
    }
}
