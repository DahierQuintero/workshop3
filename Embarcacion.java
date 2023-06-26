package workshop;

public class Embarcacion {

    private Capitan capitan;
    private double precioBase;
    private final double VALOR_ADICIONAL = 20000;
    private int anioFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, int anioFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public void calcularMontoAlquiler() {
        if (anioFabricacion > 2020)
            System.out.println("El monto del alquiler es: " + (precioBase + VALOR_ADICIONAL));
        else
            System.out.println("El monto del alquiler es: " + precioBase);
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
}
