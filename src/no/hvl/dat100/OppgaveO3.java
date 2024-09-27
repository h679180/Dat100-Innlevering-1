package no.hvl.dat100;

import java.util.Scanner;

public class OppgaveO3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv inn et heltall større enn null: ");
        
        int n = input.nextInt();
        if (n <= 0) {
            System.out.println("Du må skrive inn et heltall større enn 0!");
        } else {
            long resultat = FakultetKalkulator(n);
            System.out.println(n + "! = " + resultat);
        }
    }

    public static long FakultetKalkulator(int n) {
        if (n <= 1) {
            return 1;
        }

        long fakultet = 1;
        for (int i = 2; i <= n; i++) {
            fakultet *= i;
        }
        return fakultet;
    }
}
