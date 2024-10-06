package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    private int[] tab = new int[10];
    private void affichageMenuParDefaut() {
        System.out.println("1. Ajouter un nombre");
        System.out.println("2. Afficher les nombres existants");
        System.out.println("3. Quitter");
    }

    private void start() {
        affichageMenuParDefaut();
        int choix = 0;
        while (choix != 5) {
            choix = demandeChoixUtilisateur();
            switch (choix) {
                case 1:
                    stockerNombre(demandeNombreUtilisateur());
                    break;
                case 2:
                    afficherNombres();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Veuillez saisir un choix valide.");
                    break;
            }
        }
    }

    private int demandeNombreUtilisateur() {
        System.out.println("Veuillez saisir un nombre : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Veuillez saisir un nombre valide.");
            return demandeNombreUtilisateur();
        }
    }

    private void afficherNombres() {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] != 0) {
                System.out.println(tab[i]);
            }
        }
    }

    private int demandeChoixUtilisateur() {
        System.out.println("Veuillez saisir un choix : ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            return sc.nextInt();
        } else {
            System.out.println("Veuillez saisir un choix valide.");
            return demandeChoixUtilisateur();
        }
    }

    private void stockerNombre(int nb) {
        agrandirTableauSiPlein();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                tab[i] = nb;
                break;
            }
        }
    }

    private void agrandirTableauSiPlein() {
        if (tab[tab.length - 1] != 0) {
            int[] newTab = new int[tab.length * 2];
            for (int i = 0; i < tab.length; i++) {
                newTab[i] = tab[i];
            }
            tab = newTab;
        }
    }

    public static void main(String[] args) {
        InteractifStockageNombre interactifStockageNombre = new InteractifStockageNombre();
        interactifStockageNombre.start();
    }
}
