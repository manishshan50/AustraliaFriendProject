import java.math.BigDecimal;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
public class Main {
    public static int percent = 100;    // concert the percentage into normal number we have to divide the number by 100
    public static int month_perYear= 12;  // for understanding why we using to concert the interest monthly
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("##.00");   // converting the number upto 2 decimal places
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Loan Amount: ");
        int loan_Amount = scan.nextInt();   //  Enter Loan Amount
        System.out.print("Enter Number of years: ");
        int numberOfYears = scan.nextInt(); // Enter Number of years
        scan.close();
        Locale US = new Locale("en", "US");    // to assign the dollar sign
        System.out.println("Interest Rate"+"\t\t\t"+"Monthly Payment" +"\t\t\t"+"Total Payment"+
                "\n"+ "_______________________________________________________________");
        double start_Interest= 5.000;
        for (int j = 5; j < 8 ; j++) {
            for (double i = 0; i < 9; i++) {
                double x = start_Interest + i / 8;   // increment each month point by 0.125
                double monthly_InterestRate = x / (month_perYear * percent);   // convert year interest into per month
                // calculate monthly payment
                double monthly_payment = (loan_Amount * monthly_InterestRate) / (1 - (1 / (Math.pow((1 + monthly_InterestRate), (12 * numberOfYears)))));
                // calculate total interest
                double total_Interest = monthly_payment * 12 * numberOfYears;
                //convert the interest into decimal place
                float usq= Float.parseFloat(format.format(monthly_payment));
                System.out.println(truncateDecimal(x, 3) + "%" + "\t\t\t\t\t" +
                        NumberFormat.getCurrencyInstance(Locale.US).format(usq) + "\t\t\t\t\t" +
                        NumberFormat.getCurrencyInstance(Locale.US).format(Float.parseFloat(format.format(total_Interest))));
                System.out.println("_______________________________________________________________");
            }
            start_Interest++;
        }
    }
    //   truncate Decimal is used to convert the number upto 3 decimal places..
    private static BigDecimal truncateDecimal(double x,int numberofDecimals)
    {
        if ( x > 0) {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_FLOOR);
        } else {
            return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, BigDecimal.ROUND_CEILING);
        }
    }
}