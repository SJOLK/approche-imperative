package fr.algorithmie;

import java.util.Scanner;

public class InteractivePlusGrand {

    private void start() {
        int[] tab = demandeTableauNombreUtilisateur();
        int plusGrand = calculerPlusGrand(tab);
        afficherPlusGrand(plusGrand);
        quitterOuContinuer();
    }

    private int[] demandeTableauNombreUtilisateur() {
        int[] tab = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            boolean valideInput = false;
            while(!valideInput) {
                System.out.println("Veuillez saisir un nombre entier : ");
                if (sc.hasNextInt()) {
                    tab[i] = sc.nextInt();
                    valideInput = true;
                } else {
                    System.out.println("Veuillez saisir un nombre entier valide.");
                    sc.next();
                }
            }
        }
        return tab;
    }

    private int calculerPlusGrand(int[] tab) {
        int plusGrand = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i] > plusGrand) {
                plusGrand = tab[i];
            }
        }
        return plusGrand;
    }

    private void afficherPlusGrand(int plusGrand) {
        System.out.println("Le plus grand nombre est : " + plusGrand);
    }

    private void quitterOuContinuer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voulez-vous continuer ? (O/N)");
        String response = sc.next();
        if (response.equalsIgnoreCase("O")) {
            int[] tab = demandeTableauNombreUtilisateur();
            int plusGrand = calculerPlusGrand(tab);
            afficherPlusGrand(plusGrand);
            quitterOuContinuer();
        } else if (response.equalsIgnoreCase("N")) {
            System.out.println("Au revoir !");
        } else {
            System.out.println("Veuillez saisir une réponse valide.");
            quitterOuContinuer();
        }
    }

    public static void main(String[] args) {
        System.out.println("Entrer 10 nombres entiers :");
        InteractivePlusGrand interactivePlusGrand = new InteractivePlusGrand();
        interactivePlusGrand.start();
    }

}
