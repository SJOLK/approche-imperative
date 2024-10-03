package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        //Affichez tous les nombres de 1 à 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        //Affichez 20 fois votre nom et votre prénom
        String nom = "RHANBOURI Omar";
        for (int i = 1; i <= 20; i++) {
            System.out.println(nom);
        }
        //Affichez les éléments pairs de 2 à 100
        System.out.println("\nLes éléments pairs de 2 à 100:");
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        //Affichez les éléments impairs de 1 à 99
        System.out.println("\n \nLes éléments impairs de 1 à 99:");
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    }
}
