package fr.algorithmie;

import java.util.Scanner;

public class Rotation {
    // Tableau d'entiers
    private int[] tableau;

    // Constructeur pour initialiser le tableau
    public Rotation(int[] tableau) {
        this.tableau = tableau;
    }

    // Méthode pour effectuer une rotation à droite
    public void rotationDroite() {
        if (tableau == null || tableau.length == 0) {
            System.out.println("Le tableau est vide ou non initialisé.");
            return;
        }

        // Sauvegarder le dernier élément
        int dernierElement = tableau[tableau.length - 1];

        // Déplacer tous les éléments vers la droite en utilisant une boucle for
        for (int i = tableau.length - 1; i > 0; i--) {
            tableau[i] = tableau[i - 1];
        }

        // Mettre le dernier élément au début
        tableau[0] = dernierElement;
    }

    // Méthode pour afficher le tableau
    public void afficherTableau() {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }

    // Méthode main pour tester la rotation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander la taille du tableau à l'utilisateur
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Initialiser le tableau avec la taille spécifiée
        int[] tableauInitial = new int[taille];

        // Demander à l'utilisateur de saisir chaque élément du tableau
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            System.out.print("Élément " + (i + 1) + " : ");
            tableauInitial[i] = scanner.nextInt();
        }

        // Créer une instance de la classe Rotation
        Rotation rotation = new Rotation(tableauInitial);

        // Afficher le tableau avant la rotation
        System.out.println("Tableau avant la rotation :");
        rotation.afficherTableau();

        // Effectuer une rotation à droite
        rotation.rotationDroite();

        // Afficher le tableau après la rotation
        System.out.println("Tableau après la rotation :");
        rotation.afficherTableau();
    }
}

