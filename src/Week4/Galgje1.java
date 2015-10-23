package Week4;

import java.util.Scanner;


public class Galgje1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String willekeurigWoord;

        do {
            System.out.println("Geef een woord (maximaal 10 letters): ");
            willekeurigWoord = input.next();
        }
        while(willekeurigWoord.length() < 5 || willekeurigWoord.length() > 10);

        // Spatie van 10 lijnen
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }

        StringBuilder puntjes = new StringBuilder("Het te zoeken woord: \t");
        for(int i = 0; i < willekeurigWoord.length(); i++) {
            puntjes.append(".");
        }
        System.out.println(puntjes.toString());

        System.out.println("Doe een gok: ");
        if(input.next().equalsIgnoreCase(willekeurigWoord)) {
            System.out.println("Proficiat, u hebt het geraden in 1 keer!");
            return;
        }
        for(int j = 0; j < 4; j++) {
            System.out.println("Fout! Doe een gok: ");
            if(input.next().equalsIgnoreCase(willekeurigWoord)) {
                System.out.println("Proficiat, u hebt het geraden in " + (j+2) + " stappen!");
                return;
            }
        }

    }
}
