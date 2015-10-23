package week2;

import java.util.Scanner;

public class TableTempConversion {

    // Main method to run the program
    public static void main(String[] args) {
        double begin;
        double end;
        double steps;

        boolean running = true;

        System.out.println("Conversietabel \u00B0C naar \u00B0F");
        System.out.println("=====================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geef de begintemperatuur in \u00B0C: ");
        begin = scanner.nextInt();

        System.out.print("Geef de eindtemperatuur in \u00B0C: ");
        end = scanner.nextInt();

        if (begin > end) {
            System.out.println("De begintemperatuur moet kleiner zijn dan de eindtemperatuur!");
            running = false;
        }

        double value;

        if (running) {
            System.out.print("Geef de stapwaarde: ");
            steps = scanner.nextInt();

            int i = (int) begin;
            while (i <= end) {
                value = (i * 1.8) + 32;
                System.out.println(i + "\u00B0C = " + value + "\u00B0F");
                i += steps;
            }

            System.out.println();
            System.out.println("===============");
            System.out.printf("|%6s|%-6s|%n", "\u00B0C  ", "  \u00B0F");
            System.out.println("---------------");

            i = (int) begin;
            while (i <= end) {
                value = (i * 1.8) + 32;
                System.out.printf("|%6s|%-6s|%n", i + "  ", " " + value);
                i += steps;
            }

            System.out.println("===============");
        }
    }
}
