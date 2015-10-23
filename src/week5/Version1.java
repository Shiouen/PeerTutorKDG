package week5;

import java.util.Random;
import java.util.Scanner;

public class Version1 {
    public static void main(String[] args) {
        boolean running = true;
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);

        String intro = "Hallo, ik ben je ICT Support Systeem, stel me een vraag " +
                "en ik geef je een oplossing! (type \"stop\" om te stoppen)";
        String[] sentences = {
                "Ok, probeer eerst al eens te herstarten",
                "Kan je het probleem eens herformuleren?",
                "En is dat al lang zo?",
                "Waarom heb je ons niet eerder gecontacteerd?",
                "Ik denk dat je dat zelf wel kan oplossen, niet?",
                "Die vraag heb ik nog niet vaak gehad!",
                "Sorry, ik was even bezig, kan je de vraag eens herhalen?",
                "Aha, gekend probleem, ik zoek het op en laat je iets weten.",
                "Sorry, daar heb ik niet direct een antwoord op. Wat nu?",
                "En dan?",
                "Dat zal wel, maar er zijn ergere dingen he.",
                "Hmm, die moet ik opzoeken. En wanneer deed dat zich juist voor?"
        };

        String question;
        System.out.println(intro);

        while (running) {
            question = scanner.next();

            switch (question) {
                case "stop":
                    running = false;
                    break;
                default:
                    System.out.println(sentences[r.nextInt(sentences.length)]);
            }
        }
    }
}
