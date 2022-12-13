package collections;

import java.util.ArrayList;

public class Colections {
    public static void main(String args[]) {
        String[] studenti = new String[10];
        studenti[0] = "Mihai";
        studenti[1] = "Alex";
 //  //     System.out.println(studenti[0]);
 //  //    System.out.println(studenti[2]);

        String[] fructe = {"mere", "pere", "banane"};

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> inturi = new ArrayList<>();

        list.add("mere");
        list.add("pere");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        list.set(0,"banane");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

        list.add("ananas");
        list.add("avocado");

        System.out.println(list.size());

        list.clear();
        System.out.println("Dupa clear");
        System.out.println(list);
        System.out.println(list.size());

    }
}
