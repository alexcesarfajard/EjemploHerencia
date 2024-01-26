package herencia;

public class Taxista extends Chofer{
    private String unidad;

    public Taxista() {
        this.unidad = "";
    }

    public Taxista(int edad, String nombre, String licencia, String unidad) {
        super(edad, nombre, licencia);
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public String toString(){
        return super.toString() + "\nUnidad: " + this.getUnidad();
    }
}
