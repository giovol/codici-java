import java.util.Scanner;

/**
 * Convertitore di un numero binario in un numero decimale.
 * Questo programma chiede all'utente di scrivere un numero in binario positivo
 * e intero e lo convertirà in decimale.
 * Inoltre questo programma controlla se viene digitato un numero binario
 * corretto e in caso contrario mostrerà un messaggio di errore.
 */
public class BinDec {
    /**
     * Punto di inizio del programma. Gli argomenti da linea di comando non hanno
     * effetto sull'esecuzione del programma.
     */
    public static void main(String args[]) {
        // Assegnazione e controllo dell'input
        Scanner tastiera = new Scanner(System.in);
        String input = "";
        boolean numeroErrato = true;
        do {
            // Assegnazione dell'input
            System.out.print("Inserire un numero binario intero e positivo: ");
            input = tastiera.nextLine();

            // Controllo se il numero è binario
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                    numeroErrato = true;
                    break; // Interrompo il for per smettere di controllare
                } else {
                    numeroErrato = false;
                }
            }

            // Messaggio d'errore se il numero non è corretto.
            if (numeroErrato) {
                System.out.println("Errore: il numero inserito non è un numero binario intero positivo");
            }
        } while (numeroErrato);
        tastiera.close();

        // Conversione
        int numeroConvertito = 0;
        int j = input.length() - 1; // Il massimo esponente è la lunghezza del numero - 1
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                numeroConvertito += Math.pow(2, j);
            }
            j--;
        }

        // Stampa del numero convertito
        System.out.println("Il numero convertito in decimale è: " + numeroConvertito);
    }
}