package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tableau = {8, -7, 12, 1, -2, 14, 17, 9};
        System.out.println("Élément d'index 0 du tableau est : " + tableau[0]);
        System.out.println("La longueur du tableau est : " + tableau.length);
        System.out.println("Élément au dernier index : " + tableau[tableau.length - 1]);
        try {
            System.out.println("Élément à l'index 10 : " + tableau[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}