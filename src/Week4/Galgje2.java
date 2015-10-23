package Week4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by benniehelsen on 16/10/15.
 */
public class Galgje2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String willekeurigWoord;

        do {
            System.out.println("Geef een woord (maximaal 10 letters): ");
            willekeurigWoord = input.next();
        }
        while(willekeurigWoord.length() < 5 || willekeurigWoord.length() > 10);

        StringBuilder puntjes = new StringBuilder("Het te zoeken woord: \t");
        Random letterGenerator = new Random();
        int index = letterGenerator.nextInt(willekeurigWoord.length());
        for(int i = 0; i < willekeurigWoord.length(); i++) {
            if(index == i) puntjes.append(willekeurigWoord.charAt(i));
            else puntjes.append(".");
        }
        System.out.println(puntjes.toString());

        System.out.println("Doe een gok: ");
        String gok = input.next();
        if(gok.equalsIgnoreCase(willekeurigWoord)) {
            System.out.println("Proficiat, u hebt het geraden in 1 keer!");
            return;
        }

        int counter;
        for(int j = 0; j < 4; j++) {
            counter = 0;
            for(int k = 0; k < gok.length(); k++) {
                if(willekeurigWoord.contains(gok.substring(k,k+1))) {
                    counter++;
                }
            }
            System.out.println("Er zijn " + counter + " letters juist...");

            System.out.println("Fout! Doe een gok: ");
            gok = input.next();
            if(gok.equalsIgnoreCase(willekeurigWoord)) {
                System.out.println("Proficiat, u hebt het geraden in " + (j+2) + " stappen!");
                return;
            }
        }
    }
}
