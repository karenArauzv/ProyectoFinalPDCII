public class Colmena {
    private String id;
    private String ubicacion;
    private String estadoSalud;
    private int cantidadAbejas;
    private double produccionMiel; 
    private AbejaReina abejaReina;

    public Colmena(String id, String ubicacion, String estadoSalud, int cantidadAbejas, double produccionMiel, AbejaReina abejaReina) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estadoSalud = estadoSalud;
        this.cantidadAbejas = cantidadAbejas;
        this.produccionMiel = produccionMiel;
        this.abejaReina = abejaReina;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public String getEstadoSalud() { return estadoSalud; }
    public void setEstadoSalud(String estadoSalud) { this.estadoSalud = estadoSalud; }
    public int getCantidadAbejas() { return cantidadAbejas; }
    public void setCantidadAbejas(int cantidadAbejas) { this.cantidadAbejas = cantidadAbejas; }
    public double getProduccionMiel() { return produccionMiel; }
    public void setProduccionMiel(double produccionMiel) { this.produccionMiel = produccionMiel; }
    public AbejaReina getAbejaReina() { return abejaReina; }
    public void setAbejaReina(AbejaReina abejaReina) { this.abejaReina = abejaReina; }
    
    public void agregarProduccionMiel(double miel) {
        this.produccionMiel += miel;
    }
    
    public void actualizarEstadoSalud(String nuevoEstado) {
        this.estadoSalud = nuevoEstado;
    }
}
