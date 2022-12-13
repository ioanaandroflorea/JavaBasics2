package collections;

import java.util.ArrayList;

public class ArrayListExample {
        public static void main(String args[]) {
            ArrayList<String> list = new ArrayList<String>();//Creating arraylist
            list.add("Mango");//Adding object in arraylist
            list.add("Apple");
            list.add("Banana");
            list.add("Grapes");
            //Printing the arraylist object
            System.out.println(list);
            System.out.println(list.get(2));
        }
    }
//traversing array
        /*for (int i = 0; i < b.length; i++)//length is the property of array
        System.out.println(b[i]);

        for (String name : nume) {
        System.out.println(name);
        }
        for (String fruct : list) {
        System.out.println(fruct);
        }

        for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
        }*/
