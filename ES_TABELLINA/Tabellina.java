/*
Scrivere un programma che visualizzi le tabelline di una serie di numeri forniti dall'utente in maniera matriciale. Numero minimo = 1, numero massimo = 50.
Creare una classe tabellina per lo scopo.
Deve essere incluso un commento riportante la soluzione progettata.

Risoluzione:
Per creare una tabella bisogna utilizzare 2 cicli for:
- Il primo per andare a capo ad ogni riga
- Il secondo, che è annidato al primo, crea le righe moltiplicando i due indici
Li ho fatti ripetere fino a 50 volte partendo da 1 utilizzando le costanti MIN e MAX.
Alla fine di scrittura di ogni riga ho messo un System.out.println() per andare a capo.
Inoltre, ho implementato un controllo che verifica la lunghezza della stringa del numero
(massimo 4 caratteri) e aggiunge gli spazi in modo da intabulare meglio i numeri.
*/

public class Tabellina {
    public static void main(String[] args) {
        // Costanti del primo numero e dell'ultimo numero
        final int MIN = 1, MAX = 50;

        // Ciclo for che manda a capo
        for (int i = MIN; i <= MAX; i++) {
            // Ciclo for che crea le righe
            for (int j = MIN; j <= MAX; j++) {
                // Controllo della quantità di caratteri nel numero; La lunghezza del numero e
                // l'aggiunta degli spazi è inversamente proporzionale.
                if (String.valueOf(i * j).length() == 1) {
                    System.out.print(i * j + "    ");
                } else if (String.valueOf(i * j).length() == 2) {
                    System.out.print(i * j + "   ");
                } else if (String.valueOf(i * j).length() == 3) {
                    System.out.print(i * j + "  ");
                } else if (String.valueOf(i * j).length() == 4) {
                    System.out.print(i * j + " ");
                } else {
                    System.out.print(i * j);
                }
            }
            System.out.print("\n"); // Nuova riga
        }
    }
}
