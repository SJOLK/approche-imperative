package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;

        // Tant que le nombre n'est pas entre 1 et 10
        while (nb < 1 || nb > 10) {
            System.out.print("Veuillez entrer un nombre entre 1 et 10 : ");
            nb = scanner.nextInt();

            // Vérifier si le nombre est en dehors de la plage
            if (nb < 1 || nb > 10) {
                System.out.println("Le nombre n'est pas dans la plage demandée. Essayez encore.");
            }
        }

        // Si on est ici, c'est que nb est bien entre 1 et 10
        System.out.println("Table de " + nb + " :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(nb + " * " + i + " = " + (nb * i));
        }

        scanner.close();
    }
}

