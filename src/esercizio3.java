import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        es3();
    }

    public static void es3() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una parola (o ':q' per uscire):");
            String stringa = scanner.nextLine();

            // Esci se l'utente inserisce ":q"
            if (stringa.equals(":q")) {
                break;
            }

            // Suddividi la stringa in caratteri e uniscili con una virgola
            String[] array = stringa.split("");
            String risultato = String.join(",", array);

            // Stampa il risultato
            System.out.println("Stringa suddivisa: " + risultato);
        }

        scanner.close();
    }
}
