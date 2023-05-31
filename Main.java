// dag 2 3 van de 3
import java.util.Scanner;
// import java.util.Random;


// public class Main {
//     public static void main(String[] args) {
        // System.out.println("Wat is je naam? ");
        // Scanner input = new Scanner(System.in);
        // String naam = input.nextLine();
        // System.out.println("Bread is ready.");
        // System.out.println("Who's the bread for?");
        // System.out.println(naam);
        // System.out.println("Noted: " + naam + " got bread.");
        // input.close();

        
    // Random random = new Random();
    // boolean lichtAan = random.nextBoolean();
    // lamp lamp1 = new lamp ();

    // if (lamp1.lichtAan= true) {
    //     System.out.println("het licht is aan");
    // }else {
    //     System.out.println("het is niet aan.");
    // }
    // }



    public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welke dag van de week is het? ");
        String weekdag = input.next().toLowerCase();
        int dagnummer;
        input.close();
    
        if (weekdag.equals("maandag")) {
            dagnummer = 0;
            System.out.println("het is maandag, dag: " + dagnummer);
        }
        else if (weekdag.equals("dinsdag")) {
            dagnummer = 1;
            System.out.println("het is dinsdag, dag: " + dagnummer);
        }
        else if (weekdag.equals("woensdag")) {
            dagnummer = 2;
            System.out.println("het is woensdag, dag: " + dagnummer);
        }
        else if (weekdag.equals("donderdag")) {
            dagnummer = 3;
            System.out.println("het is donderdag, dag: " + dagnummer);
        }
        else if (weekdag.equals("vrijdag")) {
            dagnummer = 4;
            System.out.println("het is vrijdag, dag: " + dagnummer);
        }
        else if (weekdag.equals("zaterdag")) {
            dagnummer = 5;
            System.out.println("het is zaterdag, dag: " + dagnummer);
        }
        else if (weekdag.equals("zondag")) {
            dagnummer = 6;
            System.out.println("het is zondag, dag: " + dagnummer);
        }
        else {
                    System.out.println("dit is geen geldige dag!");
        }
        }
    
    
    


}
