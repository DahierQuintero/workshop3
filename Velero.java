package workshop;

public class Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public void evaluarVelero() {
        if (cantidadMastiles > 4)
            System.out.println("El velero es grande");
        else
            System.out.println("El velero es pequenio");
    }
}
