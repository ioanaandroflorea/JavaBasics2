package ifstatement;

public class IfElseExample {
        public static void main(String[] args) {
            //defining an 'age' variable
            int age=20;
            //checking the age
            if(age>31){
                System.out.print("Age is greater than 18");
            }else {
                System.out.println("Age is smaller.");
            }

            int numar = (age>31) ? 32 : 28;
            System.out.println(numar);

        }
    }
