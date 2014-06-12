import java.io.Serializable;

public class NewPlayer implements Serializable {
    private String name;
    private String surname;
    private String age;

    private static final long serialVersionUID = 3L;

    public NewPlayer(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.age = number;
    }

    @Override
    public String toString() {
        return "NewPlayer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
