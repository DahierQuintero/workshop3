package workshop;

import profundizacionJava.ejercicioPooInterface.tiendaLibros.Vendible;

public class Main {

    public static void main(String[] args) {

        EmbarcacionMakai embarcacionMakai = new EmbarcacionMakai(8);

        Capitan capitan1 = new Capitan("Dilan","Quintero","DQ3092");
        Capitan capitan2 = new Capitan("Luisa","Guaqueta","LG3092");
        Capitan capitan3 = new Capitan("Laura","Perez","LP3092");
        Capitan capitan4 = new Capitan("Mariany","Lopez","ML3092");

        Yate yate1 = new Yate(capitan1,500000,2023,15,12);
        Yate yate2 = new Yate(capitan2,420000,2018,12,6);
        Yate yate3 = new Yate(capitan3,480000,2021,11,10);
        Yate yate4 = new Yate(capitan4,400000,2016,10,5);

        Velero velero1 = new Velero(capitan1,300000,2023,15,5);
        Velero velero2 = new Velero(capitan2,250000,2018,12,3);
        Velero velero3 = new Velero(capitan3,220000,2022,18,2);
        Velero velero4 = new Velero(capitan4,280000,2018,10,4);

        Embarcacion velero5 = new Velero(capitan4,280000,2018,10,4);

        embarcacionMakai.agregarEmbarcacion(yate1);
        embarcacionMakai.agregarEmbarcacion(yate2);
        embarcacionMakai.agregarEmbarcacion(yate3);
        embarcacionMakai.agregarEmbarcacion(yate4);
        embarcacionMakai.agregarEmbarcacion(velero1);
        embarcacionMakai.agregarEmbarcacion(velero2);
        embarcacionMakai.agregarEmbarcacion(velero3);
        embarcacionMakai.agregarEmbarcacion(velero4);
        System.out.println();

        embarcacionMakai.agregarEmbarcacion(velero5);

        System.out.println("\nInformacion del velero 1:");
        velero1.evaluarVelero();
        System.out.println("\nInformacion del velero 2:");
        velero2.evaluarVelero();

        System.out.println("\nValor del alquiler del yate 1:");
        yate1.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del yate 2:");
        yate2.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del yate 3:");
        yate3.calcularMontoAlquiler();
        System.out.println("\nValor del alquiler del yate 4:");
        yate4.calcularMontoAlquiler();

        System.out.println();
        yate1.comprarYate();

        System.out.println();
        yate2.comprarYate();
    }
}
