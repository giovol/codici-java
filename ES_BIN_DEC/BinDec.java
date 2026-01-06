import java.util.Scanner;

public class BinDec {
    public static void main(String args[]) {
        Scanner tastiera = new Scanner(System.in);
        String input = "";
        boolean numeroErrato = true;
        do {
            System.out.print("Inserire un numero binario: ");
            input = tastiera.nextLine();
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != '0' && input.charAt(i) != '1') {
                    numeroErrato = true;
                    break; // Interrompo il for per smettere di controllare
                } else {
                    numeroErrato = false;
                }
            }
            if (numeroErrato) {
                System.out.println("Errore: il numero inserito non è un numero binario");
            }
        } while (numeroErrato);
        tastiera.close();

        int numeroConvertito = 0;
        int j = input.length() - 1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                numeroConvertito += Math.pow(2, j);
            }
            j--;
        }
        System.out.println("Il numero convertito in decimale è: " + numeroConvertito);
    }
}