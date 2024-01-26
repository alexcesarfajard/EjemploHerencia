package herencia;

public class Chofer extends Persona {
    
    private String licencia;

    public Chofer() {
        this.licencia = "";
    }

    public Chofer(int edad, String nombre, String licencia) {
        super(edad, nombre);
        this.licencia = licencia;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nLicencia: " + this.getLicencia();
    }
    
    
}
