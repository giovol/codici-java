
/*
Realizzare un semplice tester e svolgere le seguenti operazioni:
✓ Creare un oggetto di tipo Piscina con dati da tastiera; visualizzare a schermo le informazioni
della piscina (stato dell’oggetto, volume, superficie)
✓ Creare altre due piscine di dimensioni diverse e calcolare il costo totale per riempirle tutte.
*/
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        // Richiesta dei valori all'utente
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserire lunghezza piscina in metri: ");
        double lunghezza = tastiera.nextDouble();
        System.out.print("Inserire larghezza piscina in metri: ");
        double larghezza = tastiera.nextDouble();
        System.out.print("Inserire profondità piscina in metri: ");
        double profondita = tastiera.nextDouble();
        System.out.print("Inserire prezzo per 1l di acqua: ");
        double prezzo = tastiera.nextDouble();
        tastiera.close();

        // Inizializzazione della piscina dati i valori
        Piscina piscina1 = new Piscina(larghezza, lunghezza, profondita, 1);

        // Stampa dei valori della piscina1
        System.out.println(piscina1.toString());
        System.out.printf("Prezzo per riempire la piscina: € %.2f\n", piscina1.calcolaCostoRiempimento(prezzo));

        final Random rand = new Random();

        // Inizializzazione della piscina con valori casuali
        Piscina piscina2 = new Piscina(rand.nextDouble(11) + 10, rand.nextDouble(11) + 10, rand.nextDouble(2) + 1, 2);

        // Stampa dei valori della piscina2
        System.out.println(piscina2.toString());
        System.out.printf("Prezzo per riempire la piscina\n: € %.2f", piscina2.calcolaCostoRiempimento(prezzo));

        // Inizializzazione della piscina con valori casuali
        Piscina piscina3 = new Piscina(rand.nextDouble(11) + 10, rand.nextDouble(11) + 10, rand.nextDouble(2) + 1, 3);

        // Stampa dei valori della piscina2
        System.out.println(piscina3.toString());
        System.out.printf("Prezzo per riempire la piscina: € %.2f\n", piscina3.calcolaCostoRiempimento(prezzo));
    }
}
