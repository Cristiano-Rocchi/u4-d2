import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        contoAllaRovescia();

    }

    public static void contoAllaRovescia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero fino a 10");
        int numero = Integer.parseInt(scanner.nextLine());
        if (numero > 10) {
            System.out.println("Il numero deve essere minore o uguale a 10.");
        } else if (numero < 0) {
            System.out.println("Il numero deve essere maggiore o uguale a 0.");
        } else {
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}
