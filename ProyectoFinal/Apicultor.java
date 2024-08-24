
import java.util.ArrayList;
import java.util.List;

public class Apicultor {
    private String nombre;
    private String apellido;
    private String telefono;
    private List<Colmena> colmenasAsignadas;

    public Apicultor(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.colmenasAsignadas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public List<Colmena> getColmenasAsignadas() { return colmenasAsignadas; }

    public void asignarColmena(Colmena colmena) {
        colmenasAsignadas.add(colmena);
    }
}
