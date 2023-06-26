package workshop;

public class EmbarcacionMakai {

    private Embarcacion[] embarcaciones;
    private int capacidad;
    private int contador = 0;

    public EmbarcacionMakai(int capacidad) {
        this.capacidad = capacidad;
        embarcaciones = new Embarcacion[capacidad];
    }

    public void agregarEmbarcacion(Embarcacion embarcacion) {
        if (contador < capacidad) {
            embarcaciones [contador] = embarcacion;
            contador++;
            System.out.println("Embarcacion " + contador + " agregada correctamente");
        }
        else
            System.out.println("Embarcaciones Makai ya alcanzo la capacidad maxima de embarcaciones");
    }

}
