package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

    private void start() {
        int nb = demandeNombreUtilisateur();
        int[] chiffresSuivants = calculerChiffresSuivants(nb);
        afficherChiffresSuivants(chiffresSuivants);
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

    private int[] calculerChiffresSuivants(int nb) {
        if (nb > 0) {
            int[] chiffresSuivants = new int[10];
            for (int i = 0; i < chiffresSuivants.length; i++) {
                chiffresSuivants[i] = nb + i + 1;
            }
            return chiffresSuivants;
        } else {
            System.out.println("Veuillez saisir un nombre entier positif.");
            return calculerChiffresSuivants(demandeNombreUtilisateur());
        }
    }

    private void afficherChiffresSuivants(int[] chiffresSuivants) {
        for (int i = 0; i < chiffresSuivants.length; i++) {
            System.out.println(chiffresSuivants[i]);
        }
    }

    private void quitterOuContinuer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez-vous continuer ? (O/N)");
        String response = sc.next();
        if (response.equalsIgnoreCase("O")) {
            int nb = demandeNombreUtilisateur();
            int[] chiffresSuivants = calculerChiffresSuivants(nb);
            afficherChiffresSuivants(chiffresSuivants);
            quitterOuContinuer();
        } else if (response.equalsIgnoreCase("N")) {
            System.out.println("Au revoir !");
        } else {
            System.out.println("Veuillez saisir une réponse valide.");
            quitterOuContinuer();
        }
    }

    public static void main(String[] args) {
        InteractifChiffresSuivants interactifChiffresSuivants = new InteractifChiffresSuivants();
        interactifChiffresSuivants.start();
    }
}
