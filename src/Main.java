import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "newPlayer";
        Player player = new Player("Michal", "Brewczak", 26, 7.7, false);

        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(player);

            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(filename);
            ois = new ObjectInputStream(fis);
            player = (Player) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(player);
    }
}
