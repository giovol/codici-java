import java.util.Scanner;

/**
 * Convertitore di un numero decimale (massimo 1023) in un numero binario.
 * Questo programma chiede all'utente di scrivere un numero in decimale positivo
 * e intero e lo convertirà in binario.
 * Inoltre questo programma controlla se viene digitato un numero decimale
 * positivo
 * minore o uguale a 1023 e in caso contrario mostrerà un messaggio di errore.
 */

public class DecBin {
    public static void main(String[] args) {
        // Assegnazione dell'input
        Scanner tastiera = new Scanner(System.in);
        int input = -1;
        do {
            System.out.print("Inserire un numero binario intero e positivo (massimo 1023): ");
            input = tastiera.nextInt();
            if (input > 1023 || input < 0) {
                System.out.println("Errore: è stato digitato un numero maggiore di 1023 o minore di 0.");
            }
        } while (input > 1023 || input < 0);
        tastiera.close();

        // Conversione
        int[] binario = new int[10]; // Numero massimo 1023 perché 1023 in binario equivale a 1111111111
        int quoziente = input;
        for (int i = binario.length - 1; i >= 0; i--) {
            binario[i] = quoziente % 2;
            quoziente /= 2;
        }

        // Stampa del numero in binario
        System.out.print("Il numero " + input + " in decimale equivale a ");
        for (int i = 0; i < binario.length; i++) { // Lettura dell'array
            System.out.print(binario[i]);
        }
        System.out.print(" in binario.");
    }
}
