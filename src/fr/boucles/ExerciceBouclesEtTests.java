package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //Afficher l’ensemble des éléments du tableau grâce à une boucle
        System.out.println("L’ensemble des éléments du tableau:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        //Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        System.out.println("L’ensemble des éléments dans l’ordre inverse:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");

        //Afficher seulement les entiers supérieurs à 3
        System.out.println("Les entiers supérieurs à 3:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 3) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");

        //Afficher seulement les entiers pairs
        System.out.println("Les entiers pairs:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");

        //Afficher les valeurs des index pairs
        System.out.println("Les valeurs des index pairs:");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");

        //Afficher seulement les entiers impairs
        System.out.println("Les entiers impairs:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("\n");
    }
}
