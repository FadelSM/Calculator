import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*
       Mortgage Calculator
    - CONSTANTS Include: Months in a year & Percentage

    STEP 1 - Create a Scanner object
    Step 2 - Create a label for the Principal amount
    Step 3 - Use a scanner method to get what user inputs
     and store it in a variable called principal
    Step 4 - Create a label for the annual interest rate
    Step 5 - Get user input and store in a variable called annual interest rate
    Step 6 - Calculate monthly interest rate & store in a variable
    called monthly interest
            - how to calculate monthly rate = annual interest/PERCENT/MONTHS IN YRS
    Step 7 - Label for years (Period(Years))
           - read user input and & store in a variable called years
    Step 8 - Close scanner when done
         STEP 1 - CONSTANTS
    */
                final int MONTHS_IN_YEAR = 12;
                final int PERCENTAGE = 100;

                Scanner scanner = new Scanner(System.in);// scanner object


                double principal; // global scope variable declaration

                while(true) {
                    System.out.print("Principal ($1K - $1M): ");//principal label
                    principal = scanner.nextDouble(); // read user input & store
                    if (principal >= 1000 && principal <= 1_000_000)
                        break;
                    System.out.println("Principal must be between 1000 and 1_000_000");

                }
                // Annual Interest

                double annualInterest; // variable declaration
                while(true) {
                    System.out.print("Annual Interest Rate (1 - 30): ");// A.I.R label
                    annualInterest = scanner.nextDouble();// read user input & store
                    if (annualInterest >= 1 && annualInterest <= 30)
                        break;
                    System.out.println("Annual Interest must be between 1 and 30");

                }
                 // YEARS

                 int years; // variable declaration
                 while (true) {
                     System.out.print("Period (Years): ");
                     years = scanner.nextInt();
                     if (years >= 1 && years <= 30)
                         break;
                 System.out.println("Period must be between 1 and 30 years");
                }

                 // calculate monthly interest
                 double monthlyInterest = annualInterest / PERCENTAGE / MONTHS_IN_YEAR;

                 //calculate no of payments
                 int numberOfPayments = years * MONTHS_IN_YEAR;

                 //calculate mortgage
                 double mortgage = principal *
                     (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                         (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

                 // format mortgage value as a currency

                 String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
                 System.out.println("Mortgage: " + mortgageFormatted);

                 // close scanner
                  scanner.close();
    }




            }
