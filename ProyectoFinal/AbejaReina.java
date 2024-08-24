public class AbejaReina {
    private int edad;
    private double productividad;
    private String estadoSalud;

    public AbejaReina(int edad, double productividad, String estadoSalud) {
        this.edad = edad;
        this.productividad = productividad;
        this.estadoSalud = estadoSalud;
    }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public double getProductividad() { return productividad; }
    public void setProductividad(double productividad) { this.productividad = productividad; }
    public String getEstadoSalud() { return estadoSalud; }
    public void setEstadoSalud(String estadoSalud) { this.estadoSalud = estadoSalud; }
    
    public void incrementarProductividad(double incremento) {
        this.productividad += incremento;
    }
}
