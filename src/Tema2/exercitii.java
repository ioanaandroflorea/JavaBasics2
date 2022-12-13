package Tema2;

import java.util.ArrayList;

public class exercitii {

    //Exercitiul3
    public static void main(String[] args){
        int[][] myNum = {
                {2, 3, 4},
                {5, 6, 7, 8, 9}
        };
        System.out.println(myNum[0][0]);
        System.out.println(myNum[1][0]);
        System.out.println(myNum[0][2]);
        System.out.println(myNum[1][4]);
    }

    //Exercitiul4
    static void exercitiul4() {
        char[] caractere = {'a', 'b', 'c', 'd', 'e', 'f'};
        for (int i = 1; i < caractere.length; i += 2) {
            System.out.println(caractere[i]);
        }
    }

    //Exercitiul5
    static void exercitiul5() {
        double[] zecimale = {12.3, 24.5, 36.5, 45.8, 28.9};
        for (int i = 0; i < zecimale.length; i++){
            if (zecimale[i] == 4.5){
                System.out.println(zecimale[i]);
            }
            if (zecimale[i] > 5) {
                System.out.println("Element peste 5");
            }
        }
    }


    //Exercitiul 7 - Definiti o lista de Integer,
    // de 5 elemente.
    // Calculati suma tuturor elementelor.
    static void exercitiul7() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(18);
        lista.add(23);
        lista.add(32);
        lista.add(33);
        lista.add(14);
        System.out.println("Suma tuturor elementelor este: " + (lista.get(0) + lista.get(1) + lista.get(2) + lista.get(3) + lista.get(4)));


    }
}


