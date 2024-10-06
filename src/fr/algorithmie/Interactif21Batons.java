package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int batons = 21;

        System.out.println("Bienvenue au jeu des 21 bâtons !");
        System.out.println("Règle : Prenez 1, 2 ou 3 bâtons à chaque tour.");
        System.out.println("Celui qui prend le dernier bâton perd la partie.");

        while (batons > 0) {
            // Tour du joueur
            System.out.println("\nIl reste " + batons + " bâtons.");
            System.out.print("Combien de bâtons voulez-vous prendre (1, 2 ou 3) ? ");
            int joueurPrend = scanner.nextInt();

            // Validation de l'entrée du joueur
            while (joueurPrend < 1 || joueurPrend > 3 || joueurPrend > batons) {
                System.out.print("Entrée invalide. Veuillez prendre 1, 2 ou 3 bâtons (ou moins si moins de bâtons restent) : ");
                joueurPrend = scanner.nextInt();
            }

            batons -= joueurPrend;

            // Vérifier si le joueur a perdu
            if (batons == 0) {
                System.out.println("Vous avez pris le dernier bâton. Vous avez perdu !");
                break;
            }

            // Tour de l'ordinateur
            int ordinateurPrend = Math.min(batons, random.nextInt(3) + 1);
            System.out.println("L'ordinateur prend " + ordinateurPrend + " bâton(s).");

            batons -= ordinateurPrend;

            // Vérifier si l'ordinateur a perdu
            if (batons == 0) {
                System.out.println("L'ordinateur a pris le dernier bâton. L'ordinateur a perdu, vous avez gagné !");
                break;
            }
        }

        scanner.close();
    }
}

