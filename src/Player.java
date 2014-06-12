import org.joda.time.DateTime;

import java.io.Serializable;

public class Player implements Serializable {
    private DateTime dateTime;
    private String name;
    private String surname;
    // private int number;
    // Transient variables won't het serialized
    // private transient int age;
    private int age;
    private double avgRating;
    private boolean isInjured;

    // Static variables won't get saved by serialization
    private static final long serialVersionUID = 3L;

    public Player(DateTime dateTime, String name, String surname, // int number,
                  int age, double avgRating, boolean isInjured) {
        this.dateTime = dateTime;
        this.name = name;
        this.surname = surname;
        // this.number = number;
        this.age = age;
        this.avgRating = avgRating;
        this.isInjured = isInjured;
    }

    @Override
    public String toString() {///*
        return "\nPlayer{" +
                "\ndateTime=" + dateTime +
                ", \nname='" + name + '\'' +
                ", \nsurname='" + surname + '\'' +
                // ", \nnumber=" + number +
                ", \nage=" + age +
                ", \navgRating=" + avgRating +
                ", \nisInjured=" + isInjured +
                '}';
    }
}