package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn poengsum: ");
        
        try {
            int poengsum = input.nextInt();
            
            String karakter = KarakterKalkulering(poengsum);
            System.out.println("Karakteren er: " + karakter);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Ugyldig. Skrive inn et heltall.");
        }
    }

    public static String KarakterKalkulering(int poengsum) {
        if (poengsum < 0 || poengsum > 100) {
            return "Ugyldig poengsum";
        } else if (poengsum >= 90) {
            return "A";        
        } else if (poengsum >= 80) {
            return "B";           
        } else if (poengsum >= 60) {
            return "C";           
        } else if (poengsum >= 50) {
            return "D";           
        } else if (poengsum >= 40) {
            return "E";
        } else {
            return "F";
        }
    }
}

