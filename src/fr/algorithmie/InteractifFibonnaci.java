package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonnaci {

    private int demandeChoisirRangN() {
        System.out.println("Veuillez saisir un rang n pour calculer le nombre de Fibonacci : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Veuillez saisir un nombre valide.");
            return demandeChoisirRangN();
        }
    }

    private double calculerFibonnaci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculerFibonnaci(n - 1) + calculerFibonnaci(n - 2);
        }
    }

    private void afficherResultat(double resultat) {
        System.out.println("Le résultat est : " + resultat);
    }

    private void start() {
        int n = demandeChoisirRangN();
        double resultat = calculerFibonnaci(n);
        afficherResultat(resultat);
    }


    public static void main(String[] args) {
        InteractifFibonnaci interactifFibonnaci = new InteractifFibonnaci();
        interactifFibonnaci.start();
    }


}
