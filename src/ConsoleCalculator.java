import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        boolean go = true; //sets up loop

        while (go) // creates loop to top//
            {
                System.out.println("Hello this is Console based Calculator");
                System.out.println("To add, type a; to subtract, type s");
                System.out.println("To multiply, type m; to divide, type d");

                Scanner sc1 = new Scanner (System.in); //sets up scanners
                Scanner sc2 = new Scanner (System.in);

                String action = sc1.nextLine (); // tells computer to take an input

                if ("a".equals (action)) // addition
                {
                    System.out.println("Please type in the first number you would like to add:");
                    int sum1 = sc1.nextInt ();
                    System.out.println("Please type in the second number you would like to add:");
                    int sum2 = sc1.nextInt();
                    int sumresult = sum1 + sum2;
                    System.out.println(sum1 + " added to " + sum2 + " equals " + sumresult);
                }

                if ("s".equals (action)) // subtraction
                {
                    System.out.println("Please type in the first number you would like to subtract:");
                    int sub1 = sc1.nextInt();
                    System.out.println("Please type in the second number you would like to subtract:");
                    int sub2 = sc1.nextInt();
                    int subresult = sub1 - sub2;
                    System.out.println(sub1 + " subtracted by " + sub2 + " equals " + subresult);
                }



        }
    }
}
