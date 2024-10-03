package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        //Utiliser une boucle for pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("Nombres de 1 à 10 avec boucle for :");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        //Utiliser une boucle for pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.println("\nNombres pairs entre 0 et 10 avec boucle for :");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        //Utiliser une boucle for pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("\nNombres impairs entre 0 et 9 avec boucle for :");
        for (int i = 1; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        //Utiliser une boucle while pour afficher tous les nombres de 1 à 10 inclus
        System.out.println("\nNombres de 1 à 10 avec boucle while :");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        //Utiliser une boucle while pour afficher tous les nombres pairs entre 0 et 10 inclus
        System.out.println("\nNombres pairs entre 0 et 10 avec boucle while :");
        int j = 0;
        while (j <= 10) {
            System.out.print(j + " ");
            j += 2;
        }
        //Utiliser une boucle while pour afficher tous les nombres impairs entre 0 et 9 inclus
        System.out.println("\nNombres impairs entre 0 et 9 avec boucle while :");
        int k = 1;
        while (k < 10) {
            System.out.print(k + " ");
            k += 2;
        }
    }
}
