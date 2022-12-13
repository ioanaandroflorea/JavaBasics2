package arrays;

public class SingleArrayExample {
    public static void main(String args[]) {
        //tip nume

        String[] studenti;
        int numere[];

        studenti = new String[10];
        numere = new int[5];

        double[] duble = new double[7];

        studenti[0] = "Mihai";
        studenti[1] = "Ana Maria";

        System.out.println(studenti[0]);
        System.out.println(studenti[1]);
        System.out.println(studenti[2]);
        System.out.println(studenti[10]);

        System.out.println(numere[0]);

        //Array literal
        String[] literal = {"Alexandru", "mere", "masa"};
        System.out.println(literal[0]);
        System.out.println(literal[2]);
        System.out.println(literal[5]);
    }
}
/*
//Java Program to illustrate how to declare, instantiate, initialize
//and traverse the Java array.
class SingleArrayExample {
    public static void main(String args[]) {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;//initialization
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;

        String[] nume = {"Ana", "Bogdan", "gigel"};
        System.out.println(nume);
    }


//traversing array
      /*  for (int i = 0; i < a.length; i++)//length is the property of array
            System.out.println(a[i]);

        for (String name : nume) System.out.println(name);*/

