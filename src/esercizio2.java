import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        numeriInLettere();

    }

    public static void numeriInLettere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci un numero da 1 a 3");
        int numero = Integer.parseInt(scanner.nextLine());
        switch (numero) {
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("errore il numero è superiore a 3");
                break;

        }

    }


}
