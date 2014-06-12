import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStream {
    public Object deserialize(String filename) {
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(filename);
            ois = new ObjectInputStream(fis);
            int versionNumber = ois.readInt();
            switch (versionNumber) {
                case 1:
                    System.out.println("case 1");
                    return ois.readObject();
                case 2:
                    System.out.println("case 2");
                    Migrate migrate = new Migrate();
                    return migrate.perform(ois.readObject());
                default:
                    System.out.println("default");
                    return ois.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
