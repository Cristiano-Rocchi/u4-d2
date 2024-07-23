import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        pariDispari();
    }

    public static void pariDispari() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola:");
        String stringaUtente = scanner.nextLine();

        if (stringaUtente.length() % 2 == 0) {
            System.out.println("il numero totale delle lettere è pari");


        } else {
            System.out.println("il numero totale delle lettere è dispari");
        }
    }
}

