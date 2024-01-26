package herencia;

public class Herencia {

    public static void main(String[] args) {
        
        System.out.println("*** CONDUCTOR ***\n");
        Chofer chofer1 = new Chofer(35, "Alex", "B1");
        System.out.println("Datos del conductor: " + chofer1.toString());
        
        System.out.println("\n**** TAXISTA ****");
        Taxista t1 = new Taxista(25, "Maria", "C1", "751270");
        System.out.println("Datos del taxista: " + t1.toString());
    }
    
}
