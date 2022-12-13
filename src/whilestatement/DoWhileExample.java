package whilestatement;

import java.util.ArrayList;

public class DoWhileExample {
    /*public static void main(String[] args) {
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);*/

    public static void main(String[] args) {
       /* do(){
            //corp de bucla
        update.counter;
        }while(conditie)*/

        double[] numere = {21.4, 43.6, 5, -15.4};
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(23);
        lista.add(-12);
        lista.add(9);

        double sumaArray = 0;
        int i = 0;
        do {
            sumaArray = sumaArray + numere[i];
            i++;
        }while (i< numere.length);
        System.out.println("Suma este egala cu " + sumaArray);

        Integer sumaArrayList = 0;
        int j = 0;
        do {
            sumaArrayList = sumaArrayList + lista.get(j);
            j++;
        }while (j < lista.size());
        System.out.println("Suma elementelor din ArrayList este:" + sumaArrayList);
    }
}
