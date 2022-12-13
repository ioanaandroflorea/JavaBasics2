package forloopstatement;

import java.util.ArrayList;

public class BuclaFor {

    public static void main(String args[]) {
    /*
    for(initializare; conditie; incrementare/decremenatre}
    {corp bucla}
     */

//        for (int i = 0; i < 4; i++){
//            System.out.println("Valoarea variabilei i este: +i");
//     }

        Integer[] numere = {21, 3, 4, 65, 34};
//        for (int i = 0; i < numere.length; i++ ){
//        System.out.println("Elementul " + i + "este egal cu" + numere[i]);
//     }

        //for-each

        for (Integer numar : numere) {
            System.out.println("Valoarea elementului " + numar);
        }

        ArrayList<String> list = new ArrayList<>();
        list.add("mere");
        list.add("pere");
        list.add("prune");
        list.add("lamaie");

        for (String element : list){
            System.out.println("Valoarea elementului din ArrayList este: " + element);
        }

    }
}