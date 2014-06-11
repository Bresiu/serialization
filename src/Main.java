import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "newPlayer";

        ///*
        FileOutputStream fos;
        ObjectOutputStream oos;
        try {
            Player player = new Player("Michal", "Brewczak", 26, 7.7, false);

            fos = new FileOutputStream(filename);
            oos = new ObjectOutputStream(fos);
            //oos.writeObject(Player.getSerialVersionUID());
            oos.writeObject(player);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //*/

        ///*
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(filename);
            ois = new ObjectInputStream(fis);
            //Long UID = (Long) ois.readObject();
            Player player = (Player) ois.readObject();
            //System.out.println("UID: " + UID);
            System.out.println(player);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //*/
    }
}
