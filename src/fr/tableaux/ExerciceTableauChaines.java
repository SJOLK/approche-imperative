package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = {"Montpellier", "Lyon", "Marseille", "Paris", "Nice"};
        System.out.println("\nLes 5 villes initiales du tableau :");
        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }
        System.out.println("\nLa longueur du tableau est : " + villes.length);
        villes[3] = "Reims";
        System.out.println("\nLes 5 villes du tableau après modification :");
        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }
    }
}

