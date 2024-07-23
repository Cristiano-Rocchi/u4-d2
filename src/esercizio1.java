import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un anno:");
        int anno = Integer.parseInt(scanner.nextLine());
        if (annoBisestile(anno) == true) {
            System.out.println("l'anno è bisestile");

        } else {
            System.out.println("l'anno non è bisestile");
        }
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

    public static void calcoloBisestile() {

    }

    public static boolean annoBisestile(int anno) {

        if (anno % 400 == 0 || (anno % 4 == 0 && !(anno % 100 == 0))) {
            return true;
        } else {
            return false;
        }

    }
}

