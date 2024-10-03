package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        // Initialiser le minimum avec la première valeur du tableau
        int min = array[0];

        // Parcourir le tableau
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];  // Mettre à jour le minimum si un élément plus petit est trouvé
            }
        }
        // Affichage du résultat
        System.out.println("Le plus petit élément du tableau est : " + min);
    }
}
