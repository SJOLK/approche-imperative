package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

    private void start() {
        affichageParDefaut();
        int nbADeviner = genererNombreAleatoire();
        int nb = 0;
        while (nb != nbADeviner) {
            nb = demandeNombreUtilisateur();
            verifierNombre(nb, nbADeviner);
        }
    }

    private void affichageParDefaut() {
        System.out.println("*************************** Le nombre à deviner est compris entre 1 et 100 inclus ***************************");
    }

    private int demandeNombreUtilisateur() {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Veuillez saisir un nombre entier : ");
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Veuillez saisir un nombre entier valide.");
            return demandeNombreUtilisateur();
        }
    }

    private void verifierNombre(int nb, int nbADeviner) {
        if (nb < nbADeviner) {
            System.out.println("C'est plus !");
        } else if (nb > nbADeviner) {
            System.out.println("C'est moins !");
        } else {
            System.out.println("Bravo, vous avez trouvé le nombre à deviner !");
        }
    }

    private int genererNombreAleatoire() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        InteractifPlusMoins interactifPlusMoins = new InteractifPlusMoins();
        interactifPlusMoins.start();
    }


}
