
import java.util.regex.Pattern;

public class Validaciones {

    public static boolean validarIDColmena(String id) {
        String regex = "^[A-Za-z0-9]{4,10}$";
        return Pattern.matches(regex, id);
    }

    public static boolean validarNombreApicultor(String nombre) {
        String regex = "^[A-Za-z\\s]+$";
        return Pattern.matches(regex, nombre);
    }
}
