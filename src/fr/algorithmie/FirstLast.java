package fr.algorithmie;

import java.util.Scanner;

public class FirstLast {
    private int[] numbers; // Déclaration du tableau d'entiers
    private boolean isFirstEqualLast; // Variable booléenne

    // Constructeur qui initialise le tableau et calcule la valeur booléenne
    public FirstLast(int[] numbers) {
        this.numbers = numbers;
        this.isFirstEqualLast = (numbers.length >= 1) && (numbers[0] == numbers[numbers.length - 1]);
    }

    // Méthode pour obtenir la valeur de isFirstEqualLast
    public boolean isFirstEqualLast() {
        return isFirstEqualLast;
    }

    // Méthode principale pour tester la classe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crée un scanner pour l'entrée utilisateur

        // Demande à l'utilisateur combien de nombres il souhaite entrer
        System.out.print("Entrez le nombre d'éléments dans le tableau: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size]; // Crée un tableau d'entiers de la taille spécifiée

        // Demande à l'utilisateur d'entrer les éléments du tableau
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < size; i++) {
            System.out.print("Élément " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt(); // Lit chaque nombre entré par l'utilisateur
        }

        // Crée une instance de FirstLast avec le tableau entré par l'utilisateur
        FirstLast test = new FirstLast(numbers);
        System.out.println("Le premier et le dernier élément sont égaux: " + test.isFirstEqualLast()); // Affiche le résultat

        scanner.close(); // Ferme le scanner
    }
}
