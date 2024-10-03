package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String[] args){
        //TESTEZ LES OPERATEURS && ET ||
        int a = 10;
        int b = 20;
        boolean testEt = a>0 && b<10;
        System.out.println(testEt);
        boolean testOu = a>0 || b<10;
        System.out.println(testOu);
        //TESTEZ LES OPERATEURS COMBINES
        a=a+1;
        System.out.println(a);
        a++;
        System.out.println(a);
        a+=1;
        System.out.println(a);
        //TESTEZ L’OPERATEUR TERNAIRE
        String c = a>0 ? "a est plus grand que 0": "a est inférieur à 0";
        System.out.println(c);
    }
}
