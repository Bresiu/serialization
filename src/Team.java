import java.io.Serializable;
import java.util.ArrayList;

public class Team implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private ArrayList<Player> players;

    public Team(String name, ArrayList<Player> players) {
        this.name = name;
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
