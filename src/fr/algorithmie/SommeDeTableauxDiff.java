package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] tableau1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tableau2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        // Taille du tableau résultat : la taille du plus grand tableau
        int maxLength = Math.max(tableau1.length, tableau2.length);
        // Création du tableau pour contenir la somme
        int[] tableauSomme = new int[maxLength];
        // Boucle pour remplir le tableau de la somme
        for (int i = 0; i < maxLength; i++) {
            int valeur1 = 0;
            int valeur2 = 0;
            if (i < tableau1.length) {
                valeur1 = tableau1[i]; // Prendre la valeur de tableau1 si l'indice est valide
            }
            if (i < tableau2.length) {
                valeur2 = tableau2[i]; // Prendre la valeur de tableau2 si l'indice est valide
            }
            tableauSomme[i] = valeur1 + valeur2; // Somme des deux valeurs
        }
        // Afficher le tableau de la somme
        System.out.print("Tableau de la somme : \n");
        for (int valeur : tableauSomme) {
            System.out.print(valeur + " ");
        }
    }
}
