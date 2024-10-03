package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Calcul de la somme des éléments du tableau
        int somme = 0;
        for (int i = 0; i < array.length; i++) {
            somme += array[i];
        }
        // Calcul de la moyenne des éléments du tableau
        double moyenne = (double) somme / array.length;
        // Affichage du résultat
        System.out.println("La moyenne des éléments du tableau est : " + moyenne);
    }
}
