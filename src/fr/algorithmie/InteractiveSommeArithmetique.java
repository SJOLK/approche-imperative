package fr.algorithmie;

import java.util.Scanner;

public class InteractiveSommeArithmetique {

    private void start() {
        int nb = demandeNombreUtilisateur();
        int somme = calculerSommeArithmetique(nb);
        afficherSommeArithmetique(somme);
        quitterOuContinuer();
    }

    private int demandeNombreUtilisateur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier : ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Veuillez saisir un nombre entier valide.");
            return demandeNombreUtilisateur();
        }
    }

    private int calculerSommeArithmetique(int nb) {
        if (nb > 0) {
            int somme = 0;
            for (int i = 0; i <= nb; i++) {
                somme += i;
            }
            return somme;
        } else {
            System.out.println("Veuillez saisir un nombre entier positif.");
            return calculerSommeArithmetique(demandeNombreUtilisateur());
        }
    }

    private void afficherSommeArithmetique(int somme) {
        System.out.println("La somme arithmétique est : " + somme);
    }

    private void quitterOuContinuer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez-vous continuer ? (O/N)");
        String response = sc.next();
        if (response.equalsIgnoreCase("O")) {
            int nb = demandeNombreUtilisateur();
            int somme = calculerSommeArithmetique(nb);
            afficherSommeArithmetique(somme);
            quitterOuContinuer();
        } else if (response.equalsIgnoreCase("N")) {
            System.out.println("Au revoir !");
        } else {
            System.out.println("Veuillez saisir une réponse valide.");
            quitterOuContinuer();
        }
    }

    public static void main(String[] args) {
        InteractiveSommeArithmetique interactiveSommeArithmetique = new InteractiveSommeArithmetique();
        interactiveSommeArithmetique.start();
    }


}
