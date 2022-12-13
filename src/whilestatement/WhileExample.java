package whilestatement;

import java.util.ArrayList;

public class WhileExample {
    public static void main(String[] args) {
        /*
        while (conditie){
        //corp de bucla
        update_counter;
        }
         */

        /*int i = 0;
        while (i < 7){
            System.out.println("I este egal cu: " +i);
            i++;
        }*/

       /*int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }*/

        double[] numere = {21.4, 43.6, 5, -15.4};

        int i = 0;
        while (i < numere.length){
            System.out.println("Indexul este " + i + ",valoarea este " + numere[i]);
            i++;
        }

        ArrayList<Double> lista = new ArrayList<>();
        lista.add(23.4);
        lista.add(-12.3);
        lista.add(9d);

        int j = 0;
        while (j < lista.size()){
            System.out.println("Indexul este " + j + ", valoarea este" + lista.get(j));
            j++;
        }
    }
}