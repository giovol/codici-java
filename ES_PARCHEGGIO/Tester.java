package ES_PARCHEGGIO;

import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        Parcheggio parcheggio = new Parcheggio(5, false);
        Custode custode = new Custode(parcheggio);
        Random rand = new Random();
        Cliente cliente0 = new Cliente(rand.nextInt(9000) + 1000, 1);
        Cliente cliente1 = new Cliente(rand.nextInt(9000) + 1000, 2);
        Cliente cliente2 = new Cliente(rand.nextInt(9000) + 1000, 3);
        Cliente cliente3 = new Cliente(rand.nextInt(9000) + 1000, 4);
        Cliente cliente4 = new Cliente(rand.nextInt(9000) + 1000, 5);
        Cliente cliente5 = new Cliente(rand.nextInt(9000) + 1000, 6);
        Cliente cliente6 = new Cliente(rand.nextInt(9000) + 1000, 7);
        Cliente cliente7 = new Cliente(rand.nextInt(9000) + 1000, 8);
        Cliente cliente8 = new Cliente(rand.nextInt(9000) + 1000, 9);
        Cliente cliente9 = new Cliente(rand.nextInt(9000) + 1000, 10);
        custode.apriParcheggioSeNonAperto();
        custode.parcheggiaCliente(cliente0);
        custode.parcheggiaCliente(cliente1);
        custode.parcheggiaCliente(cliente2);
        custode.parcheggiaCliente(cliente3);
        custode.parcheggiaCliente(cliente4);
        custode.parcheggiaCliente(cliente5);
        custode.parcheggiaCliente(cliente6);
        custode.parcheggiaCliente(cliente7);
        custode.parcheggiaCliente(cliente8);
        custode.parcheggiaCliente(cliente9);
        custode.chiudiParcheggioSeNonChiuso();

    }
}
