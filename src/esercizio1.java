import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola:");
        String stringaUtente = scanner.nextLine();

        if (pariDispari(stringaUtente)) {
            System.out.println("pari");
        } else {
            System.out.println("dispari");
        }

        System.out.println("Inserisci un anno:");
        int anno = Integer.parseInt(scanner.nextLine());

        if (annoBisestile(anno)) {
            System.out.println("L'anno è bisestile");
        } else {
            System.out.println("L'anno non è bisestile");
        }
    }

    public static boolean pariDispari(String stringa) {
        return stringa.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        return anno % 400 == 0 || (anno % 4 == 0 && anno % 100 != 0);
    }
}
