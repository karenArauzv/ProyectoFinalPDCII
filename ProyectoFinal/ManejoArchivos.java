
import java.io.*;
import java.util.List;

public class ManejoArchivos {

    public static void guardarColmenas(List<Colmena> colmenas, String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(colmenas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Colmena> cargarColmenas(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (List<Colmena>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
