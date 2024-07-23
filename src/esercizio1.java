import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        annoBisestile();
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


    public static void annoBisestile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un anno:");
        int anno = Integer.parseInt(scanner.nextLine());
        if (anno % 400 == 0 || (anno % 4 == 0 && !(anno % 100 == 0))) {
            System.out.println("lanno è bisestile");
        } else {
            System.out.println("l'anno non è bisestile");
        }

    }
}

