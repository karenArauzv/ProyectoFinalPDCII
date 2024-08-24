import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorDeColmenas {
    private List<Colmena> colmenas;

    public GestorDeColmenas() {
        this.colmenas = new ArrayList<>();
    }

    public void agregarColmena(Colmena colmena) {
        colmenas.add(colmena);
    }

    public void actualizarColmena(Colmena colmena) {
    }

    public void registrarInspeccion(Inspeccion inspeccion, Colmena colmena) {
        colmena.actualizarEstadoSalud(inspeccion.getResultado());
    }

    public List<Colmena> obtenerColmenasSaludables() {
        return colmenas.stream()
                .filter(colmena -> colmena.getEstadoSalud().equals("Saludable"))
                .collect(Collectors.toList());
    }
}
