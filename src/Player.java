import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String surname;
    private int age;
    private double avgRating;
    private boolean isInjured;

    public Player(String name, String surname, int age, double avgRating, boolean isInjured) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.avgRating = avgRating;
        this.isInjured = isInjured;
    }

    @Override
    public String toString() {
        return "Player: [" + name + " " + surname + "] - " + age +
                "\nAvg rating: " + avgRating + " Injury: " + isInjured;
    }
}
