import org.joda.time.DateTime;

import java.io.Serializable;

public class Player implements Serializable {
    private DateTime dateTime;
    private String name;
    private String surname;
    private int age;
    private double avgRating;
    private boolean isInjured;

    private static final long serialVersionUID = 3L;

    public Player(DateTime dateTime, String name, String surname,
                  int age, double avgRating, boolean isInjured) {
        this.dateTime = dateTime;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.avgRating = avgRating;
        this.isInjured = isInjured;
    }

    @Override
    public String toString() {
        return "Player{" +
                "dateTime=" + dateTime +
                ",\nname='" + name + '\'' +
                ",\nsurname='" + surname + '\'' +
                ",\nage=" + age +
                ",\navgRating=" + avgRating +
                ",\nisInjured=" + isInjured +
                '}';
    }
}