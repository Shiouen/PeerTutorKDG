package Week3;

import java.util.Scanner;

/**
 * Created by Admin on 9-10-2015.
 */
public class FactuurOpstellen {

    public static void main(String[] args) {



        //region Variabelen
        final double PRIJS_EEN = 10;
        final double PRIJS_TWEE = 20;
        final double PRIJS_DRIE = 30;
        final double PRIJS_VIER = 40;
        final String OMSCHRIJVING_EEN = "Laserpen";
        final String OMSCHRIJVING_TWEE = "Computermuis";
        final String OMSCHRIJVING_DRIE = "Toetsenbord";
        final String OMSCHRIJVING_VIER = "Rekenmachine";


        boolean stopped = false;
        boolean correctInput = false;
        int artikelkeuze = 0;
        int aantalartikkels;
        double totaalprijs = 0;
        String omschrijving = "";
        String voortgaan;
        double eenheidsprijs = 0;

        Scanner scanner = new Scanner(System.in);
        //endregion

        System.out.println("Opstellen factuur.");
        while (!stopped) {

            while (!correctInput) {

                System.out.print("Geef het artikelnummer (1...4): ");
                artikelkeuze = scanner.nextInt();

                if (artikelkeuze == 1 || artikelkeuze == 2 || artikelkeuze == 3 || artikelkeuze == 4) {
                    correctInput = true;
                }
            }

                switch (artikelkeuze) {
                    case 1:
                        omschrijving = OMSCHRIJVING_EEN;
                        eenheidsprijs = PRIJS_EEN;
                        break;
                    case 2:
                        omschrijving = OMSCHRIJVING_TWEE;
                        eenheidsprijs = PRIJS_TWEE;
                        break;
                    case 3:
                        omschrijving = OMSCHRIJVING_DRIE;
                        eenheidsprijs = PRIJS_DRIE;
                        break;
                    case 4:
                        omschrijving = OMSCHRIJVING_VIER;
                        eenheidsprijs = PRIJS_VIER;
                        break;
                }

                System.out.print("Geef het aantal stuks: ");
                aantalartikkels = scanner.nextInt();

                double totaal = aantalartikkels * eenheidsprijs;
                totaalprijs += totaal;


                System.out.println(omschrijving + " - aantal: " + aantalartikkels + " - eenheidsprijs: €" + eenheidsprijs
                        + " - totaal: €" + totaal);

                System.out.println("Nog een artikel? (j/n): ");
                voortgaan = scanner.next();
                if (voortgaan.equals("n")) {
                    stopped = true;

                } correctInput = false;


            }
            double btw = totaalprijs / 100 * 21;
            System.out.println("Te betalen: €" + totaalprijs);
            System.out.println("Netto totaal: €" + (totaalprijs - btw));
            System.out.println("BTW 21%: €" + btw);

            System.out.println("\nFactuur\n");
            System.out.println("Omschrijving\tAantal\tEenheidsprijs\tTotaal\n");



        }


    }


