import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        boolean go = true; //sets up loop

        while (go) // creates loop to top//
        {
            System.out.println("Hello this is Console based Calculator");
            System.out.println("To add, type a; to subtract, type s");
            System.out.println("To multiply, type m; to divide, type d");

            Scanner sc = new Scanner(System.in); //sets up scanners
            Scanner sc1 = new Scanner(System.in);

            String action = sc.nextLine(); // tells computer to take an input

            if ("a".equals(action)) // addition
            {
                System.out.println("Please type in the first number you would like to add:");
                int sum1 = sc.nextInt();
                System.out.println("Please type in the second number you would like to add:");
                int sum2 = sc.nextInt();
                int sumresult = sum1 + sum2;
                System.out.println(sum1 + " added to " + sum2 + " equals " + sumresult);
            }

            if ("s".equals(action)) // subtraction
            {
                System.out.println("Please type in the first number you would like to subtract:");
                int sub1 = sc.nextInt();
                System.out.println("Please type in the second number you would like to subtract:");
                int sub2 = sc.nextInt();
                int subresult = sub1 - sub2;
                System.out.println(sub1 + " subtracted by " + sub2 + " equals " + subresult);
            }

            if ("m".equals(action)) // multiplication
            {
                System.out.println("Please type in the first number you would like to multiply:");
                int multi1 = sc.nextInt();
                System.out.println("Please type in the second number you would like to multiply:");
                int multi2 = sc.nextInt();
                int multiresult = multi1 * multi2;
                System.out.println(multi1 + " multiplied by " + multi2 + " equals " + multiresult);
            }

            if ("d".equals(action)) // division
            {
                System.out.println("Please type in the first number you would like to divide:");
                int div1 = sc.nextInt();
                System.out.println(" Please type in the second number you would like to divide:");
                int div2 = sc.nextInt();
                int divresult = div1 / div2;
                System.out.println(div1 + " divided by " + div2 + " equals " + divresult);
            }

            System.out.println("Would you like to start over? (yes/no)");
            String startOver = sc1.nextLine();

            if ("no".equals(startOver)) {
                go = false;
                System.out.println("Bye bye!");
            }
        }
    }
}
