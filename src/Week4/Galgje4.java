package Week4;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Bennie Helsen on 16/10/2015.
 */
public class Galgje4 {
    public static void main(String[] args) {
        final String HANGMAN =
                "-----\n" +
                        "|    |\n" +
                        "|    O\n" +
                        "|   /|\\\n" +
                        "|    |\n" +
                        "|   / \\\n" +
                        "|\n" +
                        "-----";
        String woord;
        String gok;
        char letter;

        int randomPositie;
        int teller = 0;
        final int AANTALGOKKEN = 5;

        StringBuilder zoekString = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Nakijken of woord minimum 5 en maximum 10 letters bedraagt
        do  {
            System.out.print("Geef een woord (min 5 letters | max 10 letters): ");
            woord = scanner.next();
        } while (woord.length() < 5 || woord.length() > 10);

        // Spatie van 10 lijnen
        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }

        // Random letter uit te zoeken woord kiezen
        randomPositie = random.nextInt(woord.length());
        letter = woord.charAt(randomPositie);


        for (int i = 0; i < woord.length(); i++) {
            if (i == randomPositie) {
                zoekString.append(letter);
            } else {
                zoekString.append(".");
            }
        }

        System.out.printf("Het te zoeken woord:\t %s\n", zoekString);

        // Blijven gokken tot woord gevonden is of tot je galgje hebt
        do {
            System.out.print("Doe een gok: ");
            gok = scanner.next();

            teller++;

            if (!gok.equals(woord)) {
                for (int i = 0; i < woord.length(); i++) {
                    for (int j = 0; j < gok.length(); j++) {
                        if (gok.charAt(j) == woord.charAt(i)) {
                            letter = woord.charAt(i);
                            zoekString.replace(i,i+1, String.valueOf(letter));
                            break;
                        }
                    }
                }

                System.out.println(zoekString);
                System.out.println(HANGMAN.substring(0,teller*10));

                if (teller == AANTALGOKKEN) {
                    System.out.println("U hebt het niet gevonden! Het woord was: " + woord);
                    return;
                }
            } else {
                System.out.println("Proficiat, u hebt het geraden in " + teller + " stappen");
                return;
            }

        } while (true);
    }
}