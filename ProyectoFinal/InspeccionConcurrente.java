public class InspeccionConcurrente extends Thread {
    private Colmena colmena;

    public InspeccionConcurrente(Colmena colmena) {
        this.colmena = colmena;
    }

    @Override
    public void run() {
        System.out.println("Inspeccionando colmena: " + colmena.getId());
    }
}
