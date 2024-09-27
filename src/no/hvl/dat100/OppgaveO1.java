package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn Inntekt: ");

        double inntekt = input.nextDouble();
        double trinnskatt1 = TrinnskattKal(inntekt);
        System.out.println("Trinnskatt: " + trinnskatt1 + " kr");
    }

    public static double TrinnskattKal(double inntekt) {
        if (inntekt <= 0) {
            return 0;
        } else if (inntekt <= 208050) {
            return 0;
            
        } else if (inntekt <= 292850) {
            return (inntekt - 208050) * 0.017;
            
        } else if (inntekt <= 670000) {
            return (inntekt - 292850) * 0.04;
            
        } else if (inntekt <= 937900) {
            return (inntekt - 670000) * 0.136;
         
        } else if (inntekt <= 1350000) {
            return (inntekt - 937900) * 0.166;
            
        } else {
            return (inntekt - 1350001) * 0.176;
        }
    }
}