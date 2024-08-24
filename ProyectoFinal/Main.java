import java.util.List;

public class Main {

    public static void main(String[] args) {
        GestorDeColmenas gestor = new GestorDeColmenas();

        AbejaReina abejaReina = new AbejaReina(3, 80.0, "Saludable");
        Colmena colmena = new Colmena("C001", "Ubicación1", "Saludable", 10000, 50.5, abejaReina);

        gestor.agregarColmena(colmena);

        List<Colmena> colmenasSaludables = gestor.obtenerColmenasSaludables();
        colmenasSaludables.forEach(c -> System.out.println("Colmena ID: " + c.getId() + ", Salud: " + c.getEstadoSalud()));
    }
}


