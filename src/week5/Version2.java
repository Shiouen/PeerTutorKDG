package week5;

import java.util.Random;
import java.util.Scanner;

import week5.utility.Utilities;

public class Version2 {
    public static void main(String[] args) {
        int keywordIndex = 0;
        Boolean running = true;
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
        String[] keywords = {
                "aanloggen", "traag", "scherm", "hangt", "kleuren", "trager",
                "geluid", "vooruit", "niet", "gisteren", "weekend", "geen idee",
                "oplossing", "geen", "zeker"
        };
        String[] keywordSentences = {
                "Probeer opnieuw aan te loggen, lost dat je probleem op?",
                "Herstarten van het systeem kan vele snelheidsproblemen oplossen. Heb je dat al geprobeerd?",
                "Misschien is er iets mis met de video adapter?",
                "Je kan best nog even wachten, mogelijk lost het probleem zichzelf op.",
                "Heb je onlangs nieuwe videosoftware geïnstalleerd?",
                "Is er nog voldoende ruimte vrij op het toestel?",
                "Het volume staat toch juist he?",
                "Mogelijk een probleem met één van de systeemdrivers.",
                "Pas op, soms wel hoor.",
                "En eergisteren?",
                "In de week werken die dingen meestal vlotter...",
                "Niet wanhopen, we vinden samen wel een oplossing.",
                "Ik zal het wel oplossen, geef jij mij gewoon wat meer info.",
                "Echt geen?",
                "Ik ken dat 'zeker', uiteindelijk blijkt het toch niet!"
        };

        String question;
        System.out.println(intro);


        while (running) {
            question = scanner.next();

            // end program in case of 'stop'
            if (question.equals("stop")) {
                running = false;
                return;
            }

            // get index of keyword in keyword array, returns -1 if N/A
            keywordIndex = Utilities.getContainedKeywordIndex(question, keywords);

            if (keywordIndex != -1) {
                System.out.println(keywordSentences[keywordIndex]);
            } else {
                System.out.println(sentences[r.nextInt(sentences.length)]);
            }
        }
    }
}
