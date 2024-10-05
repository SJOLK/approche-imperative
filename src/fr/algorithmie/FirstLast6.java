package fr.algorithmie;
import java.util.Scanner;

public class FirstLast6 {
    private int[] numbers; // Déclaration du tableau d'entiers
    private boolean isFirstOrLast6; // Variable booléenne

    // Constructeur qui initialise le tableau
    public FirstLast6(int[] numbers) {
        this.numbers = numbers;
        this.isFirstOrLast6 = checkFirstLast6(); // Appelle la méthode pour vérifier
    }

    // Méthode pour vérifier si le premier ou le dernier élément est 6
    private boolean checkFirstLast6() {
        // Vérifie si le tableau a au moins un élément
        if (numbers.length == 0) return false;

        // Utilise une boucle for pour vérifier le premier et le dernier élément
        for (int i = 0; i < 1; i++) {
            if (numbers[i] == 6 || numbers[numbers.length - 1] == 6) {
                return true;
            }
        }
        return false; // Retourne false si aucune condition n'est remplie
    }

    // Méthode pour obtenir la valeur de isFirstOrLast6
    public boolean isFirstOrLast6() {
        return isFirstOrLast6;
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

        // Crée une instance de FirstLast6 avec le tableau entré par l'utilisateur
        FirstLast6 test = new FirstLast6(numbers);
        System.out.println("Le premier ou le dernier élément est 6: " + test.isFirstOrLast6()); // Affiche le résultat

        scanner.close(); // Ferme le scanner
    }
}
