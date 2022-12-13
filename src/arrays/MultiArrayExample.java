package arrays;

class MultiArrayExample {
    public static void main(String args[]) {
        String[][] bidimensional = new String[3][6];
        String[][][] tridimensional = new String[2][3][1];

        bidimensional[0][0] = "curs";
        bidimensional[2][1] = "capitol";

        System.out.println(bidimensional[0][0]);
        System.out.println(bidimensional[2][1]);
        System.out.println(bidimensional[3][6]);

       /* String [][] multidimensional = {
                {"Laptop" , "masa"}
                {"tastatura"}};
        System.out.println(multidimensional[0][0]);
        System.out.println(multidimensional[0][1]);
        System.out.println(multidimensional[1][0]);*/



                }
}
/*//Java Program to illustrate the use of multidimensional array
class MultiArrayExample {
    public static void main(String args[]) {
//declaring and initializing 2D array
        int arr[][] = {{1, 2, 3},
                       {2, 4, 5},
                       {4, 4, 5}};
//printing 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/
