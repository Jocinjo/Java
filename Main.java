// dag 2 3 van de 3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wat is je naam? ");
        Scanner input = new Scanner(System.in);
        String naam = input.nextLine();
        System.out.println("Bread is ready.");
        System.out.println("Who's the bread for?");
        System.out.println(naam);
        System.out.println("Noted: " + naam + " got bread.");
        input.close();
    }
}

