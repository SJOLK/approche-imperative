package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        // Déclaration des deux tableaux
        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};
        // Création du tableau pour la somme
        int[] tableauSomme = new int[tableau1.length];
        // Calcul de la somme des éléments des deux tableaux
        for (int i = 0; i < tableau1.length; i++) {
            tableauSomme[i] = tableau1[i] + tableau2[i];
        }
        // Affichage du résultat
        System.out.println("Tableau de la somme :");
        for (int value : tableauSomme) {
            System.out.print(value + " ");
        }
    }
}
