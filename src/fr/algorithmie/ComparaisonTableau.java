package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};

        // Compteur pour les éléments en commun
        int count = 0;

        // Boucle for sur chaque élément de array1
        int i = 0;
        while (i < array1.length) {
            int j = 0;
            // Boucle while sur chaque élément de array2 pour vérifier la présence de array1[i]
            while (j < array2.length) {
                if (array1[i] == array2[j]) {
                    count++;
                    break; // Sortir de la boucle si un élément commun est trouvé pour éviter les doublons
                }
                j++;
            }
            i++;
        }
        // Afficher le résultat
        System.out.println("Nombre d'éléments en commun : " + count);
    }
}
