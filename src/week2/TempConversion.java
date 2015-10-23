package week2;

import java.util.Scanner;

public class TempConversion {

    // Main method to run the program
    public static void main(String[] args) {
        int choice;
        double value;
        double output;

        boolean running = true;

        System.out.println("Conversie graden Celsius - Fahrenheit");
        System.out.println("=====================================");

        while (running) {
            System.out.println("Welke conversie wens je te doen?");
            System.out.println("\t1) \u00B0C naar \u00B0F ");
            System.out.println("\t2) \u00B0F naar \u00B0C ");
            System.out.print("Uw keuze: ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            // Celcius to Fahrenheit
            if  (choice == 1) {
                System.out.print("Geef de waarde in \u00B0C: ");
                value = scanner.nextDouble();

                output = (value * 1.8) + 32;

                System.out.println(value + " \u00B0C = " + output + " \u00B0F");
            }

            // Fahrenheit to Celcius
            if (choice == 2) {
                System.out.print("Geef de waarde in \u00B0F: ");
                value = scanner.nextDouble();

                output = (value - 32) / 1.8;

                System.out.println(value + " \u00B0F = " + output + " \u00B0C");
            }

            // End the program
            if (choice == 0) {
                running = false;
            }
        }

        System.out.println("Het programma wordt nu gestopt. Tot ziens!");
    }
}
